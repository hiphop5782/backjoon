package judge.q2480;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d1 = sc.nextInt(), d2 = sc.nextInt(), d3 = sc.nextInt();
		sc.close();
		
		int award;
		//셋 다 같은 값인 경우
		if(d1 == d2 && d2 == d3) 
			award = 10000 + d1 * 1000;
		//두 개가 같은 값인 경우
		else if(d1 == d2) 
			award = 1000 + d1 * 100;
		else if(d2 == d3)
			award = 1000 + d2 * 100;
		else if(d1 == d3)
			award = 1000 + d3 * 100;
		//셋 다 다른 값인 경우
		else {
			if(d1 > d2 && d1 > d3) {
				award = d1 * 100;
			}
			else if(d2 > d1 && d2 > d3) {
				award = d2 * 100;
			}
			else {
				award = d3 * 100;
			}
		}
		System.out.println(award);
	}
}
