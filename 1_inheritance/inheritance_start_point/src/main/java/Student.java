public class Student extends CodeClanPersonnel{
//    fields
    private String fav_project;

//    constructor
    public Student(String name, int age, String cohort, String fav_project) {
        super(name, age, cohort);
        this.fav_project = fav_project;
    }

//    methods
    public String getFavProject(){ return this.fav_project; }
    public String talk(String language){
        return "I really enjoyed making " + fav_project;
    }
}
