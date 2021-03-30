package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Red");
        car.setModel("Sedan");
        car.setYear(2000);

        car.info();
        System.out.println(car.yearDifference(1921));

        Motorbike motorbike = new Motorbike("Model", "Red", 2000);

        motorbike.info();
        System.out.println(motorbike.yearDifference(2019));

    }
}
