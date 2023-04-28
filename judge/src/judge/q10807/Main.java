package judge.q10807;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] n = new int[size];
		for(int i=0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}
		int v = sc.nextInt();
		sc.close();
		
		int count = 0;
		for(int i=0; i < n.length; i++) {
			if(n[i] == v) count++;
		}
		System.out.println(count);
	}
}
