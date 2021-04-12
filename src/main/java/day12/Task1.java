package day12;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new LinkedList<>();
        cars.add("Tesla");
        cars.add("Nissan");
        cars.add("Porsche");
        cars.add("Toyota");
        cars.add("BMW");
        System.out.println(cars);
        cars.add(( cars.size()) / 2, "Lada");
        cars.remove(0);
        System.out.println(cars);
    }
}
