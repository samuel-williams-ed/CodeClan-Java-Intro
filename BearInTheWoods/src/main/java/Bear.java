import java.util.ArrayList;

public class Bear {
    private String name;
    private ArrayList<Fish> belly;
    private int hunger;

    public Bear(String input_name) {
        this.name = input_name;
        this.belly = new ArrayList<>();
        this.hunger = 20;
    }

    public int howManyInBelly(){
        return this.belly.size();
    }
    public int checkHungerLevel(){
        return this.hunger;
    }

    public void eatFish(Fish input_fish) {
        int howFilling = input_fish.getHowFilling();
        this.hunger -= howFilling;
        this.belly.add(input_fish);
    }

    public ArrayList<Fish> whatHaveYouEaten() {
        return this.belly;
    }
}
