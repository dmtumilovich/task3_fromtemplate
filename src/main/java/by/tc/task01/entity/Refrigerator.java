package by.tc.task01.entity;

import java.util.Map;

public class Refrigerator extends Appliance{
    private static final String POWER_CONSUMPTION = "POWER_CONSUMPTION";
    private static final String WEIGHT = "WEIGHT";
    private static final String FREEZER_CAPACITY = "FREEZER_CAPACITY";
    private static final String OVERALL_CAPACITY = "OVERALL_CAPACITY";
    private static final String HEIGHT = "HEIGHT";
    private static final String WIDTH = "WIDTH";

    private float powerConsumption;
    private float weight;
    private float freezerCapacity;
    private float overallCapacity;
    private float height;
    private float width;

    public Refrigerator() {

    }

    public Refrigerator(Map<String, Object> options) {
        setPowerConsumption(Float.parseFloat((String) options.get(POWER_CONSUMPTION)));
        setWeight(Float.parseFloat((String) options.get(WEIGHT)));
        setFreezerCapacity(Float.parseFloat((String) options.get(FREEZER_CAPACITY)));
        setOverallCapacity(Float.parseFloat((String) options.get(OVERALL_CAPACITY)));
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

    public float getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(float freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public float getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(float overallCapacity) {
        this.overallCapacity = overallCapacity;
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
                .append(FREEZER_CAPACITY).append("=").append(freezerCapacity).append(" ")
                .append(OVERALL_CAPACITY).append("=").append(overallCapacity).append(" ")
                .append(HEIGHT).append("=").append(height).append(" ")
                .append(WIDTH).append("=").append(width);
        return builder.toString();
    }
}
