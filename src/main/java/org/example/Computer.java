package org.example;

public class Computer {
    private Motherboard motherboard;
    private Cpu cpu;
    private Ram ram;
    private Ssd ssd;

    public Computer(Motherboard motherboard, Cpu cpu, Ram ram, Ssd ssd) {
        this.motherboard = motherboard;
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Ssd getSsd() {
        return ssd;
    }

    public void setSsd(Ssd ssd) {
        this.ssd = ssd;
    }

    public int getPrice(){
        return motherboard.getPrice()+cpu.getPrice()+ram.getPrice()+ssd.getPrice();
    }
}
