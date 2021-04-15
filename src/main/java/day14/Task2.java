package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file)   {
        List<String> namesAndAges = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                namesAndAges.add(scanner.nextLine());
            }
            for(String line : namesAndAges) {
                String[] lines = line.split(" ");
                if (Integer.parseInt(lines[1]) < 0)  throw new IOException();
            }
            return namesAndAges;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
        System.out.println("Некорректный входной файл");
    }
        return null;
    }
}
