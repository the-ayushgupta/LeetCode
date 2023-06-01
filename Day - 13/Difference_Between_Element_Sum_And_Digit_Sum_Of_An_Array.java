class Difference_Between_Element_Sum_And_Digit_Sum_Of_An_Array {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int digit_sum = 0;

        for(int i : nums)
        {
            sum += i;
            int z = i;

            while(z>0)
            {
                int y = z%10;
                digit_sum += y;
                z /= 10;
            }
        }
        //System.out.println(sum+""+digit_sum);
        int s3 = (int) Math.abs(sum - digit_sum);
        return s3;
    }
}
