import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "a";
        String largest = "b";
        String[] arr=new String[s.length()-2];
       System.out.println("len: "+s.length());
       System.out.println("len/k "+s.length()/k);
        
        int strLen=s.length()-2;
       
         System.out.println(strLen);

         for(int idx=0; idx<strLen; idx++){
            
            String x=s.substring(idx,idx+k);
         //   System.out.println(x);
            arr[idx]=x;
        //     smallest=x;
        //     
       //    System.out.printf("%s = %d\n",x,smallest.compareTo(largest));
            
        }
      
        for(String word : arr)
        //if(smallest.compareTo(largest)>0)
        //         largest=x;
        // if(smallest.compareTo(largest)<0)
            System.out.println(word);
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }