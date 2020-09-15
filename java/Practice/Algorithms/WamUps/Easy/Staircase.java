import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        StringBuilder sb=new StringBuilder();
        for (int rows=0, cols= rows<n; rows++){
             System.out.print(rows+1);
           // int row=rows-1;
        // spaces
        // do{
        //   //  for (int idx=0; idx<row; idx++){
        //         sb.append("#"); 
        //         System.out.print(sb);
        // }while();
        //}
       
     //   System.out.println();
     }
     
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
