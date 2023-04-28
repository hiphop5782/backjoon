package judge.q10813;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt(), size = sc.nextInt();
		int[] basket = new int[range];
		for(int i=0; i < basket.length; i++)
			basket[i] = i+1;
		
		for(int i=0; i < size; i++) {
			int x = sc.nextInt()-1, y = sc.nextInt()-1;
			int temp = basket[x];
			basket[x] = basket[y];
			basket[y] = temp;
		}
		sc.close();
		
		for(int i=0; i < basket.length; i++) {
			System.out.print(basket[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
}
