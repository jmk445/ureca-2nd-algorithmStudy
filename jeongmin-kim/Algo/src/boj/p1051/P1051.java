package boj.p1051;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1051 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] map = new int[N][M];
		
		for(int i = 0; i < N; i ++) {
			String line = br.readLine();			
			for(int j = 0; j < M; j++) {
				map[i][j] = (line.charAt(j))-'0';
			}
		}
		int hor = N < M ? N : M;
		
			
		while(hor!=0) {
			for(int i = 0; i <= N - hor; i++) {
				for(int s = 0; s <= M - hor; s++) {					
					if(map[i][s + hor-1] == map[i][s] && map[i+hor-1][s] == map[i][s] && map[i+hor-1][s+hor-1] == map[i][s]) {
						System.out.println(hor * hor);
						return;
					}
				}
			}			
			hor--;
		}
		
				
		
		
	}
}
