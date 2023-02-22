public class Instructor extends CodeClanPersonnel{
//    fields
    private String language;

//    constructor
    public Instructor(String name, int age, String cohort, String fav_lan) {
        super(name, age, cohort);
        this.language = fav_lan;
    }
//    Methods
    public String talk(String language){
        return "I love " + language;
    }

}