package bj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_막대기_1094 {
	
	static int X;
	static int cnt;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		X = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= X; i <<= 1) {
			if((i & X) == i) cnt++;
		}
		
		System.out.println(cnt);
	}
}
