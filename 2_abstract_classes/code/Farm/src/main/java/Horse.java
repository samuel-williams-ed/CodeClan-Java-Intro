public class Horse extends FarmAnimal{
    private String breed;

//    constructors
    public Horse(String species, String vocal_call, String breed) {
        super(species, vocal_call);
        this.breed = breed;
    }

//    setters & getters
    public String getBreed(){
        return this.breed;
    }

//    abstract methods
    public String makeANoise(){
        return this.getNoise();
    }
    @Override
    public String introduceYourself(){ return "Hi, I am a horse from " + getBreed() + " family, " + getNoise() + " " + getNoise(); }
}
