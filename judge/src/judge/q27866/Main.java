package judge.q27866;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int position = sc.nextInt();
		sc.close();
		
		System.out.println(line.charAt(position-1));
	}
}
