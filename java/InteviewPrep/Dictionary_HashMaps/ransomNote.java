import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        HashMap<String, Integer> words=new HashMap<String, Integer>();
        int wordCount=0;
        int noteLength=note.length;
        for (String word : magazine){
            if(words.containsKey(word)){
                words.put(word,words.get(word)+1);
            } else{
                words.put(word,1);
            }

        }
        for (Map.Entry<String, Integer> word : words.entrySet()) {
         for(String noteWord : note){       
     //   System.out.println(noteWord);
     //   System.out.println(word.getKey() + "=" + word.getValue());
            if(words.containsKey(noteWord)){
              //  wordCount++;
              int value=words.get(noteWord);
              value--;
              words.put(noteWord,value);
           // System.out.println(value);

            }else {
                System.out.println("Nay");
            }
         }
        }
        System.out.println(words);
        // if(counter==noteLengh){
        //     System.out.println("Yes");
        // }else {
        //     System.out.println("No");
        // }
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
