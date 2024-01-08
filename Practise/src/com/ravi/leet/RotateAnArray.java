package com.ravi.leet;

public class RotateAnArray {
    public static void main(String[] args) {
        new RotateAnArray().rotate2(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
        new RotateAnArray().rotate2(new int[]{-1, -100, 3, 99}, 2);
        new RotateAnArray().rotate2(new int[]{1, 2}, 1);
        new RotateAnArray().rotate2(new int[]{1, 2}, 3);
        new RotateAnArray().rotate2(new int[]{1, 2, 3}, 4);
        new RotateAnArray().rotate2(new int[]{1, 2, 3, 4, 5, 6}, 4);
        new RotateAnArray().rotate2(new int[]{1}, 2);

        new RotateAnArray().rotate1(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
        new RotateAnArray().rotate1(new int[]{-1, -100, 3, 99}, 2);
        new RotateAnArray().rotate1(new int[]{1, 2}, 1);
        new RotateAnArray().rotate1(new int[]{1, 2}, 3);
        new RotateAnArray().rotate1(new int[]{1, 2, 3}, 4);
        new RotateAnArray().rotate1(new int[]{1, 2, 3, 4, 5, 6}, 4);
        new RotateAnArray().rotate1(new int[]{1}, 2);
    }


    public void rotate1(int[] nums, int k) {
        int newInd = 0;
        int count = 0;
        int[] nums1 = new int[nums.length];
        System.arraycopy(nums, 0, nums1, 0, nums.length);
        while (k > nums.length) {
            k = Math.abs(k - nums.length);
            if (k == nums.length) {
                return;
            }
        }

        while (count < nums.length) {
            nums[k++] = nums1[newInd++];
            if (k == nums.length)
                k = 0;
            count++;
        }

        for (int num : nums) {
            System.out.print(num + "\t");
        }
        System.out.println();

    }

    public void rotate2(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, k, nums.length - 1);
        reverse(nums, 0, k - 1);

        for (int num : nums) {
            System.out.print(num + "\t");
        }
        System.out.println();

    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }


}
