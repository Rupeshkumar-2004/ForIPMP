import java.util.*;

public class MergeArray {
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
		int ptr1 =0;
		int ptr2 =0;
		ArrayList<Integer> ans = new ArrayList<>();
		while(ptr1 < a.size() && ptr2 < b.size()){
			if(a.get(ptr1) > b.get(ptr2)){
				ans.add(b.get(ptr2++));
			}
			else{
				ans.add(a.get(ptr1++));
			}
		}
		
		while(ptr2 < b.size()){
			ans.add(b.get(ptr2++));
		}
		
		while(ptr1 < a.size()){
			ans.add(a.get(ptr1++));
		}
		
		a.clear();
		a.addAll(ans);
	}
}
