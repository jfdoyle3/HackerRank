import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        
        int stringsLen=strings.length;
        int queryLen=queries.length;
        int[] results=new int[queryLen];
        int queryIdx=0;
        
        do{  
        int matchCount=0;    
        for (int idx=0; idx<stringsLen; idx++){
            boolean match=matches(strings[idx],queries[queryIdx]);
            if(match){
                matchCount++;             
            } 
        }
        results[queryIdx]=matchCount;
        queryIdx++;
        }while(queryIdx<queryLen);    
        return results;
    }
    
    static boolean matches(String patternA, String patternB){
        Pattern pattern=Pattern.compile(patternA, Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(patternB);
        boolean matchFound=matcher.find();
        return matchFound;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}