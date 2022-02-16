package ru.job4j.oop;

public class Computer {

    private  boolean multiMonitor;

    private  int ssd;

    private  String cpu;

    public Computer() {

    }

    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public void printInfo() {
        System.out.println("Несколько мониторов: " + multiMonitor);
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("CPU: " + cpu);
    }

    public static void main(String[] args) {
        Computer computer = new Computer(true, 500, "Intel");
        Computer comp = new Computer();
        computer.printInfo();
        comp.printInfo();
    }
}
