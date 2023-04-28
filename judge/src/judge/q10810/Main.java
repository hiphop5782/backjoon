package judge.q10810;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int size = sc.nextInt();
		
		int[] basket = new int[range];
		for(int i=0; i < size; i++) {
			int begin = sc.nextInt(), end = sc.nextInt(), number = sc.nextInt();
			for(int k=begin; k<=end; k++) {
				basket[k-1] = number;
			}
		}
		sc.close();
		
		for(int number : basket) {
			System.out.print(number);
			System.out.print(" ");
		}
		System.out.println();
	}
}
