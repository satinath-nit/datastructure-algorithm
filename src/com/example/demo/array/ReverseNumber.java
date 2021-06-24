package com.example.demo.array;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123456;
		
		/*
		 * String numStr = Integer.toString(num); for(int i =numStr.length()-1; i>=0
		 * ;i--) { System.out.print(numStr.charAt(i)); }
		 */
		
		int rev= 0;
		while(num>0) {
			int reminder = num%10;
			rev = rev*10+reminder;
			num = num/10;
		}
		System.out.println(rev);
	}

}
