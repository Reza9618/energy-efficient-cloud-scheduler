import java.util.List;

public class RoundRobinScheduler {

    private int lastIndex = -1;

    public VM getNextVM(List<VM> vmList) {

        lastIndex = (lastIndex + 1) % vmList.size();

        return vmList.get(lastIndex);
    }

    public void assignTask(Task task, List<VM> vmList) {

        VM vm = getNextVM(vmList);

        vm.assignTask(task);
    }
}

