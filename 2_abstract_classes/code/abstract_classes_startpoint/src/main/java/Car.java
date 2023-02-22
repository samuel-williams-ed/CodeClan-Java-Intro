public class Car extends Vehicle {

//    fields
    private int numberOfDoors;

//    constructor
    public Car(String model, int numberOfDoors)
    {
        super(model, 4);
        this.numberOfDoors = numberOfDoors;
    }

//    methods
    public String drivingInstructions()
    {
        return super.drivingInstructions() + " Use steering wheel to steer.";

    }

    public String openDoors()
    {
        return ("Beep. "+ numberOfDoors +" doors opened.");
    }


    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public String boardingInstruction(){
        return "Enter via one of the four doors";
    }
}