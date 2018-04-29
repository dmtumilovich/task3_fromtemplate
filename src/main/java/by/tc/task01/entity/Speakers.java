package by.tc.task01.entity;

import java.util.Map;

public class Speakers extends Appliance{
    private static final String POWER_CONSUMPTION = "POWER_CONSUMPTION";
    private static final String NUMBER_OF_SPEAKERS = "NUMBER_OF_SPEAKERS";
    private static final String FREQUENCY_RANGE = "FREQUENCY_RANGE";
    private static final String CORD_LENGTH = "CORD_LENGTH";

    private float powerConsumption;
    private int numberOfSpeakers;
    private String frequencyRange;
    private float cordLength;

    public Speakers() {

    }

    public Speakers(Map<String, Object> options) {
        setPowerConsumption(Float.parseFloat((String) options.get(POWER_CONSUMPTION)));
        setNumberOfSpeakers(Integer.parseInt((String) options.get(NUMBER_OF_SPEAKERS)));
        setFrequencyRange((String) options.get(FREQUENCY_RANGE));
        setCordLength(Float.parseFloat((String) options.get(CORD_LENGTH)));
    }

    public float getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(float powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public float getCordLength() {
        return cordLength;
    }

    public void setCordLength(float cordLength) {
        this.cordLength = cordLength;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getCategory())
                .append(": ")
                .append(POWER_CONSUMPTION).append("=").append(powerConsumption).append(" ")
                .append(NUMBER_OF_SPEAKERS).append("=").append(numberOfSpeakers).append(" ")
                .append(FREQUENCY_RANGE).append("=").append(frequencyRange).append(" ")
                .append(CORD_LENGTH).append("=").append(cordLength).append(" ");
        return builder.toString();
    }
}
