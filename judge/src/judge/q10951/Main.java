package judge.q10951;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int a = sc.nextInt(), b = sc.nextInt();
			int c = a + b;
			System.out.println(c);
		}
		sc.close();
	}
}
