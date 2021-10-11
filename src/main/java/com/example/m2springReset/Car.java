package com.example.m2springReset;

public class Car {

    private Long id;
    private String manufacturer;
    private String model;

    public Car() {}

    public Car(Long id, String manufacturer, String model) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;}

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getManufacturer() {return manufacturer;}
    public void setManufacturer(String manufacturer) {this.manufacturer = manufacturer;}
    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}
    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
