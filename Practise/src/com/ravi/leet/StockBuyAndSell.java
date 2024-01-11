package com.ravi.leet;

public class StockBuyAndSell {
    public static void main(String[] args) {
        System.out.println(new StockBuyAndSell().getMaxProfitSingleCheck(new int[]{7, 6, 5, 4, 3, 2, 1}));
        System.out.println(new StockBuyAndSell().getMaxProfitSingleCheck(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(new StockBuyAndSell().getMaxProfitSingleCheck(new int[]{3, 3, 5, 0, 0, 3, 1, 4}));
        System.out.println(new StockBuyAndSell().getMultipleMaxProfit(new int[]{1, 9, 6, 9, 1, 7, 1, 1, 5, 9, 9, 9}));
    }

    public int getMaxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = prices[0];
        int buyInd = 0;
        int sellInd = prices.length - 1;
        int sell = prices[prices.length - 1];
        int nextBuy = Integer.MAX_VALUE;
        int nextInd = -1;
        if (sell - buy > 0) {
            maxProfit = sell - buy;
        }
        for (int index = 1; index < prices.length; index++) {
            if (buy > prices[index] && nextBuy > prices[index]) {
                if ((sell - prices[index]) > maxProfit && sellInd > index) {
                    buy = prices[index];
                    maxProfit = sell - buy;
                    buyInd = index;
                } else {
                    nextBuy = prices[index];
                    nextInd = index;
                }
            } else if (sell < prices[index] || Math.max(prices[index] - buy, prices[index] - nextBuy) > maxProfit) {
                if (buyInd < index && (Math.max(prices[index] - buy, prices[index] - nextBuy) > maxProfit) || nextInd == -1) {
                    sell = prices[index];
                    sellInd = index;
                    buy = Math.min(buy, nextBuy);
                    if (buy == nextBuy) {
                        buyInd = nextInd;
                    }
                    maxProfit = sell - buy;
                }
            }
        }

        return maxProfit;
    }

    public int getMaxProfitSingleCheck(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist;

        for (int price : prices) {
            if (price < lsf) {
                lsf = price;
            }
            pist = price - lsf;
            if (op < pist) {
                op = pist;
            }
        }
        return op;
    }

    public int getMultipleMaxProfit(int[] prices) {
        int prevSell = prices[0];
        int buyPrice = prices[0];
        int totalProfit = 0;

        for (int ind = 1; ind < prices.length; ind++) {
            if (prices[ind - 1] <= prices[ind]) {
                prevSell = prices[ind];
                if (ind + 1 == prices.length) {
                    totalProfit += prevSell - buyPrice;
                }
            } else if (prices[ind - 1] > prices[ind]) {
                totalProfit += prevSell - buyPrice;
                buyPrice = prices[ind];
                prevSell = prices[ind];

            }
        }

        return totalProfit;
    }
}
