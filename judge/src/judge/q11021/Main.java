package judge.q11021;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		StringBuilder builder = new StringBuilder();
		for(int i=1; i <= size; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			int c = a + b;
			builder.append("Case #");
			builder.append(i);
			builder.append(": ");
			builder.append(c);
			builder.append("\n");
		}
		sc.close();
		
		System.out.println(builder.toString());
	}
}
