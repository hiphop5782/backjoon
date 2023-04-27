package judge.q10950;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for(int i=0 ; i < size; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			System.out.println(a + b);
		}
		sc.close();
	}
}
