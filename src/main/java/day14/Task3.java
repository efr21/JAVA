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

    public static List<Person> parseFileToObjList(File file)   {
        List<String> namesAndAges = new ArrayList<>();
        List<Person> namesAndAgesPersons = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                namesAndAges.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        String[][] array = new String[namesAndAges.size()][namesAndAges.size()];
        int[] arrayAges = new int[namesAndAges.size()];
        String[] arrayNames = new String[namesAndAges.size()];


        for(int i = 0; i < namesAndAges.size(); i++) {
            array[i] = namesAndAges.get(i).split(" ");
            arrayAges[i] = Integer.parseInt(array[i][1]);
            arrayNames[i] = array[i][0];
            if (arrayAges[i] < 0) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Некорректный входной файл");
                }
            }
            Person person = new Person();
            person.setAge(arrayAges[i]);
            person.setName(arrayNames[i]);
            namesAndAgesPersons.add(person);
        }
        return namesAndAgesPersons;
    }
}

