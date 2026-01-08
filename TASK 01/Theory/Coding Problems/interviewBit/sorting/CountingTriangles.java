import java.util.*;

public class CountingTriangles {
    public int nTriang(int[] A) {
        Arrays.sort(A);
        int MOD = 1_000_000_007;
        long count =0;
        
        for(int i = A.length-1; i>=2;i--){
            int start = 0;
            int end = i-1;
            
            while(start < end){
                if(A[start] + A[end] > A[i]){
                    count = (count + (end-start))%MOD;
                    end--;
                }else{
                    start++;
                }
            }
        }
        
        return (int)count;
        
    }
}
