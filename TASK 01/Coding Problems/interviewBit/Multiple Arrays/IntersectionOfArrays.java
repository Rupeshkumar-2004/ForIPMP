import java.util.*;

public class IntersectionOfArrays {
    public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
        int i=0;
        int j=0;
        ArrayList<Integer> ans = new ArrayList<>();
        
        while(i<A.size() && j<B.size()){
            if(A.get(i) < B.get(j)){
                i++;
            }
            else if(A.get(i) > B.get(j)){
                j++;
            }
            else{
                ans.add(A.get(i));
                i++;
                j++;
            }
        }
        
        return ans;
    }
}
