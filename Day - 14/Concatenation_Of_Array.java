import java.util.*;
class Concatenation_Of_Array {
    public int[] getConcatenation(int[] nums) {
        int l1 = nums.length;
        int l2 = 2*l1;
        int[] ans = new int[l2];

        for(int i = 0;i < l1;i++)
        {
            ans[i] = nums[i];
            ans[l1+i] = nums[i];
        }
        nums = ans;
        return ans;
    }
}
