import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BearTest{
    private Bear bear;
    private Fish salmon;


    @Before
    public void before() {
        bear = new Bear("Herbert");
        salmon = new Fish("Salmon");
    }

    @Test
    public void Bear_starts_hungry() {assertEquals(20, bear.checkHungerLevel());}

    @Test
    public void canEatSalmon() {
        bear.eatFish(salmon);
        assertEquals(1, bear.howManyInBelly());
    }
    @Test
    public void isLessHungryAfterSalmon() {
        bear.eatFish(salmon);
        assertEquals(18, bear.checkHungerLevel());
    }
    @Test
    public void canSeeContentsOfBearsBelly() {
        bear.eatFish(salmon);
        ArrayList<Fish> DummyBelly = new ArrayList<Fish>();
        DummyBelly.add(salmon);
        assertEquals(DummyBelly, bear.whatHaveYouEaten());
    }
}
