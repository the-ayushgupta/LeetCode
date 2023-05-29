class Solution {
public:
    int arraySign(vector<int>& nums) {
        
        int ans = 1;
        for (auto i:nums) {
            if (i==0) {
                return 0;
                break;
            }
            if (i<0) {
                ans = -ans;
            }
        }
        return ans;
    }
};
