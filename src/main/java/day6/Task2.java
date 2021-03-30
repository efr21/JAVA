package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Superjet", 2010, 24, 160);
        airplane.setYear(2000);
        airplane.setLength(30);
        airplane.fillUp(15000);
        airplane.fillUp(20000);
        airplane.info();

    }
}
