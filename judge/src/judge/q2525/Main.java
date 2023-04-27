package judge.q2525;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt(), minute = sc.nextInt(), time = sc.nextInt();
		sc.close();
		
		int sum = hour * 60 + minute + time;
		int hour2 = sum / 60 % 24;
		int minute2 = sum % 60;
		System.out.println(hour2 + " " + minute2);
	}
}
