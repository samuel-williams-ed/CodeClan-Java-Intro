import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheepTest {

    Sheep shawn;

    @Before
    public void before() {
        shawn = new Sheep("Sheep", "baa");
    }

    @Test
    public void checkSheepHasNoise(){
        assertEquals("baa", shawn.getNoise());
    }

    @Test
    public void checkSheepHasSpecies(){
        assertEquals("Sheep", shawn.getSpecies());
    }
    @Test
    public void checkIntroduction(){
        assertEquals("Hi, I am a Sheep, baa baa", shawn.introduceYourself());
    }

}
