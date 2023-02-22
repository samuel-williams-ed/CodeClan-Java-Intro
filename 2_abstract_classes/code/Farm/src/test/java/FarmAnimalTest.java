import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FarmAnimalTest {
    FarmAnimal Betsy;
    FarmAnimal Deirdre;

    @Before
    public void before(){
        Betsy = new Sheep ("sheep", "baa");
        Deirdre = new Horse ("horse", "neigh", "pony");
    }
    @Test
    public void checkHaveSpecies(){
        assertEquals("horse", Deirdre.getSpecies());
        assertEquals("sheep", Betsy.getSpecies());
    }
    @Test
    public void checkHaveNoises(){
        assertEquals("neigh", Deirdre.getNoise());
        assertEquals("baa", Betsy.getNoise());
    }
    @Test
    public void checkAllGreet(){
        assertEquals("Hi, I am a horse from pony family, neigh neigh", Deirdre.introduceYourself());
        assertEquals("Hi, I am a sheep, baa baa", Betsy.introduceYourself());
    }
}
