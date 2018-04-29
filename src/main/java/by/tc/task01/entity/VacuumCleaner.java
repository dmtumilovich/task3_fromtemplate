package by.tc.task01.entity;

import java.util.Map;

public class VacuumCleaner extends Appliance{
    private static final String POWER_CONSUMPTION = "POWER_CONSUMPTION";
    private static final String FILTER_TYPE = "FILTER_TYPE";
    private static final String BAG_TYPE = "BAG_TYPE";
    private static final String WAND_TYPE = "WAND_TYPE";
    private static final String MOTOR_SPEED_REGULATION = "MOTOR_SPEED_REGULATION";
    private static final String CLEANING_WIDTH = "CLEANING_WIDTH";

    private float powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private float motorSpeedRegulation;
    private float cleaningWidth;

    public VacuumCleaner() {

    }

    public VacuumCleaner(Map<String, Object> options) {
        setPowerConsumption(Float.parseFloat((String) options.get(POWER_CONSUMPTION)));
        setFilterType((String) options.get(FILTER_TYPE));
        setBagType((String) options.get(BAG_TYPE));
        setWandType((String) options.get(WAND_TYPE));
        setMotorSpeedRegulation(Float.parseFloat((String) options.get(MOTOR_SPEED_REGULATION)));
        setCleaningWidth(Float.parseFloat((String) options.get(CLEANING_WIDTH)));
    }

    public float getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(float powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public float getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(float motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public float getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(float cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getCategory())
                .append(": ")
                .append(POWER_CONSUMPTION).append("=").append(powerConsumption).append(" ")
                .append(FILTER_TYPE).append("=").append(filterType).append(" ")
                .append(BAG_TYPE).append("=").append(bagType).append(" ")
                .append(WAND_TYPE).append("=").append(wandType).append(" ")
                .append(MOTOR_SPEED_REGULATION).append("=").append(motorSpeedRegulation).append(" ")
                .append(CLEANING_WIDTH).append("=").append(cleaningWidth).append(" ");
        return builder.toString();
    }
}
