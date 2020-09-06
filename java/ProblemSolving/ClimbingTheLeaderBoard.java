import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {
    
    
     for (int aliceScores : alice){
        int alicePositions=searchBoard(scores,aliceScores);

        System.out.println("p: "+alicePositions+" | s: "+aliceScores);
       
    //    if (alicePositions==0){
    //      listResults.add(1);
    //     }else{
         listResults.add(alicePositions);
        // }
    }
 // --------------------------------   
     Object[] obResults=listResults.toArray();
     int[] results=toIntArray(obResults);

     return results;
    }
 // ---------------   
    static int searchBoard(int[] board, int score){
        for (int idx=0; idx<board.length; idx++){
            if(board[idx]==score){
				return idx;
        }
         return -1;
    }

    static int[] toIntArray( Object[] objectArray){
        int length=objectArray.length;
        int[] intArray=new int[length];
        for(int idx=0; idx<length; idx++){
            intArray[idx]=(int) objectArray[idx];
        }
        return intArray;
    } 
//-----------------------
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
