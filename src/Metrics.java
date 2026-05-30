import java.util.List;

public class Metrics {

    // =========================
    // TOTAL ENERGY
    // =========================
    public static double totalEnergy(List<VM> vmList) {

        double total = 0;

        for (VM vm : vmList) {
            total += vm.getTotalEnergyConsumed();
        }

        return total;
    }

    // =========================
    // TOTAL LOAD
    // =========================
    public static int totalLoad(List<VM> vmList) {

        int load = 0;

        for (VM vm : vmList) {
            load += vm.currentLoad;
        }

        return load;
    }

    // =========================
    // MAKESPAN (MAX VM LOAD)
    // =========================
    public static int makespan(List<VM> vmList) {

        int max = 0;

        for (VM vm : vmList) {
            if (vm.currentLoad > max) {
                max = vm.currentLoad;
            }
        }

        return max;
    }
}

