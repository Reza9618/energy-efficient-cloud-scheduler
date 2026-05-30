import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // =========================
        // CREATE VMs
        // =========================
        VM vm1 = new VM(1, 1000, 200);
        VM vm2 = new VM(2, 1200, 250);
        VM vm3 = new VM(3, 800, 180);

        List<VM> vmList1 = new ArrayList<>();
        vmList1.add(vm1);
        vmList1.add(vm2);
        vmList1.add(vm3);

        List<VM> vmList2 = new ArrayList<>();
        vmList2.add(new VM(1, 1000, 200));
        vmList2.add(new VM(2, 1200, 250));
        vmList2.add(new VM(3, 800, 180));

        // =========================
        // CREATE TASKS
        // =========================
        List<Task> tasks = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            tasks.add(new Task(i, 100 + (i * 50)));
        }

        // =========================
        // ROUND ROBIN TEST
        // =========================
        RoundRobinScheduler rr = new RoundRobinScheduler();

        System.out.println("\n===== ROUND ROBIN =====");

        for (Task t : tasks) {
            rr.assignTask(t, vmList1);
        }

        // =========================
        // ENERGY-AWARE TEST
        // =========================
        Scheduler energyScheduler = new Scheduler();

        System.out.println("\n===== ENERGY AWARE =====");

        for (Task t : tasks) {
            energyScheduler.assignTask(t, vmList2);
        }

        // =========================
        // RESULTS
        // =========================

        System.out.println("\n===== FINAL VM STATUS (ROUND ROBIN) =====");
        for (VM vm : vmList1) {
            vm.printStatus();
        }

        System.out.println("\n===== FINAL VM STATUS (ENERGY AWARE) =====");
        for (VM vm : vmList2) {
            vm.printStatus();
        }

        System.out.println("\n==============================");
        System.out.println("         FINAL RESULTS        ");
        System.out.println("==============================");

// ================= ROUND ROBIN =================
        System.out.println("\n--- ROUND ROBIN RESULTS ---");
        System.out.println("Total Energy: " + Metrics.totalEnergy(vmList1));
        System.out.println("Total Load: " + Metrics.totalLoad(vmList1));
        System.out.println("Makespan: " + Metrics.makespan(vmList1));

// ================= ENERGY AWARE =================
        System.out.println("\n--- ENERGY AWARE RESULTS ---");
        System.out.println("Total Energy: " + Metrics.totalEnergy(vmList2));
        System.out.println("Total Load: " + Metrics.totalLoad(vmList2));
        System.out.println("Makespan: " + Metrics.makespan(vmList2));

        CSVExporter.exportResults(vmList1, vmList2);
    }


}