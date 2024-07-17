package com.ravi.grooking;

public class MaxSumInK {

    public static void main(String[] args) {
        MaxSumInK sw = new MaxSumInK();
        System.out.println(sw.getTheSum(new int[]{2, 1, 5, 1, 3, 2}, 3));
        System.out.println(sw.getTheSum(new int[]{2, 3, 4, 1, 5}, 2));
    }

    private int getTheSum(int[] input, int k) {
        int maxSum = Integer.MIN_VALUE;
        int interimSum = 0;
        int firstIndex = 0;
        for (int i = 0; i < input.length; i++) {
            if (i >= k) {
                if (maxSum < interimSum) {
                    maxSum = interimSum;
                }
                interimSum -= input[firstIndex++];
            }
            interimSum += input[i];

        }

        return maxSum;
    }
}
