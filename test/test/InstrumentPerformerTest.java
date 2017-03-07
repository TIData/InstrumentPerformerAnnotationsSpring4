package test;

import domain.SpringIdol;
import domain.instrument.Saxophone;
import domain.performer.Instrumentalist;
import domain.performer.Performer;
import domain.performer.Singer;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-idol.xml")
public class InstrumentPerformerTest {
    
    @Autowired
    private SpringIdol springIdol;

    private Performer[] performer;

    @Before
    public void before() {
        performer = springIdol.getPerformers();
    }

    @Test
    public void assertSpringIdolProperties() {
        Assert.assertEquals(3, performer.length);

        Assert.assertTrue(performer[0] instanceof Singer);
        Assert.assertTrue(performer[1] instanceof Instrumentalist);
        Assert.assertTrue(performer[2] instanceof Instrumentalist);
    }

    @Test
    public void assertPerformer0() {
        Assert.assertEquals("Prince", ((Singer) performer[0]).getName());
        Assert.assertEquals("Walk in Sand", ((Singer) performer[0]).getSong().getTitle());
    }

    private void assertInstrumentalist(Instrumentalist instrumentatlist) {
        Assert.assertTrue(instrumentatlist.getInstrument() instanceof Saxophone);
        Assert.assertEquals("Hymn Of The Orient", instrumentatlist.getSong().getTitle());
    }

    @Test
    public void assertPerformer1() {
        assertInstrumentalist((Instrumentalist) performer[1]);
    }

    @Test
    public void assertPerformer2() {
        assertInstrumentalist((Instrumentalist) performer[2]);
    }
}
