package com.example.demo.array;

import java.util.Arrays;
import java.util.Iterator;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min= Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		int[] arr = {3,5,8,12};
		
		for (int i : arr) {
			if(i<min) {
				min =i;
			}
			if(i>max) {
				max =i;
			}
		}
		
		System.out.println(min);
		System.out.println(max);
		
		
		int asInt = Arrays.stream(arr).min().getAsInt();
		int max1 =Arrays.stream(arr).max().getAsInt();
		
		System.out.println(asInt+" "+max1);
		
		String s ="satinath";
		char[] charArray = s.toCharArray();
		Arrays.sort(charArray);
		System.out.println(charArray);
	}

}
