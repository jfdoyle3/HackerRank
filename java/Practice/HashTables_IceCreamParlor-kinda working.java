import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Solution {
    // Complete the whatFlavors function below.
    static void whatFlavors(int[] cost, int money) {
        // System.out.println(money);
        HashMap<Integer, Integer> flavors = new HashMap<Integer, Integer>();
        for (int idx = 0; idx < cost.length; idx++) {
            flavors.put(idx + 1, cost[idx]);
        }
        String finalItem = "";
        for (int idx = 1; idx < flavors.size() + 1; idx++) {
            if (flavors.get(idx) <= (money - 1)) {
                for (int idx2 = idx + 1; idx2 < flavors.size() + 1; idx2++) {
                    // System.out.println(key + " " + value);
                    if (flavors.get(idx) + flavors.get(idx2) == money) {
                        finalItem = idx + " " + idx2;
                        break;
                    }
                }
            }
            // System.out.println("Key: " + idx + " " + "Value: " + flavors.get(idx));
        }
        System.out.println(finalItem);       
        // System.out.println("Removed unneeded");
        // flavors.forEach((key, value)->{
        //     System.out.println(key + " " + value);
        // });
        // if (cost[idx] >= (money - 1)) {
        // }
        // for (int idx2 = 0; idx2 < cost.length; idx2++) {
        //     flavors.forEach((key, value)->{
        //         final int jClone = idx2;
        //         System.out.println(key + " " + value);
        //     });
        // }
        // System.out.println("==========");
        // System.out.println("Indexed flavors");
        // System.out.println(flavors);
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int tItr = 0; tItr < t; tItr++) {
            int money = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            int[] cost = new int[n];
            String[] costItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            for (int i = 0; i < n; i++) {
                int costItem = Integer.parseInt(costItems[i]);
                cost[i] = costItem;
            }
            whatFlavors(cost, money);
        }
        scanner.close();
    }
}