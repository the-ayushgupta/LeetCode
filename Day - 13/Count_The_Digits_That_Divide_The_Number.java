class Count_The_Digits_That_Divide_The_Number {
    public int countDigits(int num) {
        
        int c = 0;
        String s = String.valueOf(num);

        for(char x:s.toCharArray())
        {
            int a = Integer.parseInt(String.valueOf(x));
            if(num%a == 0)
            {
                c++;
            }
        }
        return c;
    }
}
