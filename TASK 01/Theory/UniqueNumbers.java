package Theory;

import java.util.Arrays;

public class UniqueNumbers {
    public static int[] singleNum(int[] arr){
        int xor = 0;
        for(int i : arr){
            xor ^= i;
        }

        // Get its last set bit
        xor &= -xor;
        int[] res = new int[2];
        
        for(int num : arr){
            if((num&xor) == 0){ 
                res[0]^= num;
            }
            else{ 
                res[1]^= num;
            }
        }
        Arrays.sort(res);

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 1, 4 };
        int[] ans = singleNum(arr);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
