import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      String todo;
      List<Integer> list=new ArrayList<>();
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      for (int num=0; num<n; num++){
        int number=input.nextInt();
        list.add(number);
      }
      int q=input.nextInt();
      for(int query=0; query<q; query++){
         todo=input.nextLine();
          System.out.println(n+"\n"+list+"\n"+q+"\n"+todo);

      }

      input.close();
    }
}
