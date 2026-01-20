package interviewBit.Tricks;

import java.util.ArrayList;

public class MaxContinuousOne {
    public ArrayList<Integer> maxone(ArrayList<Integer> A, int B) {
        int noOfZeros =0;
        int l=0;
        int r=0;
        int result =0;
        int start=0;
        
        while(r< A.size()){
            if(A.get(r) == 0){
                noOfZeros++;
            }
            
            while(noOfZeros > B){
                if(A.get(l) == 0){
                    noOfZeros--;
                }
                l++;
            }
            
            if(result < (r-l+1)){
                result=r-l+1;
                start=l;
            }
            r++;
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=start; i<result+start;i++){
            ans.add(i);
        }
        
        return ans;
    }
}
