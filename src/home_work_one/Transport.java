package home_work_one;

import java.awt.*;

public class Transport {
    private String model;
    private int wheels;
    private String engine;
    private int maxSpeed;
    private int privod;
    private Color color;
    private Audi numberCar;

    public Audi getNumberCar() {
        return numberCar;
    }

    public String getModel() {
        return model;
    }

    public int getWheels() {
        return wheels;
    }

    public String getEngine() {
        return engine;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getPrivod() {
        return privod;
    }

    public Color getColor() {
        return color;
    }

    public Transport(String model, int wheels, String engine, int maxSpeed, int privod, Color color, Audi numberCar) {
        this.model = model;
        this.wheels = wheels;
        this.engine = engine;
        this.maxSpeed = maxSpeed;
        this.privod = privod;
        this.color = color;
        this.numberCar = numberCar;
    }
}
