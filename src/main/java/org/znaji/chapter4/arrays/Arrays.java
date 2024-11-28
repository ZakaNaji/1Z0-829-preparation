package org.znaji.chapter4.arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] nums;//all forms to declare an array: int[] nums; int nums[]; int[] nums = new int[3]; int[] nums = {1, 2, 3};
        nums = new int[2];
        nums[0] = 1;
        nums[1] = 2;
        //nums[2] = 3;// ArrayIndexOutOfBoundsException
        System.out.println(nums[0]);
        System.out.println(nums[1]);

        nums = new int[]{10, 20, 30};
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);

        int[] nums2 = {10, 20, 30};
        System.out.println(nums.equals(nums2));//equals not overridden in arrays so it compares the reference

        //nums2 = {10, 20, 30};//compilation error => only allowed during declaration
        nums2 = new int[]{10, 20, 30};//allowed => {} is used to initialize the array
    }
}
