package com.nt.java8;

import java.util.Arrays;
import java.util.List;

/*
 * How do you find common elements between two arrays?
 */
public class CommonValuesInArray {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

		List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
		list1.stream().filter(list2::contains).forEach(System.out::println);
	}

}
