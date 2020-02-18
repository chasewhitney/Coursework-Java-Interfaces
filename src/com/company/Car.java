package com.company;

import java.util.ArrayList;
import java.util.List;

public class Car implements ISaveable {
    private String make;
    private String model;
    private String year;
    private String color;
    private String transmission;

    public Car(String make, String model, String year, String color, String transmission) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.transmission = transmission;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.make);
        values.add(0, this.model);
        values.add(0, this.year);
        values.add(0, this.color);
        values.add(0, this.transmission);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() != 0) {
            this.make = savedValues.get(0);
            this.model = savedValues.get(1);
            this.year = savedValues.get(2);
            this.color = savedValues.get(3);
            this.transmission = savedValues.get(4);
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year='" + year + '\'' +
                ", transmission='" + transmission + '\'' +
                '}';
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
}

