package Theory;

import java.util.*;

public class RearrangePostiveNegative {
    public static void rearrange(int[] arr){
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int x : arr){
            if(x >= 0) pos.add(x);
            else neg.add(x);
        }

        int i=0, p=0, n=0;
        while(p<pos.size() && n<neg.size()){
            arr[i++] = neg.get(n++);
            arr[i++] = pos.get(p++);
        }

        while(n<neg.size()) arr[i++] = neg.get(n++);
        while(p<pos.size()) arr[i++] = pos.get(p++);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, -1, 4};
        rearrange(arr);
        System.out.println(Arrays.toString(arr));
    }
}
