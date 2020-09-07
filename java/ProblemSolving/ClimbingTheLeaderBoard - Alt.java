import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] staticResult={-1000000};
        int aliceLength=alice.length;
        int[] result=new int[aliceLength];
        int[] leaderBoard=merge(scores,alice);
        Arrays.sort(leaderBoard);
        for(int idx=1; idx<aliceLength-1; idx++){
            int rank=searchBoard(leaderBoard, alice[idx]);
            result[idx]=rank;
        }
        return result;
    } // -------end bracket for main method
    // create methods here
    //-----------------------------
    static int searchBoard(int[] board, int score){
        for(int idx=0; idx<board.length; idx++){
            if (board[idx]==score){
                return idx;
            }
        }
        return -1;
    }
    // -----------------------------
   static int[] merge(int[] foo, int[] bar) {
 
    int fooLength = foo.length;
    int barLength = bar.length;
 
    int[] merged = new int[fooLength + barLength];
 
    int fooPosition, barPosition, mergedPosition;
    fooPosition = barPosition = mergedPosition = 0;
 
    while(fooPosition < fooLength && barPosition < barLength) {
        if (foo[fooPosition] < bar[barPosition]) {
            merged[mergedPosition++] = foo[fooPosition++];
        } else {
            merged[mergedPosition++] = bar[barPosition++];
        }
    }
 
    while (fooPosition < fooLength) {
        merged[mergedPosition++] = foo[fooPosition++];
    }
 
    while (barPosition < barLength) {
        merged[mergedPosition++] = bar[barPosition++];
    }
    return merged;
   }
// ----------- end of line ------------------
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
