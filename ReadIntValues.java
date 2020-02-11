package Week2_Lecture1;


import java.io.*;

public class ReadIntValues {
    public static void main(String[] args) {

        try {

            FileReader fr = new FileReader("U:\\private\\COM742\\Java Programs\\src\\Week2_Lecture1\\data.txt");
            BufferedReader br = new BufferedReader(fr);

            String c = br.readLine();

            for (int index = 0; index < 10; index++) { //or if unknown while (c!= null){
                int num = Integer.parseInt(c);
                System.out.println(num);
                c = br.readLine();
            }
            br.close();
            fr.close();
        }catch (IOException e){
            System.out.println("ERROR");
        }
    }//main
}//class
