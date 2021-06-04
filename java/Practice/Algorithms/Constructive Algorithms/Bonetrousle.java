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
     * Complete the 'bonetrousle' function below.
     *
     * The function is expected to return a LONG_INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. LONG_INTEGER n
     *  2. LONG_INTEGER k
     *  3. INTEGER b
     */
	 
	// Make a list/collection with default values (1 - b)
    // Add the numbers in collection
    // If its greater than N return -1
    // If its equal to N return collection
    // If its less than  N 
    // Calculate difference from N - sum of array
    // Add the difference to last element of collection
    // Check if new number is less than or equal to K
    // return new collection 
    // If not greater than K set element to K and K - 1
    // Repeat with next element
    // If I run out of elements return -1
	
    public static List<Long> bonetrousle(long n, long k, int b) {
        

        List<Long> results=new ArrayList<>();
        long total=0;
        for(long num=1; num<=k; num++)
            total+=num;
            
        if(k<n && b<=k){
            long fail=-1;
            results.add(fail);
            return results;            
        }
             
        results.add(total);
    return results;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                long n = Long.parseLong(firstMultipleInput[0]);

                long k = Long.parseLong(firstMultipleInput[1]);

                int b = Integer.parseInt(firstMultipleInput[2]);

                List<Long> result = Result.bonetrousle(n, k, b);

                bufferedWriter.write(
                    result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                    + "\n"
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
