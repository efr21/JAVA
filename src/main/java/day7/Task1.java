package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Superjet", 2010, 24, 160);
        Airplane airplane2 = new Airplane("Boeing", 2020, 30, 180);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}