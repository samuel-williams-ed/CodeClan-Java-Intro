public abstract class FarmAnimal {
    private String species;
    private String noise;


    //    constructors
    public FarmAnimal(String species, String vocal_call) {
        this.species = species;
        this.noise = vocal_call;
    }

//    setters & getters
    public String getSpecies(){ return this.species; }

    public String getNoise() { return noise; }

    //    methods
    public String introduceYourself(){ return "Hi, I am a " + getSpecies(); }

    //  abstract method
    public abstract String makeANoise();
}

