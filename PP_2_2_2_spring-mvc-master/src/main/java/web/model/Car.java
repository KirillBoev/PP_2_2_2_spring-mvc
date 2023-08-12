package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private int series;
    private int manufactureYear;


    public Car() {
    }

    public Car(String model, int series, int manufactureYear) {
        this.model = model;
        this.series = series;
        this.manufactureYear = manufactureYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", manufactureYear=" + manufactureYear +
                '}';
    }
}
