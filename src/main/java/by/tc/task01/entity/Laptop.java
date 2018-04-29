package by.tc.task01.entity;


import java.util.Map;

public class Laptop extends Appliance{
    private static final String BATTERY_CAPACITY = "BATTERY_CAPACITY";
    private static final String OS = "OS";
    private static final String MEMORY_ROM = "MEMORY_ROM";
    private static final String SYSTEM_MEMORY = "SYSTEM_MEMORY";
    private static final String CPU = "CPU";
    private static final String DISPLAY_INCHS = "DISPLAY_INCHS";

    private float batteryCapacity;
    private String os;
    private int memoryRom;
    private int systemMemory;
    private float cpu;
    private float displayInches;

    public Laptop() {

    }

    public Laptop(Map<String, Object> options) {
        setBatteryCapacity(Float.parseFloat((String) options.get(BATTERY_CAPACITY)));
        setOs((String) options.get(OS));
        setMemoryRom(Integer.parseInt((String) options.get(MEMORY_ROM)));
        setSystemMemory(Integer.parseInt((String) options.get(SYSTEM_MEMORY)));
        setCpu(Float.parseFloat((String) options.get(CPU)));
        setDisplayInches(Float.parseFloat((String) options.get(DISPLAY_INCHS)));
    }

    public float getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(float batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public float getCpu() {
        return cpu;
    }

    public void setCpu(float cpu) {
        this.cpu = cpu;
    }

    public float getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(float displayInches) {
        this.displayInches = displayInches;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getCategory())
                .append(": ")
                .append(BATTERY_CAPACITY).append("=").append(batteryCapacity).append(" ")
                .append(OS).append("=").append(os).append(" ")
                .append(MEMORY_ROM).append("=").append(memoryRom).append(" ")
                .append(SYSTEM_MEMORY).append("=").append(systemMemory).append(" ")
                .append(CPU).append("=").append(cpu).append(" ")
                .append(DISPLAY_INCHS).append("=").append(displayInches);
        return builder.toString();
    }
}
