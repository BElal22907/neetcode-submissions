class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currunt_num=0;
        int max_num=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                currunt_num ++;
                if(currunt_num>max_num){
                    max_num=currunt_num;
                }
            }
            else{
                currunt_num=0;
            }
        }
        return max_num;
     }
     
}