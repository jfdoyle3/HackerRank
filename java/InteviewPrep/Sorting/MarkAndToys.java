import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        int money=k;
        int gifts=0;
        int total=0;
        List<Integer> priceList=new ArrayList<>();
        for (int price : prices){
            if (price<money){
                priceList.add(price);
            }
        }
        Collections.sort(priceList);
        Collections.reverse(priceList);
        int priceSize=priceList.size();
        int giftOne=priceList.get(0);
        System.out.printf("One Gift: %d\n\n",giftOne);
        for(int price : priceList){
           System.out.printf("%d ",price);
        }
        System.out.println();
        for (int idx=1; idx<priceSize; idx++){
            
           
            if(total>money){
                priceList.remove(priceList.get(idx));
            } else {
                total+=giftOne+priceList.get(idx);             
            }
        }

       
        
        return priceSize;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] prices = new int[n];

        String[] pricesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pricesItem = Integer.parseInt(pricesItems[i]);
            prices[i] = pricesItem;
        }

        int result = maximumToys(prices, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
