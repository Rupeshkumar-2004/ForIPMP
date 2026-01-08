
public class Diffk {
    public int diffPossible(int[] A, int B) {
        int n = A.length;
        int i =0;
        int j=1;
        while( i <n && j < n){
            if(A[j] - A[i] == B && i != j){
                return 1;
            }
            else if(A[j]-A[i] >= B || i == j){
                
                if(i == j)j++;
                else i++;
            }else{
                j++;
            }
        }
        
        return 0;
    }
}
