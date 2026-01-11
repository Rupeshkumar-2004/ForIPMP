package interviewBit.Tricks;

public class MaximumOne {
    public int solve(int[] A, int B) {
        int maxLen = Integer.MIN_VALUE;
        int count = 0;
        int left = 0;
        
        for(int right = 0; right < A.length; right++){
            if(A[right] == 0) count++;
            
            while(count > B){
                if(A[left] == 0) count--;
                
                left++;
            }
            
            maxLen =Math.max(maxLen , right-left+1);
        }
        
        return maxLen;
    }
}
