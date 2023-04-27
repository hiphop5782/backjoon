package judge.q25304;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int size = sc.nextInt();
		
		int check = 0;
		for(int i=0; i < size; i++) {
			int unitPrice = sc.nextInt();
			int unitSize = sc.nextInt();
			check += unitPrice * unitSize;
		}
		sc.close();
		
		if(check == total)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
