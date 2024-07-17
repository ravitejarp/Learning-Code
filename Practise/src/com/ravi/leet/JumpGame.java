package com.ravi.leet;

public class JumpGame {
    public static void main(String[] args) {
        System.out.println(new JumpGame().isGameValid(new int[]{2, 3, 1, 1, 4}));
        System.out.println(new JumpGame().isGameValid(new int[]{2, 0}));
        System.out.println(new JumpGame().isGameValid(new int[]{1, 2, 3}));
        System.out.println(new JumpGame().isGameValid(new int[]{3, 2, 1, 0, 4}));
    }

    public boolean isGameValid(int[] nums) {
        int reachable = 0;
        for (int ind = 0; ind < nums.length; ind++) {
            if (ind > reachable) {
                return false;
            }
            reachable = Math.max(reachable, ind + nums[ind]);
        }
        return true;
    }

}
