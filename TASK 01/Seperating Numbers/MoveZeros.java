
public class MoveZeros {
    public void moveZeroes(int[] nums) {
       int lastPlace = 0;

       for(int i =0;i<nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[lastPlace];
                nums[lastPlace] = temp;
                lastPlace++;
            }
        }
    }
}
