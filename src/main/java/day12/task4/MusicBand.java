package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    List<String> members = new ArrayList<>();

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return name + " " + year;
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        List<String> members1 = band1.members;
        List<String> members2 = band2.members;
        members2.removeAll(members1);
        members2.addAll(members1);
        members1.removeAll(members1);
    }

    public void printMembers() {
        System.out.println(members);
    }

    public List<String> getMembers() {
        return members;
    }

}
