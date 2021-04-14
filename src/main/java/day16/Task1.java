package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("text");
        printResult(file);

    }

    public static void printResult(File file)  {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            int[] numbersInt  = new int[numbers.length];
            int counter = 0;
            int sum = 0;
            for(String number : numbers) {
                numbersInt[counter++] = Integer.parseInt(number);
            }
            for (int number : numbersInt) {
                sum += number;
            }
            double mean  = (double)sum / numbersInt.length;
            double scale = Math.pow(10, 3);
            double result = Math.ceil(mean  * scale) / scale;
            System.out.print(mean + " --> ");
            System.out.format("%.3f",mean);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

