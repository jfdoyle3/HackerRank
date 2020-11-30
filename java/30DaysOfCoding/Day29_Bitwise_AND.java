import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	static int bitwiseAnd(int n, int k) {
		int[] sequence = new int[n];
		HashMap<Integer,Integer> results=new HashMap<>();
		for (int seq = 0; seq < sequence.length; seq++) {
			sequence[seq] = seq + 1;
		}
		int seqLength = sequence.length;
		for (int idx = 0; idx < n; idx++) {
			for (int idx2 = idx + 1; idx2 < n; idx2++) {
				int a = sequence[idx];
				int b = sequence[idx2];

				int bit = (a & b);
			//	System.out.printf("A= %d & B= %d; A&B= %d\n",a, b, bit);
				 if(results.containsKey(bit)){
		                results.put(bit,results.get(bit)+1);
		            } else{
		                results.put(bit,1);
		            }
				}
			
		}
		System.out.println(results.toString());
			return results.get(k);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			String[] nk = scanner.nextLine().split(" ");

			int n = Integer.parseInt(nk[0]);

			int k = Integer.parseInt(nk[1]);
			int countBits=bitwiseAnd(n,k);
			System.out.println("answer: "+countBits);
			
		}

		scanner.close();
	}
}
