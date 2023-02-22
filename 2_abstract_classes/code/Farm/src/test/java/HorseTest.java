import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HorseTest {

    Horse duncan;

    @Before
    public void before() {
        duncan = new Horse("Horse", "neigh", "Cheshire");
    }

    @Test
    public void checkHorseHasNoise(){
        assertEquals("neigh", duncan.getNoise());
    }

    @Test
    public void checkHorseHasSpecies(){
        assertEquals("Horse", duncan.getSpecies());
    }

    @Test
    public void checkHorseHasBreed(){
        assertEquals("Cheshire", duncan.getBreed());
    }
    @Test
    public void checkIntroduction(){
        assertEquals("Hi, I am a horse from Cheshire family, neigh neigh", duncan.introduceYourself());
    }

}

