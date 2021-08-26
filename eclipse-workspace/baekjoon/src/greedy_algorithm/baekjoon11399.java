package greedy_algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon11399 {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int result = 0;
		String s1  = br.readLine();
		int people = Integer.parseInt(s1);
		int arr[] = new int[people];
		String s2 = br.readLine();
		String arrSt[] = s2.split(" ");
		
		for(int i = 0 ; i<arr.length; i++) {
			arr[i] = Integer.parseInt(arrSt[i]);
		}
		
		for(int i = 0 ; i<arr.length ; i++) {
			for(int j = arr.length-1 ; j>i ; j--) {
				if(arr[i] >= arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for(int i = 0 ; i<arr.length;i++) {
			for(int j = 0 ; j<=i; j++) {
				result = result + arr[j];
			}
		}
			
		
		br.close();
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		
		
	}

}
