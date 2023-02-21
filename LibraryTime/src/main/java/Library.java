import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> shelves;
    private int capacity;
    private HashMap genreListing;

//    constructor
    public Library(int capacity){
        this.shelves = new ArrayList<Book>();
        this.capacity = capacity;
        this.genreListing = new HashMap<String, Integer>();
    }

//    methods
    public boolean placeDelicatelyOnShelf(Book bok) {
        if (this.shelves.size() < this.capacity) {
            this.shelves.add(bok);
            this.addToGenreListing(bok.getGenre());
            return true;
        }
        return false;
    }

    public int getNumberOfBooks() { return this.shelves.size(); }

    public int getHowMuchSpace() { return this.capacity; }
    public int getHowManyGenres() { return this.genreListing.size(); }

    public void addToGenreListing(String input_genre){
        if (genreListing.containsKey(input_genre)) {
            Integer currentCount = (Integer) this.genreListing.get(input_genre);
            Integer newCount = currentCount +1;
            this.genreListing.replace(input_genre, newCount);
        } else {
            Integer newCount = (Integer) 1;
            this.genreListing.put(input_genre, newCount);
        }

    }
}
