import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       // Boolean isPrime=true;
       int counter=1;
       
       // Initialize Scanner for input
        Scanner input=new Scanner(System.in);
        
        // Input number of test cases
        int testCases=input.nextInt();
        
        //Loop through number of test cases
        for(int num=0; num<testCases; num++){
            
            // input test case numbers
            int testNum=input.nextInt();
            
            //take the square root of number
            double sqrtNum=Math.sqrt(testNum);
             
           // System.out.println(sqrtNum);
           
             // loop from highest of square root to lowest
             for(double i=sqrtNum-1; i>=2; i--){
                 
                // if square root  modulo of number equals then it's prime
                if(sqrtNum%i==0){
                //    System.out.println(i+"  Prime");
                    counter=1;
                      
                }
                // if square root modulo of number is greater than zero it's not prime   
                if(sqrtNum%i>0) {
                //    System.out.println(i+"  Not Prime");
                  //  isPrime=false;
                    counter++;
                }
               // System.out.printf("I:  %f\tsr: %f\n",i,sqrtNum%i);
             } 
           System.out.println(counter);     
            String results=(counter==2) ? "Prime" : "Not prime";
            System.out.println(results);
            }
        }
    }
