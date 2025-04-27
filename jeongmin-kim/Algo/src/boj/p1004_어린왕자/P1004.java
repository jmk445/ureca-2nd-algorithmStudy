package boj.p1004_어린왕자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1004 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int N = 0;
		boolean[] isInside = null;
		for(int t = 0; t < T; t++) {
			int cnt =  0;			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			N = Integer.parseInt(br.readLine());
			isInside = new boolean[N];
			for(int i = 0; i < N; i++) {
				st =  new StringTokenizer(br.readLine());
				int centerX = Integer.parseInt(st.nextToken());
				int centerY = Integer.parseInt(st.nextToken());
				int r = Integer.parseInt(st.nextToken());
				double distFrom1 = getDist(centerX, centerY, x1, y1);
				double distFrom2 = getDist(centerX, centerY, x2, y2);
				System.out.println(distFrom1 + "," + distFrom2);
				
				if(distFrom1 < r && distFrom2 < r || distFrom1 > r && distFrom2 > r) {
					isInside[i] = false;
				}else {
					isInside[i] = true;
				}
			}
			
		}
		
		for(int t = 0; t < T; t++) {
			int cnt = 0;
			for(int i = 0; i < N; i++) {
				if(isInside[i] == true) {
					cnt++;
				}
				
			}
			System.out.println(cnt);
		}
		
		
		//둘 다 포함되는 원(중심과 점 거리, 중심과 점 거리 )-> 신경 x
		//하나만 포함 -> +1
		//하나도 포함 안하면 -> 신경 x
		
		
		
	}
	
	static double getDist(int fromX, int fromY, int toX, int toY) {
		
		return Math.sqrt(Math.pow(toX-fromX, 2) + Math.pow(toY - fromY, 2));
	}
}
