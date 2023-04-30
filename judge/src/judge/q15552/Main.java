package judge.q15552;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Scanner는 시간 초과 발생
//BufferedReader만 사용하는 경우도 시간 초과 발생
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		StringBuilder builder = new StringBuilder();
		for(int i=0; i < size; i++) {
			String line = br.readLine();
			String[] arr = line.split(" ");
			builder.append(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
			builder.append("\n");
		}
		System.out.println(builder);
	}
}
