import java.util.*;

public class PairWithGivenDifference {
    public int solve(int[] A, int B){
        Arrays.sort(A);

        int i = 0, j = 1;
        int n = A.length;

        while (j < n) {
            int diff = A[j] - A[i];

            if (i != j && diff == B) {
                return 1;
            } 
            else if (diff < B) {
                j++;
            } 
            else {
                i++;
                if (i == j) j++;
            }
        }
        return 0;
    }
}
