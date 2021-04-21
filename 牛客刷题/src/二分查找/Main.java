package 二分查找;

/**
 * Copyright Copyright 2021 ChuXin WuHan Inc.
 *
 * @author 曾明旺
 * @date 2021/4/19 5:16 下午
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {

    }

    public int search(int[] nums,int target){
        int i=0;                    //index
        int j=nums.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                j=mid+1;
            }else if(nums[mid]<target){
                i=mid-1;
            }
        }
        return -1;
    }
}
