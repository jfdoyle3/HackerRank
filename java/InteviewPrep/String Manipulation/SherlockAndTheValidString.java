import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isValid function below.
    static String isValid(String s) {
        String result="NO";
    
       HashMap<String, Integer> charMap = new HashMap<String, Integer>();
       String charArray[]= s.split("");
         for (String chars : charArray){
             if (charMap.containsKey(chars)){
                charMap.put(chars,charMap.get(chars)+1);
            } else{
                charMap.put(chars,1);
            }
           
         }
         for (Map.Entry entry : charMap.entrySet()) { 
          //  System.out.println(entry.getKey() + " " + entry.getValue());
            System.out.println(entry.getValue());
            
             
        } 


        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
