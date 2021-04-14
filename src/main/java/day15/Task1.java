package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
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
        String[][] array = new String[linesOfTables.size()][linesOfTables.size()];
        int[] arrayCounts = new int[linesOfTables.size()];
        try {
            PrintWriter pw = new PrintWriter(fileOut);
            for(int i = 0; i < linesOfTables.size(); i++) {
                array[i] = linesOfTables.get(i).split(";");
                arrayCounts[i] = Integer.parseInt(array[i][2]);
                if (arrayCounts[i] == 0) {
                    String str = String.join(", ", array[i]);
                    pw.println(str);
                    }
        }
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Путь до файла missing_shoes.txt не найден");
        }
    }
}
