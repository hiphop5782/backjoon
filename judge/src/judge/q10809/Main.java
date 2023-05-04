package judge.q10809;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String origin = Arrays.stream(args).reduce((b,a)->b.concat(" ").concat(a)).get();
		Scanner sc = new Scanner(origin);
//		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		sc.close();
		
		int[] alpha = new int[26];
		for(int i=0; i < alpha.length; i++)
			alpha[i] = -1;
		for(int i=0; i<word.length(); i++) {
			int ch = word.charAt(i);
			ch -= 'a';
			if(alpha[ch] == -1) {
				alpha[ch] = i;
			}
		}
		
		for(int i=0; i < alpha.length; i++) {
			System.out.print(alpha[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
}
