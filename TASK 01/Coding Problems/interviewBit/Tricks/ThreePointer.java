package interviewBit.Tricks;

public class ThreePointer {
    public int minimize(final int[] A, final int[] B, final int[] C) {
        int i =0;
        int j =0;
        int k =0;
        
        int ans =Integer.MAX_VALUE;
        while(i < A.length && j < B.length && k < C.length){
            ans = Math.min(ans , MaxiAbs(A[i],B[j],C[k]));
            
            int min = Math.min(A[i],Math.min(B[j],C[k]));
            
            if(min == A[i]) i++;
            else if (min == B[j]) j++;
            else k++;
        }
        
        return ans;
    }
    
    private int MaxiAbs(int a , int b, int c){
        return Math.max(Math.abs(a-c),Math.max(Math.abs(b-c) , Math.abs(a-b)));
    }
}
