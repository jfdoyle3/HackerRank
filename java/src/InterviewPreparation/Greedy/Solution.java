package InterviewPreparation.Greedy;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int luckBalance(int k, int[][] contests) {
        System.out.println(k);

        List<Integer> luck = new ArrayList<Integer>();
        int sum = 0;


        for (int[] contest : contests) {
            int i = contest[0];
            int j = contest[1];
            System.out.println(i + " " + j);
            if (j == 1) {
                luck.add(i);
            }

            sum += i;

        }

        System.out.println("Sum: " + sum);

        System.out.println("Luck items");
        Collections.sort(luck);
        for (int luckItem : luck) {
            System.out.println(luckItem);
        }
        for (int i = k; i > 0; i--) {
            luck.remove(i);
        }
        System.out.println("After removal");
        for (int luckItem : luck) {
            System.out.println(luckItem);
        }

        for (int luckItem : luck) {
            sum = sum - (luckItem * 2);
        }

        System.out.println("New sum: " + sum);

        return sum;

    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[][] contests = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] contestsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int contestsItem = Integer.parseInt(contestsRowItems[j]);
                contests[i][j] = contestsItem;
            }
        }

        int result = luckBalance(k, contests);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
