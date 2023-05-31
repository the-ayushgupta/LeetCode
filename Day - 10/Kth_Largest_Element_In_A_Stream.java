class Kth_Largest_Element_In_A_Stream {
    ArrayList<Integer> num;
    int a;
    public KthLargest(int k, int[] nums) {

        a=k;
        num = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            num.add(i,nums[i]);
        }
    }
    
    public int add(int val) {
        num.add(val);
        Collections.sort(num);
        return num.get(num.size()-a);
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
