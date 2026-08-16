class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        while(start < end){
            int mid = start + (end - start)/2;
            if(nums[mid] < nums[end]){
                end = mid;
                //mid = start + (end - start)/2;
            }else{
                    start = mid + 1;
                    //mid = start + (end - start)/2;
                }
        }
        return nums[start];
    }
}