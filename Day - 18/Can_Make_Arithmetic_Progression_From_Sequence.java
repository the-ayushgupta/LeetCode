class Can_Make_Arithmetic_Progression_From_Sequence {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d = arr[1] - arr[0];

        for(int i = 2;i < arr.length;i++)
        {
            if((arr[i] - arr[i-1]) != d)
            {
                return false;
            }
        }
        return true;
    }
}
