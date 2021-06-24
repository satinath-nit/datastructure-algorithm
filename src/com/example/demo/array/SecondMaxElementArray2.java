package com.example.demo.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondMaxElementArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int[] tab = {12, 1, 21, 8,8,1}; List<Integer> list =
		 * Arrays.stream(tab).boxed().sorted().distinct().collect(Collectors.toList());
		 * System.out.println(list);
		 */

		// Second larger element and its position(s)
		//int[] tab = { 12, 1, 21, 13, 8, 8, 13 ,0,12};
		int[] arr= {15,13,13,13,12,14,13,15,15, 12, 1, 21, 13, 8, 8, 13 ,15,0,12};
		/*int[] tmp = Arrays.copyOf(arr, arr.length);
		int secMax = 0;
		Arrays.sort(tmp);
		secMax = tmp[tmp.length - 2];
		System.out.println(secMax);
		List<Integer> positions = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == secMax) {
				positions.add(i);
			}
		}
		System.out.println(positions);
		*/
	}

}
