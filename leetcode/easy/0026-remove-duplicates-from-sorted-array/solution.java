class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        int i =0;
        int j = 1;
        while(j<nums.length){
            if(nums[i]==nums[j]) ++j;
            else {
                ++count;
                ++i;
                nums[i]=nums[j];
                ++j;
            }
        }
        return count+1;
    }
}