package Theory;

import java.util.Arrays;

public class MissingAndRepeating {

    public int[] repeatedNumber(final int[] A){
        int duplicate = 0;
        int missing =0;
        Arrays.sort(A);
        
        if(A[0] != 1){
            missing =1;           
        }
        
        for(int i =1;i<A.length ; i++){
            if(A[i-1] == A[i]) duplicate = A[i];
            else if(A[i-1]+1 != A[i]){
                missing = A[i-1]+1;
            }
        }
        
        if(missing == 0){
            missing = A[A.length-1]+1;
        }
        
        return new int[]{duplicate,missing};
    }
}
