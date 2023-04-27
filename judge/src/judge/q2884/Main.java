package judge.q2884;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt(), minute = sc.nextInt();
		sc.close();
		
		if(minute < 45) {
			hour--;
			if(hour < 0) {
				hour += 24;
			}
			minute += 60;
		}
		minute -= 45;
		System.out.println(hour + " " + minute);
	}
}
