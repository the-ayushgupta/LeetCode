class Number_of_Common_Factors {
    public int commonFactors(int a, int b) {
        int count = 0;
        for(int i = 1; i <= a;i++)
        {
            for(int j = 1; j<= b;j++)
            {
                if(i==j && a%i==0 && b%j==0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
