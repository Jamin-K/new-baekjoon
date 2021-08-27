package greedy_algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
//활동선택문제
public class baekjoon1931 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int office = Integer.parseInt(br.readLine());
		int time[][] = new int[office][2];
		
		
		
		
		for(int i = 0 ; i<time.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			time[i][0]= Integer.parseInt(st.nextToken());
			time[i][1]= Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(time, new Comparator<int[]>(){ //Comparator는 오름차순 이외의 기준으로 정렬가능, Comparable은 오름차순 정렬

			@Override
			public int compare(int[] o1, int[] o2) { 
				// TODO Auto-generated method stub
				if(o1[1] == o2[1]) { //arr배열의 1번 인덱스 값이 같을 경우 
					return o1[0] - o2[0]; //0번 인덱스 값이 작은 순으로 정렬
				}
				else
					return o1[1]-o2[1];
				
			}
			
		});
		int tmp = time[0][1];
		int result = 1;
		for(int i = 1 ; i<time.length ; i++) {
			if(tmp <= time[i][0]) {
				tmp = time[i][1];
				result++;
			}
		}
		
		
	
		
		br.close();
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
	}

}
