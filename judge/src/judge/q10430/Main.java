package judge.q10430;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		int v1 = (a + b) % c, v2 = ((a % c) + (b % c)) %c;
		int v3 = (a * b) % c, v4 = ((a % c) * (b % c)) % c;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
	}
}
