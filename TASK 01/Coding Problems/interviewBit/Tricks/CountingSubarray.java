package interviewBit.Tricks;

import java.util.ArrayList;

public class CountingSubarray {
    public int solve(ArrayList<Integer> A, int B) {
        int ans =0;
        int n = A.size();
        
        int left=0;
        int right=0;
        int sum=0;
        while(right<n){
        
            sum+=A.get(right);
        
            while(sum>=B && left<=right){
                sum-=A.get(left);
                left++;
        }
        
            ans+=(right-left+1);
        
            right++;
       
        }
    
        return ans;
    }
}
