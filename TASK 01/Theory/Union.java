package Theory;

import java.util.*;

public class Union {
    
    static ArrayList<Integer> findUnion(int[] a, int[] b) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = a.length;
        int m = b.length;
        
        int i=0,j=0;
        while(i<n && j<m){
            if(i>0 && a[i-1]==a[i]){
                i++;
                continue;
            }
            if(j>0 && b[j-1]==b[j]){
                j++;
                continue;
            }
            if(a[i] < b[j]){
                res.add(a[i]);
                i++;
            } 
            else if(a[i] > b[j]){
                res.add(b[j]);
                j++;
            } 
            else{
                res.add(a[i]);
                i++;
                j++;
            }
        }
        
        while (i<n){
            if(i>0 && a[i-1]==a[i]){
                i++;
                continue;
            }
            res.add(a[i]);
            i++;
        }

        while(j<m){
            if(j>0 && b[j-1]==b[j]){
                j++;
                continue;
            }
            res.add(b[j]);
            j++;
        }
        return res;
    }
    
    public static void main(String[] args) {
      
        int[] a = {1, 1, 2, 2, 2, 4};
        int[] b = {2, 2, 4, 4};
        List<Integer> res = findUnion(a, b);
        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}