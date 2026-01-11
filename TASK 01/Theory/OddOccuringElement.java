package Theory;

import java.util.*;

public class OddOccuringElement {
    static int getOddOccurrence(ArrayList<Integer> arr){
        int res = 0;
        for(int i=0;i<arr.size();i++)   res ^= arr.get(i);
        return res;
    }

    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2));
        System.out.println(getOddOccurrence(arr));
    }
}
