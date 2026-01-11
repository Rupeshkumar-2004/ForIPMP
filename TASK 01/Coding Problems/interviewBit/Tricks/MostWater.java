package interviewBit.Tricks;

public class MostWater {
    public int maxArea(int[] A) {
        if(A.length == 1) return 0;
        
        int i =0;
        int j = A.length-1;
        
        long ans = Long.MIN_VALUE;
        while( i < j){
            ans = Math.max(ans , (long)(j-i)*(Math.min(A[j],A[i])));
            
            if(A[j] > A[i]) i++;
            else j--;
        }
        
        return (int)ans;
    }
}
