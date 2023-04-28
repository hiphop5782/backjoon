package judge.q10952;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int a = sc.nextInt(), b = sc.nextInt();
			if(a == 0 && b == 0) break;
			int c = a + b;
			System.out.println(c);
		}
		sc.close();
	}
}
