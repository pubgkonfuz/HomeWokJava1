package home_work_one;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Audi audi = new Audi(2424);
        Car car = new Car(
                "Жигули",
                4,
                "V4",
                260,
                2,
                Color.BLACK,
                audi
        );
        Ferrari ferrari = new Ferrari(
                "F8",
                4,
                "V12",
                450,
                4,
                Color.GRAY,
                audi

        );
        Ferrari ferrari2 = new Ferrari(
                "F430",
                4,
                "V12",
                400,
                4,
                Color.GREEN,
                audi
        );
        car.car(car);
        ferrari.car(car, ferrari);
        ferrari.car(car, ferrari2);
        ferrari.ferrari(ferrari);
        ferrari2.ferrari(ferrari2);
    }
}
