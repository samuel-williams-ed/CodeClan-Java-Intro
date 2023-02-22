public class Sheep extends FarmAnimal{

    //    constructors
    public Sheep(String species, String vocal_call) {
        super(species, vocal_call);
    }

    //    setters & getters

    //    abstract methods
    public String makeANoise(){
        return this.getNoise();
    }
    @Override
    public String introduceYourself(){ return "Hi, I am a " + getSpecies() + ", " + getNoise() + " " + getNoise(); }
}
