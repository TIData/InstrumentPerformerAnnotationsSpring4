package domain;

import domain.performer.Performer;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("springIdol")
public class SpringIdol implements TalentCompetition {
    
    @Autowired
    private Performer[] performers;

    public Performer[] getPerformers() {
        return performers;
    }

    @Override
    public void run() {
        System.out.println(performers.length);
        Arrays.stream(performers).forEach(performer -> {
            performer.perform();
            System.out.println("-----------------------");
        });

    }

}
