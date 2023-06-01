class Buy_Two_Chocolates {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int remaining_money;
        if(prices[0] + prices[1] <= money)
        {
            remaining_money = money - (prices[0] + prices[1]);
            return remaining_money; 
        }
        return money;
    }
}
