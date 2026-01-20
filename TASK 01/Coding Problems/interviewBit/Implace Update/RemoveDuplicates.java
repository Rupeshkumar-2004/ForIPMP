import java.util.*;

public class RemoveDuplicates {
    public int removeDuplicates(ArrayList<Integer> a) {
		int i = 0;

        for (int j = 1; j < a.size(); j++) {
            if (!a.get(j).equals(a.get(i))) {
                i++;
                a.set(i, a.get(j));
            }
        }

        return i + 1;
	}
}
