package judge.q1546;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		String origin = Arrays.stream(args).reduce((b,a)->b.concat(" ").concat(a)).get();
//		Scanner sc = new Scanner(origin);
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] score = new int[size];
		for(int i=0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		sc.close();
		
		int max = score[0];
		for(int i=1; i < score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			}
		}
		double total = 0;
		for(int i=0; i < score.length; i++) {
			double newScore = (double)score[i] * 100 / max;
			total += newScore;
		}
		double average = total / score.length;
		System.out.println(average);
		
	}
}
