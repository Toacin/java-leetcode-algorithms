package LeetCode.Easy;

public class cheapestStockPrice {
    public static int maxProfit(int[] prices) {
        // keep track of the lowest price thus far and the highest profit made thus far
        int currentLowestPrice = 10001;
        int highestProfit = 0;

        // update lowest price and highest price accordingly
        for (int price: prices) {
            if (price < currentLowestPrice) currentLowestPrice = price;
            if (price-currentLowestPrice > highestProfit) highestProfit = price-currentLowestPrice;
        }

        return highestProfit;
    }
}
