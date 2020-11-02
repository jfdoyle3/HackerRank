import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int number=input.nextInt();

        for (int idx=0; idx<number; idx++){
            int testNumber=input.nextInt();
          //  System.out.println(testNumber);
            if (testNumber%2==1){
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }

    }

}