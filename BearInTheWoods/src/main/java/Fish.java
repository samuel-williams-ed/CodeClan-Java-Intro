public class Fish {
    String type;
    int hungerFullfillmentValue;

    public Fish(String name){
        this.type = name;
        this.hungerFullfillmentValue = 2;
    }

//    methods
    public int getHowFilling(){
        return this.hungerFullfillmentValue;
    }

}
