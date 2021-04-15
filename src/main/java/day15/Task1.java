package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String separator = File.separator;
        String pathIn = String.join(separator, "src", "main", "resources", "shoes.csv");
        File fileIn = new File(pathIn);
        List<String> linesOfTables = new ArrayList<>();
        try (Scanner scanner = new Scanner(fileIn)) {
            while (scanner.hasNextLine()) {
                linesOfTables.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл shoes.csv не найден");
        }
        String pathOut = String.join(separator, "src", "main", "resources", "missing_shoes.txt");
        File fileOut = new File(pathOut);
        try {
            PrintWriter pw = new PrintWriter(fileOut);
            for(String line : linesOfTables) {
                String[] lines = line.split(";");
                if (Integer.parseInt(lines[2]) == 0) {
                    String str = String.join(", ", lines);
                    pw.println(str);
                }
            }
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Путь до файла missing_shoes.txt не найден");
        }
    }
}
