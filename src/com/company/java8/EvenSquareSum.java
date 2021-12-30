package com.company.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenSquareSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 3, 9, 4, 1);

		findEvenSquareSum(numbers);

	}

	private static void findEvenSquareSum(List<Integer> numbers) {
		// TODO Auto-generated method stub
		int result = numbers.stream().filter(i -> i % 2 == 0).map(e -> e * e).collect(Collectors.summingInt(e -> e));

		System.out.print(result); // 2sq + 4sq + 6sq + 4sq = 4 + 16+ 36 + 16 = 72
	}

}