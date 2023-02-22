package staff;

public abstract class Employee {
    private String name;
    private int number;
    private int salary;

//    constructors
    public Employee(String name, int number, int salary){
        this.name = name;
        this.number = number;
        this.salary = salary;
    }
//    setters & getters
    public String getName() { return this.name; }
    public int getNumber() { return number; }
    public int getSalary() { return salary; }

    public void setName(String input_name) {
        if ( input_name != null ){
            this.name = input_name;
        }
    }
    public void setNumber(int input_number) {this.number = input_number;}
    public void setSalary(int input_salary) {this.salary = input_salary;}

//    methods
    public void raiseSalary(int money){
        if ( money > 0) { this.salary += money; }
    }

    public void payBonus(){
        this.salary *= 1.01;
    }
}
