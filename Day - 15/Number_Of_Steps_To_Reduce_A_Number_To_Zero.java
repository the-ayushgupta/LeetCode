class Number_Of_Steps_To_Reduce_A_Number_To_Zero {
    public int numberOfSteps(int num) {
        int count = 0;
        while(num!=0)
        {
            if(num%2==0)
            {
                num = num/2;
            }
            else
            {
                num = num - 1;
            }
            count++;
        }
        return count;
    }   
}
