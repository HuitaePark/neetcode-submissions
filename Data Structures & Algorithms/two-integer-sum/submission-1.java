class Solution {
    public int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int[] answer = new int[2];
        Arrays.sort(nums);
        while(start<end){
            int sum = nums[start]+nums[end];
            if(sum>target){
               end--;
            } 
            else if(sum<target){
                start++;
            }
            else{
                answer[0] = start;
                answer[1] = end;
                break;
            }
        }
        return answer;
    }
}
