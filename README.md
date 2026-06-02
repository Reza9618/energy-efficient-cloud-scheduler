# Energy and Load-Aware Hybrid Scheduling for Efficient Resource Management in Cloud Computing

## 📌 Project Overview

This project implements a cloud computing task scheduling simulation using Java.  
It compares a custom energy-aware scheduling algorithm with Round Robin scheduling.

The goal is to improve:
- Energy efficiency
- Load balancing
- Task execution time

---

## 🎯 Objectives

- Reduce energy consumption
- Improve load balancing
- Reduce makespan
- Compare with Round Robin

---

## 🧠 Algorithms

### Proposed Scheduler
- Uses system load + energy awareness
- Chooses best VM for each task

### Round Robin Scheduler
- Simple cyclic assignment
- No optimization

---

## 📁 Output

The program generates:
Algorithm,TotalEnergy,TotalLoad,Makespan
RoundRobin,868575.0,3750,1500
EnergyAware,871533.3333333333,3750,1550
