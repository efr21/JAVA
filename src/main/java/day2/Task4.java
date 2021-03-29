package day2;
import java.util.Scanner;
import static java.lang.Math.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        if (x >= 5) {
            System.out.println((pow(x, 2) - 10) / (x+7));
        } else if ((x > -3) && (x < 5)) {
            System.out.println((x+3) * (pow(x, 2) - 2));
        } else {
            System.out.println(420.0);
        }
    }
}
