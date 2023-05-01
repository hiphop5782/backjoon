package judge.q10818;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] data = new int[size];
		for(int i=0; i < size; i++) {
			data[i] = sc.nextInt();
		}
		sc.close();
		
		int max = data[0], min = data[0];
		for(int i=1; i < size; i++) {
			if(max < data[i])
				max = data[i];
			if(min > data[i])
				min = data[i];
		}
		System.out.println(min + " " + max);
	}
}
