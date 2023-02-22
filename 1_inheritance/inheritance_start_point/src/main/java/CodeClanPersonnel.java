public class CodeClanPersonnel extends Human {
//    fields
    private String cohort;

//    constructor
    public CodeClanPersonnel(String name, int age, String cohort){
        super(name, age);
        this.cohort = cohort;
    }

//    Methods
    public String getCohort() {
        return cohort;
    }
    public void changeCohort(String cohort) {
        this.cohort = cohort;
    }


}
