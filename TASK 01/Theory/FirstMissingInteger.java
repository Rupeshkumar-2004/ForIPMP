package Theory;

public class FirstMissingInteger {
    public int firstMissingPositive(int[] nums) {
        for(int i =0;i<nums.length;i++){
            while( nums[i] >=1 && nums[i] < nums.length+1 && nums[i] != nums[nums[i]-1]){
                int temp = nums[nums[i]-1];
                nums[nums[i]-1]= nums[i];
                nums[i]=temp;
            }
        }

        for(int i =0 ; i< nums.length;i++){
                if(nums[i] != i+1) return i+1;
        }
        return nums.length+1;
    }
}
