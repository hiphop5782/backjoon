package judge.q11382;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long v1 = sc.nextLong();
		long v2 = sc.nextLong();
		long v3 = sc.nextLong();
		sc.close();
		
		long result = v1 + v2 + v3;
		System.out.println(result);
	}
}
