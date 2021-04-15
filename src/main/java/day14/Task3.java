package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> namesAndAgesPersons = new ArrayList<>();
        List<String> namesAndAges = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                namesAndAges.add(scanner.nextLine());
            }
            for (String line : namesAndAges) {
                String[] lines = line.split(" ");
                if (Integer.parseInt(lines[1]) < 0) throw new IOException();
                namesAndAgesPersons.add(new Person(Integer.parseInt(lines[1]), lines[0]));
            }
            return namesAndAgesPersons;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
