package day12.task3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
        bands.add(new MusicBand("AC/DC", 1973));
        bands.add(new MusicBand("Queen", 1970));
        bands.add(new MusicBand("Coldplay", 1996));
        bands.add(new MusicBand("The Beatles", 1960));
        bands.add(new MusicBand("30 Seconds to Mars", 1998));
        bands.add(new MusicBand("Linkin Park", 2000));
        bands.add(new MusicBand("Kasabian", 2006));
        bands.add(new MusicBand("Kings of Leon", 2003));
        bands.add(new MusicBand("OneRepublic", 2002));
        bands.add(new MusicBand("The Script", 2001));

        Collections.shuffle(bands);
        System.out.println(bands);
        System.out.println(groupsAfter2000(bands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> bandsAfter2000 = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000) {
                 bandsAfter2000.add(band);
            }
        }
        return bandsAfter2000;
    }
}
