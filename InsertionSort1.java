package Week2_Lecture2;

public class InsertionSort1 {

    public static void insertionSort (int [] x){
        int in , out, temp;

        for (out = 1; out < x.length; out++){
            temp = x[out];
            for (in = out; (in > 0) && (x[in -1] >= temp); in--){
                x[in] = x [in -1];
            }//for
            x [in] = temp;
            printArray(x);

        }//for
    }//insertionSort

    public static void printArray(int [] x){
        for (int index = 0; index < x.length; index++ ){
            System.out.print(x[index] + "\t");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {

        int [] num ={1,23, 54, 78, 7, 12, 89, 56, 33, 4};
        insertionSort(num);


    }//main
}//class
