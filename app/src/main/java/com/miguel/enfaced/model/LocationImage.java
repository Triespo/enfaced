package com.miguel.enfaced.model;

public class LocationImage {
    private final int left;
    private final int top;
    private final int right;
    private final int bottom;

    public LocationImage(int left, int top, int right, int bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    public int getLeft() {
        return left;
    }

    public int getTop() {
        return top;
    }

    public int getRight() {
        return right;
    }

    public int getBottom() {
        return bottom;
    }
}
