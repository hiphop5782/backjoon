package judge.q11720;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String word = sc.next();
		sc.close();
		
		int total = 0;
		for(int i=0; i < size; i++) {
			int n = word.charAt(i) - '0';
			total += n;
		}
		System.out.println(total);
	}
}
