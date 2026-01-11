package interviewBit.Tricks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DistinctInteger {
     public int solve(ArrayList<Integer> A, int B) {
        return countAtMost(A, B) - countAtMost(A, B - 1);
    }
    
    private int countAtMost(ArrayList<Integer> A, int B) {
        if (B < 0) return 0;

        Map<Integer, Integer> freq = new HashMap<>();
        int left = 0;
        int count = 0;

        for (int right = 0; right < A.size(); right++) {
            freq.put(A.get(right), freq.getOrDefault(A.get(right), 0) + 1);

            while (freq.size() > B) {
                freq.put(A.get(left), freq.get(A.get(left)) - 1);
                if (freq.get(A.get(left)) == 0) {
                    freq.remove(A.get(left));
                }
                left++;
            }

            count += (right - left + 1);
        }

        return count;
    }
}
