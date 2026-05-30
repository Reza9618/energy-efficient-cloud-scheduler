import java.util.List;

public class Scheduler {

    public VM findBestVM(List<VM> vmList) {

        VM bestVM = null;
        double bestScore = Double.MAX_VALUE;

        for (VM vm : vmList) {

            double utilization = vm.getUtilization();

            double energy = vm.getEnergy();

            // 🔥 combined score (research idea)
            double score = utilization + energy;

            if (score < bestScore) {
                bestScore = score;
                bestVM = vm;
            }
        }

        return bestVM;
    }

    public void assignTask(Task task, List<VM> vmList) {

        VM vm = findBestVM(vmList);

        vm.assignTask(task);
    }
}