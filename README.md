# Energy-Efficient Cloud Scheduler

## 📌 Project Overview

This project presents a cloud computing task scheduling simulation implemented in Java. The system evaluates a custom Energy-Aware Scheduling algorithm and compares its performance against the traditional Round Robin scheduling approach.

The scheduler assigns tasks to Virtual Machines (VMs) based on workload and energy-related considerations, with the goal of improving resource utilization in cloud environments.

This project was developed as a simulation study in the field of cloud computing and resource management.

---

## 🎯 Objectives

The main objectives of this project are:

* Reduce overall energy consumption in cloud environments
* Improve resource utilization across virtual machines
* Achieve better load balancing
* Reduce task completion time (makespan)
* Compare the proposed approach with Round Robin scheduling

---

## 🏗️ System Architecture

The simulation consists of:

### Virtual Machines (VMs)

Each VM is characterized by:

* Processing capacity
* Current workload
* Power consumption

### Tasks

Each task contains:

* Task ID
* Computational workload

### Scheduling Algorithms

#### Energy-Aware Scheduler

* Considers VM workload and energy-related factors
* Selects the most suitable VM for task execution
* Attempts to optimize resource allocation

#### Round Robin Scheduler

* Assigns tasks cyclically
* Does not consider workload or energy metrics
* Serves as a baseline scheduling strategy

---

## 📂 Project Structure

```text
src/
├── Main.java
├── VM.java
├── Task.java
├── Scheduler.java
├── RoundRobinScheduler.java
├── Metrics.java
└── CSVExporter.java

results.csv
README.md
```

---

## ▶️ Running the Simulation

1. Open the project in IntelliJ IDEA.
2. Ensure Java JDK 21 (or later) is configured.
3. Run `Main.java`.
4. The simulation will:

    * Create virtual machines
    * Generate tasks
    * Execute both scheduling algorithms
    * Calculate performance metrics
    * Export results to `results.csv`

---

## 📊 Results

The simulation was executed using three virtual machines and ten independent tasks.

### Performance Metrics

| Algorithm    | Total Energy | Total Load | Makespan |
| ------------ | ------------ | ---------- | -------- |
| Round Robin  | 868,575.00   | 3,750      | 1,500    |
| Energy Aware | 871,533.33   | 3,750      | 1,550    |

### Analysis

The experiment compares the performance of a traditional Round Robin scheduler against a custom Energy-Aware scheduler.

Observations:

* Both algorithms processed the same workload.
* The Energy-Aware scheduler distributed tasks according to VM characteristics.
* Round Robin achieved a slightly lower makespan in this simulation.
* Energy consumption was similar for both approaches.
* The results demonstrate that scheduling performance depends heavily on workload characteristics and system configuration.

These findings provide a foundation for further optimization and experimentation with more advanced scheduling strategies.

---

## 📈 Generated Output

The program exports results in CSV format:

```csv
Algorithm,TotalEnergy,TotalLoad,Makespan
RoundRobin,868575.0,3750,1500
EnergyAware,871533.3333333333,3750,1550
```

The CSV file can be used for visualization and performance analysis using Python.

---

## 🚀 Future Work

Potential improvements include:

* Dynamic VM scaling
* Machine learning-based scheduling
* Predictive workload management
* Multi-objective optimization
* Integration with CloudSim
* Evaluation on larger cloud infrastructures
* Comparison with Min-Min and Max-Min scheduling algorithms

---

## 🛠️ Technologies Used

* Java
* IntelliJ IDEA
* CSV Export
* Python (for graph generation and visualization)

---

## 📚 Research Context

This project was developed as part of a study on cloud resource management and scheduling optimization. It explores how scheduling decisions influence system performance, resource utilization, and energy consumption in cloud computing environments.

---

## 👤 Author

Ahmadreza Hadipour

Bachelor of Computer Engineering

Azad University, Khorasgan (Isfahan) Branch
