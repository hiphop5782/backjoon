package judge.q5597;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		List<Integer> data = IntStream.range(1, 31).boxed().collect(Collectors.toList());
		Scanner sc = new Scanner(System.in);
		for(int i=0; i < 28; i++) {
			int number = sc.nextInt();
			data.remove(Integer.valueOf(number));
		}
		sc.close();
		
		for(int number : data) {
			System.out.println(number);
		}
	}
}
