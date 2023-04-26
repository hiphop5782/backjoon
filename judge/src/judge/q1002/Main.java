package judge.q1002;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		for(int i=0; i < size; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			//동일한 원 제거(-1)
			if(x1 == x2 && y1 == y2 && r1 == r2) {
				System.out.println(-1);
				continue;
			}
			
			//거리차 구하여 5가지 경우로 계산
			int dx = Math.abs(x1 - x2);
			int dy = Math.abs(y1 - y2);
			double d = Math.sqrt(dx*dx+dy*dy);
			int gap = Math.abs(r1 - r2);
			
			//[1] 외부에 있으며 만나지 않는 경우
			if(d > r1 + r2) {
				System.out.println(0);
			}
			//[2] 외부에 있으며 접하는 경우
			else if(d == r1 + r2) {
				System.out.println(1);
			}
			//[3] 외부에 있으며 교차하는 경우
			else if(gap < d && d < r1+r2) {
				System.out.println(2);
			}
			//[4] 내부에 있으며 접하는 경우
			else if(d == gap) {
				System.out.println(1);
			}
			//[5] 내부에 있으며 만나지 않는 경우
			else {
				System.out.println(0);
			}
		}
		
		sc.close();
	}
}
