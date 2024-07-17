package com.ravi.grooking;

public class SlidingWindow {

    public static void main(String[] args) {
        SlidingWindow sw = new SlidingWindow();
        float[] theAvg = sw.getTheAvg(new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2}, 5);
        for (float j : theAvg) {
            System.out.println(j);
        }
    }

    private float[] getTheAvg(int[] input, int k) {
        float[] result = new float[(input.length - k) + 1];
        int prevSum = 0;
        int firstIndex = 0;
        for (int i = 0; i < input.length; i++) {
            while (i < k) {
                prevSum += input[i];
                i++;
            }
            result[firstIndex] = (float) prevSum / k;
            prevSum += input[i];
            prevSum -= input[firstIndex++];

        }
        result[firstIndex] = (float) prevSum / k;
        return result;
    }
}
