import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner();
         int N = Integer.parseInt(input.nextInt());

            for (var index = 0; index < N; index++)

            {
                
                word = input.nextLine();

                for (int even = 0; even < word.Length; even++)
                {
                    if (even % 2 == 0)
                        System.out.print(word[even]);
                }

                System.out.print(" ");

                for (int odd = 0; odd < word.Length; odd++)
                {
                    if (odd % 2 != 0)
                        System.out.print(word[odd]);
                }

                System.out.println();
    }
}
