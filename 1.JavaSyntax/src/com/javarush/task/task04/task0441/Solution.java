package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = new int[3];
        for (int i=0;i<3;i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }

        int min = 0,max = 0,mid = 0;
        if(nums[0]<nums[1] && nums[0]<nums[2]){
            min = nums[0];
        }else  if(nums[1]<nums[0] && nums[1]<nums[2]){
            min = nums[1];
        }else min = nums[2];

        if(nums[0]>nums[1] && nums[0]>nums[2]){
            max= nums[0];
        }else  if(nums[1]>nums[0] && nums[1]>nums[2]){
            max = nums[1];
        }else max = nums[2];

        if(nums[0]>min && nums[0]<max){
            mid = nums[0];
        }else if(nums[1]>min && nums[1]<max){
            mid = nums[1];
        }else mid = nums[2];

        System.out.print(mid);
    }
}
