package boj.p1051;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1051 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[][] map = new int[N][M];
		for(int i = 0; i < N; i ++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int hor = N < M ? N : M;
		
		for(int i = 0; i < N; i++) {
			for(int s = 0; s <= M - hor; s++) {
				if(map[i][s + hor] == map[i][s] && map[i+hor][s] == map[i][s] && map[i+hor][s+hor] == map[i][s]) {
					System.out.println(hor * hor);
					return;
				}
			}
		}
				
		
		
	}
}
