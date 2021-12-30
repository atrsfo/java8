package com.company.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		filterEvenNumbers(numbers);

	}

	/**
	 * Filter to pass through only even numbers in the list
	 * @param numbers
	 */
	private static void filterEvenNumbers(List<Integer> numbers) {
		// TODO Auto-generated method stub
		List<Integer> evenNumbers = numbers.stream().filter((number) -> {
			return number % 2 == 0;
		}

		).collect(Collectors.toList());

		evenNumbers.stream().forEach(e -> System.out.println(e));
	}

}
