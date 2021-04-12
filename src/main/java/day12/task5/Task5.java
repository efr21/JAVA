package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
        List<MusicArtist> members1 = new ArrayList<>();
        List<MusicArtist> members2 = new ArrayList<>();
        List<MusicArtist> members3 = new ArrayList<>();
        MusicArtist artist1 = new MusicArtist("Крис Мартин", 20);
        MusicArtist artist2 = new MusicArtist("Гай Берримен", 25);
        MusicArtist artist3 = new MusicArtist("Джон Леннон", 20);
        MusicArtist artist4 = new MusicArtist("Пол Маккартни", 25);
        MusicArtist artist5 = new MusicArtist("Джаред Лето", 20);
        MusicArtist artist6 = new MusicArtist("Шеннон Лето", 25);
        members1.add(artist1);
        members1.add(artist2);
        members2.add(artist3);
        members2.add(artist4);
        members3.add(artist5);
        members3.add(artist6);
        bands.add(new MusicBand("Coldplay", 1996, members1));
        bands.add(new MusicBand("The Beatles", 1960, members2));
        bands.add(new MusicBand("30 Seconds to Mars", 1998, members3));
        bands.get(0).printMembers();
        MusicBand.transferMembers(bands.get(0), bands.get(1));
        bands.get(0).printMembers();
        bands.get(1).printMembers();
    }
}
