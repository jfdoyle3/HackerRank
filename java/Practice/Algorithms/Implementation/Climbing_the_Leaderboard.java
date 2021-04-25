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

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> fakeReturn=new ArrayList<>();
        fakeReturn.add(1);
        
        List<Integer> results=new ArrayList<>();
        List<Integer> newBoard=new ArrayList<>();
        
        for (int score : ranked){
            if (!newBoard.contains(score))
                newBoard.add(score);
        }
        
        // Collections.reverse(player);
        // int rankIdx=1;
        // int newIdx=0;
        // int playerIdx=0;
        
      //  do{
      //     System.out.printf("rIdx: %d | ps: %d | nB: %d  \n",rankIdx,player.get(3),newBoard.get(4));
        //    if(player.get(3)<=newBoard.get(rankIdx-1)){
        //        rankIdx++;
        //        results.add(rankIdx);
        //    }
    //    System.out.println(newBoard);    
    //    System.out.println("\n\n\n\nRanks:\n"+results);
       hashList(newBoard,player.get(0));
        return fakeReturn;
    }
   public static void hashList(List<Integer> list, int score) {
        
        int ranking=1;
        
        HashMap<Integer,Integer> board=new HashMap<>();
        
        for(int idx=0; idx<list.size(); idx++) {
            if(board.containsKey(list.get(idx))){
                board.put(ranking++,list.get(idx));
            } else{
                board.put(ranking++,list.get(idx));
            }
        }
        
        int ranked=0;
        
        for (Map.Entry<Integer, Integer> e : board.entrySet()) {
            Integer key = e.getKey();
            Integer value = e.getValue();
         //   System.out.println(key+" | "+value);
           
            if (value<=score) { 
                //System.out.printf("s: %d   v: %d\n",score,value);
                ranked=key;
                break;
            }
        }
        if (ranked==0) {
            ranked=board.size()+1;
        }
        System.out.printf("r: %d     s: %d",ranked,score);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.climbingLeaderboard(ranked, player);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
