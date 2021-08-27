package greedy_algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
//Ȱ�����ù���
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
		
		Arrays.sort(time, new Comparator<int[]>(){ //Comparator�� �������� �̿��� �������� ���İ���, Comparable�� �������� ����

			@Override
			public int compare(int[] o1, int[] o2) { 
				// TODO Auto-generated method stub
				if(o1[1] == o2[1]) { //arr�迭�� 1�� �ε��� ���� ���� ��� 
					return o1[0] - o2[0]; //0�� �ε��� ���� ���� ������ ����
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
