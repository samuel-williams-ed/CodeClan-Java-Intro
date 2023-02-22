package staff;

public class Director extends Manager{
    private int budget;

    public Director(String name, int number, int salary, String dept, int budget) {
        super(name, number, salary, dept);
        this.budget = budget;
    }

//setters & getters
    public int getBudget() {
        return budget;
    }
    public void setBudget(int budget) {
        this.budget = budget;
    }
}
