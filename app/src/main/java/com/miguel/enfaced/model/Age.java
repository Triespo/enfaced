package com.miguel.enfaced.model;

public class Age {
    private final int value;
    private final float confidence;
    private final String ageGroup;

    public Age(int value, float confidence, String ageGroup) {
        this.value = value;
        this.confidence = confidence;
        this.ageGroup = ageGroup;
    }

    public int getValue() {
        return value;
    }

    public float getConfidence() {
        return confidence;
    }

    public String getAgeGroup() {
        return ageGroup;
    }
}
