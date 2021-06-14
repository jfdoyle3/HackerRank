import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
  
       String fizz="Fizz";
       String buzz="Buzz";
       String fizzBuzz=fizz+buzz;
       
        for(int num=1; num<=100; num++){
            
            if(num%3==0 && num%5!=0)
                System.out.println(fizz);
            
            if(num%5==0 && num%3!=0 )
                System.out.println(buzz);
            
            if(num%3==0 && num%5==0)
                System.out.println(fizzBuzz);
                
            if(num%3!=0 && num%5!=0)
                System.out.println(num);
        }
       
    }
}