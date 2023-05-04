package judge.q10811;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[] basket = new int[n];
		for(int i=0; i < n; i++)
			basket[i] = i + 1;
		
		for(int i=0; i < m; i++) {
			int l = sc.nextInt(), r = sc.nextInt();
			int range = r - l + 1;
			l--; r--;
			for(int k=l; k < (l+r) / 2d; k++) {
				int other = r-k+l;
				int temp = basket[other]; 
				basket[other] = basket[k];
				basket[k] = temp;
			}
		}
		sc.close();
		
		for(int num : basket) {
			System.out.print(num);
			System.out.print(" ");
		}
		System.out.println();
	}
}
