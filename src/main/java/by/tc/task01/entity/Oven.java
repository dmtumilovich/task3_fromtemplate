package by.tc.task01.entity;

import java.util.Map;

public class Oven extends Appliance{
    private static final String POWER_CONSUMPTION = "POWER_CONSUMPTION";
    private static final String WEIGHT = "WEIGHT";
    private static final String CAPACITY = "CAPACITY";
    private static final String DEPTH = "DEPTH";
    private static final String HEIGHT = "HEIGHT";
    private static final String WIDTH = "WIDTH";

    private float powerConsumption;
    private float weight;
    private float capacity;
    private float depth;
    private float height;
    private float width;

    public Oven() {

    }

    public Oven(Map<String, Object> options) {
        setPowerConsumption(Float.parseFloat((String) options.get(POWER_CONSUMPTION)));
        setWeight(Float.parseFloat((String) options.get(WEIGHT)));
        setCapacity(Float.parseFloat((String) options.get(CAPACITY)));
        setDepth(Float.parseFloat((String) options.get(DEPTH)));
        setHeight(Float.parseFloat((String) options.get(HEIGHT)));
        setWidth(Float.parseFloat((String) options.get(WIDTH)));
    }

    public float getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(float powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getCategory())
                .append(": ")
                .append(POWER_CONSUMPTION).append("=").append(powerConsumption).append(" ")
                .append(WEIGHT).append("=").append(weight).append(" ")
                .append(CAPACITY).append("=").append(capacity).append(" ")
                .append(DEPTH).append("=").append(depth).append(" ")
                .append(HEIGHT).append("=").append(height).append(" ")
                .append(WIDTH).append("=").append(width);
        return builder.toString();
    }
}
