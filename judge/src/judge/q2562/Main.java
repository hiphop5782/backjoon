package judge.q2562;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] data = new int[9];
		for(int i=0; i < data.length; i++)
			data[i] = sc.nextInt();
		sc.close();
		
		int index = 0;
		for(int i=0; i < data.length; i++) {
			if(data[index] < data[i]) {
				index = i;
			}
		}
		System.out.println(data[index]);
		System.out.println(index);
	}
}
