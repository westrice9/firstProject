package leetcode;

public class MaxProfit {
    public static void main(String[] args) {
        int[]prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i =0;i<prices.length;i++){
            for (int a = 1;a<prices.length-1;a++)
            if (prices[a]-prices[i]>0&&prices[a]-prices[i]>profit){
                profit = prices[a]-prices[i];
            }
        }
        return profit;
    }
}
