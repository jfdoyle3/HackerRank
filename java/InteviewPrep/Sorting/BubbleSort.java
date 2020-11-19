import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        int arrLen = a.length; 
        int swapCount=0;
        int numberBeingSwapped = 0;  
         for(int idx=0; idx < arrLen; idx++){  
                 for(int idx2=1; idx2 < (arrLen-idx); idx2++){  
                          if(a[idx2-1] > a[idx2]){  
                                  numberBeingSwapped= a[idx2-1];  
                                 a[idx2-1] = a[idx2];  
                                 a[idx2] = numberBeingSwapped;  
                                 swapCount++;
                         }  
                          
                 }

         }  
        System.out.printf("Array is sorted in %d swaps.",swapCount);
        System.out.printf("\nFirst Element: %d",a[0]);
        System.out.printf("\nLast Element: %d",a[arrLen-1]);        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }
}
