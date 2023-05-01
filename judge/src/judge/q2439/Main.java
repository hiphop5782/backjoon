package judge.q2439;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		sc.close();
		
		StringBuilder builder = new StringBuilder();
		for(int i=0; i < size; i++) {
			for(int j=0; j < size-i-1; j++) {
				builder.append(" ");
			}   
			for(int j=0; j <= i; j++) {
				builder.append("*");
			}
			builder.append("\n");
		}
		System.out.println(builder.toString());
	}
}
