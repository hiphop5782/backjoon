package judge.q1003;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] arr = new int[41];
		
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 1;
		
		for(int i=3; i < arr.length; i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for(int i=0; i < size; i++) {
			int n = sc.nextInt();
			if(n == 0) {
				System.out.println("1 0");
			}
			else if(n == 1) {
				System.out.println("0 1");
			}
			else {
				System.out.println(arr[n-1] + " " + arr[n]);
			}
		}
		sc.close();
	}
}
