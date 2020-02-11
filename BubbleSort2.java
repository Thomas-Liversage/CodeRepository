package Week2_Lecture2;
/*
Using the sample array
{3, 6, 2, 8, 1, 9, 4}
Print out the passes required to sort this array using Bubble Sort.
 */

public class BubbleSort2 {

    public static void bubbleSort (int []  x){
        for (int out = x.length -1; out > 0; out--){
            for (int in = 0; in < out; in++){
                if (x [in] > x [in+1]){
                    int temp;
                    temp = x[in];
                    x[in] = x [in+1];
                    x[in+1] = temp;
                    for (int index = 0; index <x.length; index++){
                        System.out.print(x[index]+ "\t");
                    }
                    System.out.println();
                }//if
            }//for
        }//for
    }//bubbleSort

    public static void main(String[] args) {

        int [] num = {3, 6, 2, 8, 1, 9, 4};

        for (int index = 0; index <num.length; index++){
            System.out.print(num[index]+ "\t");
        }//for
        System.out.println();

        bubbleSort(num);

    }//main
}//class
