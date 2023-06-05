class Richest_Customer_Wealth {
    public int maximumWealth(int[][] accounts) {
        int max_sum = 0;

        for(int i = 0;i < accounts.length;i++)
        {
            int sum = 0;
            for(int j = 0;j < accounts[0].length;j++)
            {
                sum += accounts[i][j];
            }
            max_sum = Math.max(max_sum,sum);
        }
        return max_sum;
    }
}
