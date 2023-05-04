package judge.q9086;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		sc.nextLine();
		for(int i=0; i < size; i++) {
			String line = sc.nextLine();
			int len = line.length();
			System.out.print(line.charAt(0));
			System.out.print(line.charAt(len-1));
			System.out.println();
		}
		sc.close();
	}
}
