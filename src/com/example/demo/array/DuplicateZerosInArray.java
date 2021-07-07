package com.example.demo.array;

import java.util.Arrays;

public class DuplicateZerosInArray {
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
        System.out.println(Arrays.asList(arr));
    }

    public static void duplicateZeros(int[] arr) {
        //Input: [0,1,2,3,0,4,5,0]
        //[1,0,0,2,3,0,0,4]

        int capacity = arr.length -1;
        for (int i = 0; i < capacity ; i++) {
            if (arr[i] == 0) {
                for (int j = capacity - 1; j > i; j--) {
                    arr[j + 1] = arr[j];
                }

                arr[i + 1] = 0;
                i++;
            }
        }
      /*  for (int i: arr
             ) {
            System.out.println(i);

        }
*/
    }
    }
