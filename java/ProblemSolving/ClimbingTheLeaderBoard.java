import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] staticResult={-1000000};
        int[] result=new int[alice.length];
        int length=scores.length-1;
     for (int idx=0; idx<alice.length; idx++){
   //    int alicePositions=searchBoard(scores,alice[idx]);
     int alicePositions=recursionSearch(scores,0,length,alice[idx]);
       // int alicePositions=searchBoard(scores,5);
        System.out.println("p: "+alicePositions+" | s: "+alice[idx]);
        result[idx]=alicePositions;
         }
        return result;
    }
 // -------end bracket for main method
    // create methods here
    //-----------------------------
    static int recursionSearch(int arr[], int start, int last, int x)
    {
         if (last < start)
            return -1;
         if (arr[start] == x)
            return start;
        if(arr[last]>x)
            return last;
        if(arr[0]<x)
          return start+1;
         return recursionSearch(arr, start+1, last, x);
    }
    // -----------------------------
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
