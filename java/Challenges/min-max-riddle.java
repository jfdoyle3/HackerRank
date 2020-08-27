import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the riddle function below.
   static long[] riddle(long[] arr) {
        // complete this function
        List<Object[]> arrayList = new ArrayList<Object[]>();
        List<Long> longList = new ArrayList<Long>();
        long[] newArr = {1};
        int windowCounter = 1; 
        for (int k = 0; k < windowCounter; k++) {
            for (int i = 0; i < arr.length; i++) {
                if (i + windowCounter > arr.length) {
                    break;
                }
                for (int j = i; j < windowCounter + i; j++) {
                    // System.out.println("Arr item: " + arr[j] + " J:" + j);
                    longList.add(arr[j]);
                }
                arrayList.add(longList.toArray());
                longList = new ArrayList<Long>();
            }
            if (windowCounter > arr.length) {
                break;
            } else {
                windowCounter++;
            }
        }
        for (Object[] longIntArray : arrayList) {
            for (Object longInt : longIntArray) {
                System.out.println(longInt);
            }
            System.out.println("New Array");
        }
        return newArr;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long[] arr = new long[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            long arrItem = Long.parseLong(arrItems[i]);
            arr[i] = arrItem;
        }

        long[] res = riddle(arr);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
