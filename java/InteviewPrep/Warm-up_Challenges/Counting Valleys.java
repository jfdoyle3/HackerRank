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

    public static int countingValleys(int steps, String path) {
    String[] aPath=path.split("");
    int seaLevel=0;
    int height=0;
    boolean valley=false;
    int counter=0;
    // start into valley -1 / down  // end +1 /up and out
    // valley enter 2 units deep.
    // climbs out 2 units high to sea level 0;
    for (int idx=0; idx<steps; idx++){
     if (aPath[idx].equals("D")){
         height--;
   //      System.out.println(aPath[idx]+" : "+height);
     }
     if (aPath[idx].equals("U")){
         height++;
  //       System.out.println(aPath[idx]+" : "+height);
     }
//      if (height==0){
//          counter++;
//     }
     if (height < 0 && !valley){
         valley=true;
         counter ++;
          System.out.println(aPath[idx]+" : "+height);
         System.out.println("c: "+counter);
        
     } else {
         valley=false;
     }
 System.out.println("valley: "+valley);
    if (valley){
        continue;
    }
  //  System.out.println(valley+" : "+height);
    }
 //  System.out.println("result: "+counter);
    return counter-1;
    } 
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
