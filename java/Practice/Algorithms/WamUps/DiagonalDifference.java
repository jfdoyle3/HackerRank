import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {         
        int row=arr.size()-1;
        
        // System.out.println(arr.size());
        int topLeftNumber=arr.get(0).get(0);
        int middleNumber=arr.get(1).get(1);
        int topRightNumber=arr.get(0).get(row);
        int bottomRightNumber=arr.get(row).get(row);
        int bottomLeftNumber=arr.get(row).get(0);
       // System.out.println("Tleft: "+topLeftNumber);
       // System.out.println("Tright: "+topRightNumber);
       // System.out.println("middle: "+middleNumber);
      //  System.out.println("Tright: "+bottomRightNumber);
        int diag1=topLeftNumber+middleNumber+bottomRightNumber;
        int diag2=topRightNumber+middleNumber+bottomLeftNumber;
        int avg=diag2-diag1;
        int average, diagA, diagB;
         average=diagA=diagB=0;


           for(int idx1=0, idx2=0;  idx2<arr.get(row).size(); idx1++,idx2++){
              int number=arr.get(idx1).get(idx2);
           //   System.out.println("d: "+diagA+" | n: "+number);
              diagA+=number;
           }
          //   System.out.println(diagA);
             
             for(int idx1=0, idx2=row;  idx2<=arr.get(row).size(); idx1++,idx2--){
           //  System.out.println(idx1+","+idx2);
              int number=arr.get(idx1).get(idx2);
           //   System.out.println("d: "+diagB+" | n: "+number);
              diagB+=number;
              if (idx2==0){
                  break;
              }
            }
   // System.out.println(diagB);
            average=diagB-diagA;
        



        return average;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
