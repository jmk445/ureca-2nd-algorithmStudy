package boj.p1004_어린왕자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1004 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 0; t < T; t++) {
			int cnt =  0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			int N = Integer.parseInt(br.readLine());
			for(int i = 0; i < N; i++) {
				st =  new StringTokenizer(br.readLine());
				double dist = getDist(Integer.parseInt(st.nextToken()),Integer.parseInt( st.nextToken()));
			}
		}
		
		
	}
	
	static double getDist(int fromX, int fromY, int toX, int toY) {
		return Math.abs(Math.pow(toX-fromX, 2) + Math.pow(toY - fromY, 2));
	}
}
