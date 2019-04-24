package MarcosUTN.entities;

import java.util.Observable;

public class Car extends Observable {
    private String brand;
    private String model;
    private int oilLevel;
    private int tiresPressure;
    private int waterLevel;

    public Car(String brand, String model, int oilLevel, int tiresPressure, int waterLevel) {
        this.brand = brand;
        this.model = model;
        this.oilLevel = oilLevel;
        this.tiresPressure = tiresPressure;
        this.waterLevel = waterLevel;
    }
     public void viewed(){
         System.out.println("Brand:\t"+this.brand);
         System.out.println("Model:\t"+this.model);
         System.out.println("Oil Level:\t"+this.oilLevel);
         System.out.println("Tires Pressure:\t"+this.tiresPressure);
         System.out.println("Water Level:\t"+this.waterLevel);
         setChanged();
         notifyObservers();
     }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public void setOilLevel(int oilLevel) {
        this.oilLevel = oilLevel;
    }

    public int getTiresPressure() {
        return tiresPressure;
    }

    public void setTiresPressure(int tiresPressure) {
        this.tiresPressure = tiresPressure;
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(int waterLevel) {
        this.waterLevel = waterLevel;
    }
}

