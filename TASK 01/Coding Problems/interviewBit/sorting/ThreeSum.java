import java.util.*;
public class ThreeSum {
    public int threeSumClosest(int[] A, int B) {
        Arrays.sort(A);
        
        int threeSumClosest =A[0] + A[1] + A[2];
        
        for(int i =0 ; i<=A.length-2 ; i++){
            int start = i+1;
            int end = A.length-1;
            
            while(start < end){
                int possible = A[i]+A[start]+A[end];
                
                if(possible == B){
                    return B;
                }
                
                if(Math.abs(B-possible) < Math.abs(B-threeSumClosest)){
                    threeSumClosest = possible;
                }
                
                if(possible > B){
                    end--;
                }
                else{
                    start++;
                }
            }
        }
        
        return threeSumClosest;
    }
}
