package InterviewPreparation.DictionaryHashMap;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoStrings {

	static String twoStrings(String s1, String s2) {

		String[] controlWord = s1.split("");
		String[] testWord = s2.split("");
		String result = "NO";
		int letterCount = 1;
		HashMap<String, Integer> input = new HashMap<String, Integer>();

		for (int idx = 0; idx < controlWord.length; idx++) {
			if (!input.containsKey(controlWord[idx])) {
				input.put(controlWord[idx], letterCount);
			} else {
				input.put(controlWord[idx], input.get(controlWord[idx]) + 1);
			}
		}

		for (int idx = 0; idx < testWord.length; idx++) {
			if (input.containsKey(testWord[idx])) {
				result = "YES";
				break;
			}

		}
		return result;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s1 = scanner.nextLine();

			String s2 = scanner.nextLine();

			String result = twoStrings(s1, s2);

			bufferedWriter.write(result);
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}
