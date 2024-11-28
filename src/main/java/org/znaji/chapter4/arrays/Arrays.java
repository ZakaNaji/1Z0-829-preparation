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

        //nums2 = {10, 20, 30};//compilation error => can't infer the type of the array
        nums2 = new int[]{10, 20, 30};//allowed because the type is already known

        //Array methods
        System.out.println(nums.length);
        int nums3[] = {10, -5, 80, 0};
        java.util.Arrays.sort(nums3);
        System.out.println(java.util.Arrays.toString(nums3));
        System.out.println(java.util.Arrays.binarySearch(nums3, 80));
        System.out.println(java.util.Arrays.binarySearch(nums3, 100));//-5(theoretical position)

        System.out.println(java.util.Arrays.equals(nums, nums2));//compare the content of the arrays not the reference

        System.out.println(java.util.Arrays.compare(new int[]{1, 2, 3}, new int[]{1, 2, 3}));//0 => equal
        System.out.println(java.util.Arrays.compare(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3}));//1 => first array is greater
        System.out.println(java.util.Arrays.compare(new int[]{1, 2, 3}, new int[]{1, 2, 3, 4}));//-1 => second array is greater
        System.out.println(java.util.Arrays.compare(new String[]{"a", "b", "c"}, new String[]{"a", "b", "c"}));//0 => equal
        System.out.println(java.util.Arrays.compare(new String[]{"a", "b", "c"}, new String[]{"x", "y", "z"}));//-23 => first array is greater
        System.out.println(java.util.Arrays.compare(new String[]{"x", "y", "z"}, new String[]{"a", "b", "c"}));//23 => second array is greater

        System.out.println(java.util.Arrays.mismatch(new int[]{1, 2, 3}, new int[]{1, 2, 3}));//-1 => no mismatch
        System.out.println(java.util.Arrays.mismatch(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3}));//3 => mismatch at index 3
    }

}
