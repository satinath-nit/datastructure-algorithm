package com.example.demo.array;

public class FindMaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        int maxConsecutiveCount =0;
        int maxConsecutiveCountTmp =0;
        boolean isZeroReceived = false;
        for(int i =0;i<nums.length ;i++){
            if(nums[i] ==1){
                maxConsecutiveCount ++;
                if(maxConsecutiveCount>=maxConsecutiveCountTmp){
                    maxConsecutiveCountTmp = maxConsecutiveCount;
                }

            }else{
                isZeroReceived = true;
                maxConsecutiveCount = 0;
                continue;
            }

        }
        System.out.println(maxConsecutiveCountTmp);
    }
}
