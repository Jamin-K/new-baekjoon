package greedy_algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon1541 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String spl_sub[] = br.readLine().split("-"); //정수 또는 +정수
		String spl_plus[] = new String[spl_sub.length]; // +정수만 저장
		int spl2[] = new int[spl_sub.length];
		int total = 0;
		

		br.close();

		for (int i = 0; i < spl_plus.length; i++) {
			spl_plus[i] = "0";
		}
		
		for (int i = 0; i < spl_sub.length; i++) {
			if (spl_sub[i].contains("+")==true) { // 여기서 안걸림
				
				spl_plus = spl_sub[i].split("\\+");

				for (int j = 0; j < spl_plus.length; j++) {
					spl2[i] = spl2[i] + Integer.parseInt(spl_plus[j]);
					
				}

				for (int k = 0; k < spl_plus.length; k++) {
					spl_plus[k] = "0";
				}

			} else if (spl_sub[i].contains("\\+") == false) {
				spl2[i] = Integer.parseInt(spl_sub[i]);
				
			}

		}

		for (int i = 0; i < spl2.length; i++) {
			if (i == 0)
				total = spl2[i];
			else
				total = total - spl2[i];
		}

		bw.write(Integer.toString(total));
		bw.flush();
		bw.close();

	}

}
