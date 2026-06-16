class Solution {
    public int maxProfit(int[] prices) {
        int answer = 0;
        int left = 0;
        
        for(int right = 1;right<prices.length;right++){
            int current = prices[right]-prices[left];
            if(current<0) left++;
            else{
                answer = Math.max(current,answer);
            }
        }
  
        return answer;
    }
}
