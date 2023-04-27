package judge.q8393;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		
		int total = 0;
		for(int i=1; i <= number; i++)
			total += i;
		System.out.println(total);
	}
}
