class Solution {
    public int maxProfit(int[] prices) {
        int answer = 0;
        int left = 0;
        int right = 1;

        while(left<prices.length){
            
            if(right>=prices.length) break;

            int current = prices[right]-prices[left];
            if(current>0){
                answer = Math.max(answer,current);
                right++;
                continue;
            }
            else{
                left++;
                right++;
            }

        }
        return answer;
    }
}
