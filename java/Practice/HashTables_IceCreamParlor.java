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
     //   System.out.println("m: "+money);

        HashMap<Integer, Integer> flavors = new HashMap<Integer, Integer>();
        for (int idx=0; idx<cost.length; idx++){
          flavors.put(idx+1, cost[idx]);
        }
        int key=flavors.get(1);
       System.out.println("k: "+key);
        int scan=scanPrices(flavors, key, money);
     //  A + B = Money;  need to Compare A and to iterate B to find Money.   
     //  int result=scanPrices(flavors,1,4);
        System.out.println(scan);
     //   System.out.println("r: "+result);
     //   System.out.println(flavors.get(3));
    } //-------------------------------------------
   static int scanPrices(HashMap<Integer,Integer> hMap, int key , int targetNumber){
       
       for (Map.Entry<Integer, Integer> entry : hMap.entrySet()) {
    //System.out.println(entry.getKey() + ":" + entry.getValue());
            if(key+entry.getValue()==targetNumber){
                return entry.getKey();
            }
        }
       
       return -1;
     }

// ----------------------------
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
