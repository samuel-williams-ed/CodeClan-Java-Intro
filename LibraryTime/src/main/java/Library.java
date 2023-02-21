import java.util.ArrayList;

public class Library {

    private ArrayList<Book> shelves;
    private int capacity;

    public Library(int capacity){
        this.shelves = new ArrayList<Book>();
        this.capacity = capacity;
    }

//    methods
    public boolean placeDelicatelyOnShelf(Book bok) {
        if (this.shelves.size() < this.capacity) {
            this.shelves.add(bok);
            return true;
        }
        return false;
    }

    public int returnNumberOfBooks() { return this.shelves.size(); }

    public int returnHowMuchSpace() { return this.capacity; }
}
