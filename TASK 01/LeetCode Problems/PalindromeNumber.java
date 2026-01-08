
public class PalindromeNumber {
    private int reverse(int num, int digits){
        if(num < 10) return num; 
        
        return ((num%10) * (int)Math.pow(10,digits)) + reverse(num/10,--digits);
    }

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x == 0) return true;

        int digits = (int)Math.log10(x); 
        int reversed = reverse(x,digits);
        
        return x == reversed;
    }
}
