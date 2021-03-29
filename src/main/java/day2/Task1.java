package day2;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count_of_floors = s.nextInt();
        if (1 <= count_of_floors && count_of_floors <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (5 <= count_of_floors && count_of_floors <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (count_of_floors >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
