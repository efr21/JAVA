package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
        bands.add(new MusicBand("Coldplay", 1996));
        bands.add(new MusicBand("The Beatles", 1960));
        bands.add(new MusicBand("30 Seconds to Mars", 1998));
        List<String> members1 = new ArrayList<>();
        List<String> members2 = new ArrayList<>();
        List<String> members3 = new ArrayList<>();
        members1.add("Крис Мартин");
        members1.add("Гай Берримен");
        members2.add("Джон Леннон");
        members2.add("Пол Маккартни");
        members3.add("Джаред Лето");
        members3.add("Шеннон Лето");
        bands.get(0).printMembers();
        MusicBand.transferMembers(bands.get(0), bands.get(1));
        bands.get(0).printMembers();
        bands.get(1).printMembers();
    }
}
