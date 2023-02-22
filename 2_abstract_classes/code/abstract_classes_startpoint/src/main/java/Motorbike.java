public class Motorbike extends Vehicle {

//    constructor
    public Motorbike(String model)
    {
        super(model, 2);
    }

//    methods
    public String drivingInstructions()
    {
        return super.drivingInstructions() + " Use handlebars to steer.";

    }
    public String boardingInstruction(){
        return "Just hop on.";
    }
}