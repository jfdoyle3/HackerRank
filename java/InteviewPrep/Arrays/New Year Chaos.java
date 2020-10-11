import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
      //  System.out.println("fi: "+findIndex(q,1));
       // int[] sorted=q;
      //  Arrays.sort(sorted);
       // System.out.println("fis: "+findIndex(sorted,1));
       for (int idx=0; idx<q.length; idx++){
         int location=findIndex(q, q[idx]);
           System.out.println("q: "+q[idx]+" | l: "+location);
       }

        // get element location from sorted and compare to q ;
        // subtract to get distsnce to accual location.
        // greater than 3 to chaotic .. less than 3 add to bribeCounter.
        // ex. sorted 1 pos: 0   q: 1 pos: 1  1-0=1; bribeCounter=1;
        //     sorted 5 pos: 4   q: 5 pos: 2  4-2=2; bribeCounter=2+1=3
        //  q: 2 pos: 0  sorted: 2 pos: 1
        // 2 > 1 find where 1 started from sort
        // need to figure how to skip over the checked elements.
        // 
    }
    static int findIndex(int[] array,int element){
     //  System.out.println("Find Index");
          int arrayIndex=-1;
       for(int idx = 0; idx < array.length; idx++) {
            if(array[idx] == element) {
                arrayIndex = idx;
                break;
            }
        }
        return arrayIndex;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
