import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // fine=0; if return on time or before
        //late fine=15*(days late<31);
        //late fine=500*(months late);
        //late fine=10000 (after a year);
        
        Scanner input=new Scanner(System.in);
        String date=input.nextLine();
        String dueDate=input.nextLine();
        String[] strArrayDate=date.split(" ");
        String[] strArryDueDate=dueDate.split(" ");
        int[] intDate=new int[strArrayDate.length];
        int[] intDueDate=new int[strArrayDueDate.length];    
       
       
    }
}
