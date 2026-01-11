package Theory;

public class MissingNumber {
    public static int missingNum(int[] arr){
        int n = arr.length + 1;
        int xor1=0,xor2=0;

        for(int i = 0;i<n-1;i++){
            xor2^=arr[i];
        }

        for(int i=1;i<=n;i++){
            xor1^=i;
        }

        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        int res = missingNum(arr);
        System.out.println(res);
    }
}