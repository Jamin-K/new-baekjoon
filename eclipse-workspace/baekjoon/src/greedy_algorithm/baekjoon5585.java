package greedy_algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon5585 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int total = 1000-Integer.parseInt(br.readLine());
		int result = 0;
		br.close();

		while (total > 0) {
			if (total > 500) {
				total = total - 500;
				result++;
			} else if (total % 500 == 0) {
				total = total - 500;
				result++;
			} else if (total % 100 == 0) {
				total = total - 100;
				result++;
			} else if (total % 50 == 0) {
				total = total - 50;
				result++;
			} else if (total % 10 == 0) {
				total = total - 10;
				result++;
			} else if (total % 5 == 0) {
				total = total - 5;
				result++;
			} else {
				total = total - 1;
				result++;
			}
		}

		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
	}

}
