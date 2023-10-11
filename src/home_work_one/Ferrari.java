package home_work_one;

import java.awt.*;

public final class Ferrari extends Car {
private Color color;
private Audi numberCar;
    public Color getColor() {
        return color;
    }

    public Audi getNumberCar() {
        return numberCar;
    }

    public Ferrari(String model, int wheels, String engine, int maxSpeed, int privod, Color color, Audi numberCar) {
        super(model, wheels, engine, maxSpeed, privod, color, numberCar);
        this.numberCar = numberCar;
    }

    public void ferrari(Ferrari ferrari){
        System.out.println("--------------");
        System.out.println("car model " + ferrari.getModel());
        System.out.println("car wheels " + ferrari.getWheels());
        System.out.println("car engine " + ferrari.getEngine());
        System.out.println("car maxSpeed " + ferrari.getMaxSpeed());
        System.out.println("car privod " + ferrari.getPrivod());
        System.out.println("car color " + ferrari.getColor());
        System.out.println("car color " + ferrari.getNumberCar().getNumberCar());

    }

    @Override
    public void car(Car car) {
        System.out.println("Car");

    }

}
