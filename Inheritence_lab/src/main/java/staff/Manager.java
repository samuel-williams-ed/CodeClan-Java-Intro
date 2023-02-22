package staff;

public class Manager extends Employee {
    private String department;

//    constructors
    public Manager(String name, int number, int salary, String dept) {
        super(name, number, salary);
        this.department = dept;
    }

    //    setters & getters
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    //    methods


}
