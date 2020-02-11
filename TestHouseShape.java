package ClassTest3;

public class TestHouseShape {

    public static void main(String[] args) {

        //creating two SquareHouseObjects
        SquareHouse house1 = new SquareHouse("Green", 9,4);
        SquareHouse house2 = new SquareHouse("Blue", 8, 7);

        //creating a houseShape object
        HouseShape house3 = new HouseShape("Black");

        //print out the details of objects created and the number of square houses created
        System.out.println(house1);
        System.out.println(house2);
        System.out.println(house3);
        System.out.println("The number of square houses created is " + SquareHouse.getNoOfSquareHouses());

    }//main
}//class
