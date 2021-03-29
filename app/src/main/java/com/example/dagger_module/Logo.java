package com.example.dagger_module;

public class Logo {

    String shape;
    String color;

    public Logo(String shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
