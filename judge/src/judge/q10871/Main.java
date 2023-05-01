package judge.q10871;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt(), value = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i=0; i < size; i++) {
			if(arr[i] < value) {
				System.out.print(arr[i]);
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
