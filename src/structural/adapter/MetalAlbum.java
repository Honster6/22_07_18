package structural.adapter;

import java.util.Arrays;
import java.util.List;

public class MetalAlbum implements  Album {

    @Override
    public List<String> listOfSongs() {
        return Arrays.asList(
                "Krwawe żniwo łez",
                "Dusze umarłych kmiotów",
                "Pola rozpaczy"
        );
    }

    @Override
    public String front() {
        return "Jakaś okladka płyty";
    }
}
