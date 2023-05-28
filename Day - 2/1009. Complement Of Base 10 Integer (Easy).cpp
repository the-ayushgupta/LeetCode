// COMPLEMENT OF BASE-10 INTEGER

class Solution {
public:
    int bitwiseComplement(int n) {
        
        int m = n;
        int cover = 0;

        if (n==0) 
            return 1;

        while(m!=0) {
            cover = (cover << 1) | 1;
            m = m >> 1;
        }
        int ans = (~n) & cover;
        return ans;
    }
};
