package org;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert your comma separated integers.");
		String str = scan.nextLine();

		int[] numbers = Arrays.stream(str.split(",")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(numbers);

		if (numbers.length % 2 == 1) {
			System.out.println(numbers[numbers.length / 2]);
		} else {
			double result = (numbers[numbers.length / 2 - 1] + numbers[numbers.length / 2]) / 2.0;
			System.out.println(result);
		}
	}
}
