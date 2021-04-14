package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1  {
    public static void main(String[] args)  {
        File file = new File("text");
        try {
            printSumDigits(file);
        }  catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Некорректный входной файл");
        }
    }

    public static void printSumDigits(File file)  {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            int[] numbersInt  = new int[10];
            int counter = 0;
            int sum = 0;
            for(String number : numbers) {
                numbersInt[counter++] = Integer.parseInt(number);
            }
            for (int number : numbersInt) {
                sum += number;
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
