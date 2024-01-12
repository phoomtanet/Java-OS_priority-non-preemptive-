package projeck;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author JP
 */
public class Model {

    private int indexStatus = 0;
    private String status[] = {"New", "Ready", "Running", "Waitting", "Terminate"};
    private int processID, arrivalTime, burstTime , waittingTime, priority , memory;

   

    public Model(int processID, int priority, int arrivalTime, int burstTime, int waittingTime, int indexStatus ,int memory) {

        this.processID = processID;
        this.priority = priority;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.waittingTime = waittingTime;
        this.indexStatus = indexStatus;
        this.memory = memory;

    }

    public int getProcessID() {
        return processID;
    }

    public void setProcessID(int processID) {
        this.processID = processID;
    }


    public String getStatus() {
        return status[indexStatus];
    }

    public void setStatus(int index) {
        this.indexStatus = index;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public void setBurstTime(int burstTime) {
        this.burstTime = burstTime;
    }

    public int getWaittingTime() {
        return waittingTime;
    }

    public void setWaittingTime(int waittingTime) {
        this.waittingTime = waittingTime;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    
    
    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
