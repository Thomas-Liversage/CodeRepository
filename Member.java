package PSD2_Array_Lab3Club;

public class Member {

    // Define instance variables
    private int memberNumber;
    private String memberName;


    public Member(int number, String name) {
        memberNumber = number;
        memberName = name;
    }//Constructor

    public int getMemberNumber (){
        return memberNumber;
    }//getMemberNumber


    public String toString() {
        return  (memberNumber + "\t\t" + memberName + "\n");
    }//toString
}//class