import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {







    
    static int minimumSwaps(int[] arr) {
        int arrLen = arr.length; 
        int swapCount=0;
       
        for (int idx = 0; idx < arrLen-1; idx++) 
        { 
            int min_idx = idx; 
            for (int idx2 = idx+1; idx2 < arrLen; idx2++) 
                if (arr[idx2] < arr[min_idx]) 
                    min_idx = idx2; 
                  
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[idx]; 
            arr[idx] = temp; 
            swapCount++;
            
            
            boolean sorted=isSorted(arr);
            if (sorted){
                break;
            }
            System.out.print("SC: "+swapCount+"--> ");
            for(int ele : arr)
                System.out.print(ele+" ");
                
            System.out.println();
        }
        
        
        return swapCount;
    }
    public static boolean isSorted(int[] data){
    for(int idx = 1; idx < data.length; idx++){
        if(data[idx-1] > data[idx]){
            return false;
        }
    }
    return true;
}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
