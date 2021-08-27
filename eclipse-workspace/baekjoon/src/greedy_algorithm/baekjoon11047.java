package greedy_algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class baekjoon11047 {
	public static void main(String args[])throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int coin = Integer.parseInt(st.nextToken());
		int total = Integer.parseInt(st.nextToken());
		int result = 0;
		int coinsArr[] = new int[coin];
		for(int i = coinsArr.length-1 ; i>=0; i--) {
			coinsArr[i] = Integer.parseInt(br.readLine());
		}
		
		br.close();
		
		for(int i = 0 ; i<coinsArr.length; i++) {
			while(total>0) {
				if(total % coinsArr[i] == 0) {
					total = total - coinsArr[i];
					result++;
				}
				else if(total > coinsArr[i]) {
					total = total - coinsArr[i];
					result++;
				}
				else
					break;
			}
		}
		
		
		
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		
		
		
		
		
		
		
		
	}

}
