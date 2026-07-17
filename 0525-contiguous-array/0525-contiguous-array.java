class Solution {
    public int findMaxLength(int[] nums) {
        int sum = 0;
        int maxLen = 0;
        int runningsum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                sum--;
            }else
                sum++;

            if(map.containsKey(sum)){
                int firstIndex = map.get(sum);
                int length = i - firstIndex;

                maxLen = Math.max(maxLen, length);

            }else{
                map.put(sum, i);
            }



        }
        return maxLen;

 

    }
}