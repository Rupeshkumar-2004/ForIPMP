package Theory;

import java.util.ArrayList;
import java.util.List;

public class Intersection {

    static List<Integer> intersection(int[] a, int[] b){
        List<Integer> res = new ArrayList<>();
        int m = a.length;
        int n = b.length;

        int i=0,j=0;
        while(i<m && j<n){
            if (i>0 && a[i-1]==a[i]){
                i++;
                continue;
            }
            if(a[i]<b[j]){
                i++;
            }
            else if(a[i]>b[j]){
                j++;
            }
            else {
                res.add(a[i]);
                i++;
                j++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {3, 5, 10, 10, 10, 15, 15, 20};
        int[] b = {5, 10, 10, 15, 30};
        List<Integer> res = intersection(a, b);

        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}
