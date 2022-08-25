class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int answer = Integer.MIN_VALUE;
        
        for (int price : prices){
            min = Math.min(min, price);
            answer = Math.max(answer, price - min);
        }
        
        return answer;
    }
}