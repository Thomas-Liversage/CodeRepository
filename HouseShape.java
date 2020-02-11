package ClassTest3;

public class HouseShape {

    //instance variables
    private String colour;

    public HouseShape (){
        colour = "Yellow";
    }//constructor

    public HouseShape (String pColour){
        colour = pColour;
    }//alternative constructor

    //to string method that returns a message describing the colour of the house
    public String toString (){
        return "================================" + "\n" +
                "The colour of the house is " + colour + "\n";
    }//toString



}//class
