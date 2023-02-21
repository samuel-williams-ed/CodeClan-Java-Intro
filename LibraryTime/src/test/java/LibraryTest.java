import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book HarryPotter;
    private Book Meg;
    private Book CatInTheHat;
    private Book LordOfTheRings;
    

    @Before
    public void before(){
        library = new Library(3);
        HarryPotter = new Book("Harry Potter", "JK Rowling", "Fantasy");
        Meg = new Book("Meg", "Some leg", "Hi-Fantasy");
        CatInTheHat = new Book("CatInTheHat", "Dr Seuss", "Memoir");
        LordOfTheRings = new Book("LordOfTheRings", "Tolkien", "Super-hi-fantasy");
    }

    @Test
    public void noBooksInLibrary(){
        assertEquals(0, library.returnNumberOfBooks());
    }

    @Test
    public void bookGetOnShelf(){
        library.placeDelicatelyOnShelf(HarryPotter);
        assertEquals(1, library.returnNumberOfBooks());
    }
    @Test
    public void bookCameAndWent(){
        library.placeDelicatelyOnShelf(HarryPotter);
        library.placeDelicatelyOnShelf(Meg);
        library.placeDelicatelyOnShelf(CatInTheHat);
        assertEquals(3, library.returnNumberOfBooks());
    }

    @Test
    public void reachedMaximumReads(){
        library.placeDelicatelyOnShelf(HarryPotter);
        library.placeDelicatelyOnShelf(Meg);
        library.placeDelicatelyOnShelf(CatInTheHat);
        assertEquals(false, library.placeDelicatelyOnShelf(LordOfTheRings));
    }
}
