package com.miguel.enfaced.model;

public class Gender {
    private final GenderType type;
    private final float confidence;

    public Gender(GenderType type, float confidence) {
        this.type = type;
        this.confidence = confidence;
    }

    public GenderType getType() {
        return type;
    }

    public float getConfidence() {
        return confidence;
    }
}
