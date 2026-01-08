class DuplicateNames{
    public int findDuplicate(int[] nums) {
        int low = 1;
        int high = nums.length-1;

        while(low <= high){
            int mid = low + (high-low)/2;

            int count =0;

            for(int i =0;i<=nums.length-1;i++){
                if(nums[i] <= mid){
                    count++;
                }
            }

            if(count <= mid){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        
        return low;
    }
}

//logic is simple 
/*
If there is n+1 numbers and we need to find the duplicate number 
then no of uniqie is n

Now if we take a number x 1<=x<=n
The only possiblity is the all numbers can be greater than that value or less anf if
a number is lesser than or greater than that number then its duplicate also that is
the numbers will be wither one extra in either side


so if the right side has greater element then the duplicate are iin the right 
ans vise versa so we can implement binary Search and slove the problem.
*/