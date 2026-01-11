package Theory;

public class RepeatedThree {
    public int repeatedNumber(final int[] A) {
        int cand1 = 0, cand2 = 0;
        int count1 = 0, count2 = 0;

        // Step 1: Find candidates
        for(int num : A){
            if(num==cand1){
                count1++;
            } 
            else if(num==cand2){
                count2++;
            } 
            else if(count1==0){
                cand1=num;
                count1=1;
            } 
            else if(count2==0){
                cand2=num;
                count2=1;
            } 
            else{
                count1--;
                count2--;
            }
        }

        // Step 2: Verify
        count1=0;
        count2=0;

        for(int num : A){
            if(num==cand1) count1++;
            else if(num==cand2) count2++;
        }

        int n=A.length;
        if(count1>n/3) return cand1;
        if(count2>n/3) return cand2;

        return -1;
    }
}
