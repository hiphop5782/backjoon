package judge.q25314;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		sc.close();
		
		StringBuffer buffer = new StringBuffer("long int");
		for(int i=1; i < (size+3) / 4; i++) {
			buffer.insert(0, "long ");
		}
		System.out.println(buffer.toString());
	}
}
