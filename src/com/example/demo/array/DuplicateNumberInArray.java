package com.example.demo.array;

public class DuplicateNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,5,5,7,8,9};
		
		for(int i =0; i<arr.length ;i++) {
			for(int j =i+1; j<arr.length ;j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
			
		}
	}

}
