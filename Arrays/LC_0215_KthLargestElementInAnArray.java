class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
       /* int temp=nums[0];
        for(int i=nums.length-1;i>=(nums.length-k);i--){
          temp=nums[i];
        }
        return temp;
        */
        //int temp=nums[nums.length-1];
        int count=1;
        for(int i=nums.length-1;i>=0;i--){
            if(count<k){
                count++;
            }
            else{
                return nums[i];
            }
        }
        return 0;
    }
}
