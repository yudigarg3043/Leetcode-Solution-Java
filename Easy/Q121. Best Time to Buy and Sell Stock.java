class Solution {
    public int maxProfit(int[] prices) {
        int min = 100000, max=0;
        for(int price: prices){
            min = Math.min(min,price);
            max = Math.max(max, price-min);
        }
        return max;
    }
}