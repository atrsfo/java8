package com.company.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> intStrings = Arrays.asList("1","5","12","20");
		
		
		convertStringToInteger(intStrings);
		
		
	}

	private static void convertStringToInteger(List<String> intStrings) {
		// TODO Auto-generated method stub
		
		List<Integer> ints =  intStrings.stream().map(s->Integer.parseInt(s)).collect(Collectors.toList());		
		ints.stream().forEach(e->System.out.println(e));
	}

}
