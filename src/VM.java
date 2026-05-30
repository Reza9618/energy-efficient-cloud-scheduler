public class VM {

    int id;
    int cpuCapacity;
    int power;
    public int currentLoad;

    public VM(int id, int cpuCapacity, int power) {
        this.id = id;
        this.cpuCapacity = cpuCapacity;
        this.power = power;
        this.currentLoad = 0;
    }

    public void assignTask(Task task) {
        currentLoad += task.length;
        System.out.println("Task " + task.id + " assigned to VM " + id);
    }

    public double getUtilization() {
        return (double) currentLoad / cpuCapacity;
    }

    // 🔥 NEW: Energy model
    public double getEnergy() {

        double utilization = getUtilization();

        double idlePower = power * 0.6;
        double maxPower = power;

        return idlePower + (maxPower - idlePower) * utilization;
    }
    public double getTotalEnergyConsumed() {
        return getEnergy() * currentLoad;
    }
    public void printStatus() {

        System.out.println("VM " + id);
        System.out.println("Load: " + currentLoad);
        System.out.println("Utilization: " + getUtilization());
        System.out.println("Estimated Power: " + getEnergy());
        System.out.println("-------------------");
    }
}