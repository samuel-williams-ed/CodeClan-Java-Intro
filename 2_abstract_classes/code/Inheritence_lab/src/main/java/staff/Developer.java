package staff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Developer extends Employee{
    private ArrayList<String> complaints;


    public Developer(String name, int number, int salary) {
        super(name, number, salary);
        this.complaints = new ArrayList<String>(Arrays.asList("Javascript is soooo spaghetti, have you even heard of static typing?", "I hate my job", "The coffee here is bad."));
    }

//    methods
    public String complain(){
        Random rand = new Random();
        int index = rand.nextInt(complaints.size());
        return this.complaints.get(index);
    }

}
