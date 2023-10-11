package home_work_one;

import java.awt.*;

public class Car extends Transport {
private Color color;
private Audi numberCar;
    public Color getColor() {
        return color;
    }

    public Audi getNumberCar() {
        return numberCar;
    }

    public Car(String model, int wheels, String engine, int maxSpeed, int privod, Color color, Audi numberCar) {
        super(model, wheels, engine, maxSpeed, privod, color, numberCar);
        this.numberCar = numberCar;
    }

    public  void car(Car car) {
        System.out.println("-------------");
        System.out.println("car model " + car.getModel());
        System.out.println("car wheels " + car.getWheels());
        System.out.println("car engine " + car.getEngine());
        System.out.println("car maxSpeed " + car.getMaxSpeed());
        System.out.println("car privod " + car.getPrivod());
        System.out.println("car color " + car.getColor());
        System.out.println("car color " + car.getNumberCar().getNumberCar());
    }

    public final void car(Car car, Ferrari ferrari){
        System.out.println("hello");
    }
}
