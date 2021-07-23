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
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */

    public static void checkMagazine(List<String> magazine, List<String> note) {
  HashMap<String, Integer> words=new HashMap<String, Integer>();
        int wordCount=0;
        int noteLength=note.size();
        for (String word : magazine){
            if(words.containsKey(word)){
                words.put(word,words.get(word)+1);
            } else{
                words.put(word,1);
            }
        }

        for(String noteWord : note){       
            if(words.containsKey(noteWord) && words.get(noteWord)>=1){
              wordCount++;
              int value=words.get(noteWord);
              value--;
              words.put(noteWord,value);
            }
        }
		
        System.out.print(wordCount==noteLength ? "Yes" : "No");

    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);

        int n = Integer.parseInt(firstMultipleInput[1]);

        List<String> magazine = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .collect(toList());

        List<String> note = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .collect(toList());

        Result.checkMagazine(magazine, note);

        bufferedReader.close();
    }
}
