package ClassTest3;

import java.text.DecimalFormat;

public class SquareHouse extends HouseShape {

    DecimalFormat df = new DecimalFormat("00");

    //instance variables
    private static int noOfSquareHouses = 0;
    private int length;
    private int width;

    public SquareHouse (String pColour, int pLenght, int pWidth){
        super (pColour);
        length = pLenght;
        width = pWidth;
        noOfSquareHouses++;
    }//constructor


    //method to calculate and return the area
    private int area(){
        return (length * width);
    }//area


    //Method to return contexutal string info on SquareHouse
    public String toString (){
        return super.toString() + "\n" +
                "The Length of the Square house is  " + length + "cm" + "\n" +
                "The Width of the square house is   " + width + "cm" + "\n" +
                "The Area of the square house is    " + df.format(area()) + "cm3" + "\n";
     }//toString

    //method to return the number of square houses created
    protected static int getNoOfSquareHouses(){
        return noOfSquareHouses;
    }//getNumberOfSqaureHouses

}//class
