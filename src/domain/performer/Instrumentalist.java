package domain.performer;

import domain.Song;
import domain.instrument.Instrument;
import exceptions.PerformanceException;
import javax.annotation.Resource;

public class Instrumentalist implements Performer {

    @Resource(name="instrument")
    private Instrument instrument;
    private Song song;

    public Instrument getInstrument() {
        return instrument;
    }

    public Song getSong() {
        return song;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.printf("Playing %s : ", song);
        instrument.play();
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
