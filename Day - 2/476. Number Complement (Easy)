// NUMBER COMPLEMENT

class Solution {
public:
    int findComplement(int num) {
        
        int m = num;
        int cover = 0;

        if (num==0) 
            return 1;

        while(m!=0) {
            cover = (cover << 1) | 1;
            m = m >> 1;
        }
        int ans = (~num) & cover;
        return ans;
    }
};
