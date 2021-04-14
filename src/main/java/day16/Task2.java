package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("file1");
        File file2 = new File("file2");
        try {
            PrintWriter pw1 = new PrintWriter(file1);
            PrintWriter pw2 = new PrintWriter(file2);
            Random rand = new Random();
            for (int i = 0; i < 1000; i++) {
                pw1.print(rand.nextInt(100)+1);
                pw1.print(" ");
            }

            pw1.close();
            Scanner scanner = new Scanner(file1);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            int[] numbersInt = new int[numbers.length];
            int counter = 0;
            for(String number : numbers) {
                numbersInt[counter++] = Integer.parseInt(number);
            }
            for(int i = 0; i < numbersInt.length -3; i++) {
                int sum_i  = 0;
                for (int j =0; j < 4; j++) {
                    sum_i += numbersInt[j + i];
                }
                pw2.print((double) sum_i / 4);
                pw2.print(" ");
            }
            pw2.close();
        } catch (FileNotFoundException e) {
        System.out.println("Файл не найден");
    }
        printResult(file2);
    }

    public static void printResult(File file)  {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            double[] numbersDouble  = new double[numbers.length];
            int counter = 0;
            double sum = 0;
            for(String number : numbers) {
                numbersDouble[counter++] = Double.parseDouble(number);
            }
            for (double number : numbersDouble) {
                sum += number;
            }
            System.out.println((int) sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
