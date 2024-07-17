package com.ravi.grooking;

public class MinWindowForSumInK {

    public static void main(String[] args) {
        MinWindowForSumInK sw = new MinWindowForSumInK();
        System.out.println(sw.getTheSum(new int[]{2, 1, 5, 2, 3, 2}, 7));
        System.out.println(sw.getTheSum(new int[]{2, 1, 5, 2, 8}, 7));
        System.out.println(sw.getTheSum(new int[]{3, 4, 1, 1, 6}, 8));
    }

    private int getTheSum(int[] input, int k) {
        int min_window = Integer.MAX_VALUE;
        int firstIndex = 0;
        int interimSum = 0;
        int currentLenght = 0;
        for (int j : input) {
            interimSum += j;
            currentLenght++;
            while (interimSum - input[firstIndex] >= k) {
                interimSum -= input[firstIndex++];
                currentLenght--;
            }
            if (interimSum >= k) {
                min_window = Math.min(min_window, currentLenght);
            }


        }

        return min_window;
    }
}
