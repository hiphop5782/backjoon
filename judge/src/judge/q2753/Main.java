package judge.q2753;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		boolean leap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		System.out.println(leap ? 1 : 0);
	}
}
