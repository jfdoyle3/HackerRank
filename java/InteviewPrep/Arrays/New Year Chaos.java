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
        HashMap<Integer, Integer> hm = new HashMap<>(); 
       int bribeCounter = 0;
       int[] arr = q; 
       int n = arr.length;
       int temp = 0; 
       List<Integer> changes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j-1] > arr[j]) {
                    bribeCounter++; 
                    temp = arr[j-1]; 
                    // System.out.println(temp); 
                    arr[j-1] = arr[j];
                    arr[j] = temp; 
                    changes.add(temp);
                }
            }  
        } 
            for (int num : changes){
                if(hm.containsKey(num)){
                hm.put(num, hm.get(num)+1);
                } else {
                hm.put(num,1);
                }
            }
            int max = Collections.max(hm.values());
                
                    if (max > 2) {
                        System.out.println("Too chaotic"); 
                    } else {
                        System.out.println(bribeCounter); 
                    }
 
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
         //   System.out.print("test case |  ");
            minimumBribes(q); 
            
        }
       
        scanner.close();
    }
}
