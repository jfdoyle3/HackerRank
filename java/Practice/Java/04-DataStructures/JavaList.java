import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        int listSize=scan.nextInt();
         
         // create the list.
        for(int idx=0; idx<listSize; idx++)
            list.add(scan.nextInt());
        
        // Get Query
        int queries=scan.nextInt();
        // System.out.println("q|"+queries);
        for(int qry=0; qry<queries; qry++){
            String query=scan.next();
            if(query.equals("Insert")){
                int index=scan.nextInt();
                int number=scan.nextInt();
                list.add(index,number);
                }
            if(query.equals("Delete")){
                int index=scan.nextInt();
                list.remove(index);
            }
        }
         
        for(Integer num : list)
            System.out.print(num+" ");
            
         scan.close(); 
    }
}
