package judge.q2588;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		sc.close();
		
		int step1 = a * (b % 10), step2 = a * (b / 10 % 10), step3 = a * (b / 100 % 10);
		int result = step1 + step2 * 10 + step3 * 100;
		System.out.println(step1);
		System.out.println(step2);
		System.out.println(step3);
		System.out.println(result);
	}
}
