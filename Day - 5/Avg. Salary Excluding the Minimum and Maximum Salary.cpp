class Solution {
public:
    double average(vector<int>& salary) {
        
        double ans  = 0;
        sort(salary.begin(),salary.end());
        salary.erase(salary.begin());
        salary.pop_back();
        double x = salary.size();
        for(int i = 0;i<x;i++) 
        {
            ans += salary[i];
        }
        return ans/x;
    }
};
