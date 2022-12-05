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



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        String n = bufferedReader.readLine();
        BigInteger number=new BigInteger(n);
        boolean isPrime=number.isProbablePrime(1);
        
        if(isPrime)
          System.out.println("prime");
        else
          System.out.println("no prime");


        bufferedReader.close();
    }
}
