package by.tc.task01.entity;

import java.util.Map;

public class TabletPC extends Appliance{
    private static final String BATTERY_CAPACITY = "BATTERY_CAPACITY";
    private static final String DISPLAY_INCHS = "DISPLAY_INCHS";
    private static final String MEMORY_ROM = "MEMORY_ROM";
    private static final String FLASH_MEMORY_CAPACITY = "FLASH_MEMORY_CAPACITY";
    private static final String COLOR = "COLOR";

    private float batteryCapacity;
    private float displayInches;
    private float memoryRom;
    private float flashMemoryCapacity;
    private String color;

    public TabletPC() {

    }

    public TabletPC(Map<String, Object> options) {
        setBatteryCapacity(Float.parseFloat((String) options.get(BATTERY_CAPACITY)));
        setDisplayInches(Float.parseFloat((String) options.get(DISPLAY_INCHS)));
        setMemoryRom(Float.parseFloat((String) options.get(MEMORY_ROM)));
        setFlashMemoryCapacity(Float.parseFloat((String) options.get(FLASH_MEMORY_CAPACITY)));
        setColor((String) options.get(COLOR));
    }

    public float getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(float batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public float getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(float displayInches) {
        this.displayInches = displayInches;
    }

    public float getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(float memoryRom) {
        this.memoryRom = memoryRom;
    }

    public float getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(float flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getCategory())
                .append(": ")
                .append(BATTERY_CAPACITY).append("=").append(batteryCapacity).append(" ")
                .append(DISPLAY_INCHS).append("=").append(displayInches).append(" ")
                .append(MEMORY_ROM).append("=").append(memoryRom).append(" ")
                .append(FLASH_MEMORY_CAPACITY).append("=").append(flashMemoryCapacity).append(" ")
                .append(COLOR).append("=").append(color).append(" ");
        return builder.toString();
    }
}
