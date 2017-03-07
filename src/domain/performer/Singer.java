package domain.performer;

import domain.Song;
import exceptions.PerformanceException;

public class Singer implements Performer {

    private String name;
    private Song song;

    public Singer(String name, Song song) {
        this.song = song;
        this.name = name;
    }

     public String getName() {
        return name;
    }

    public Song getSong() {
        return song;
    }
    
    @Override
    public void perform() throws PerformanceException {
        System.out.printf("%s IS SINGING %s\n", name, song.getTitle());
    }
}
