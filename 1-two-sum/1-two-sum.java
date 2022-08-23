class Solution {
    // [1, 2, -4, -1] -5 
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        int[] numsBackUp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        
        // 2, 7, 11, 15
        
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int currentSum = nums[l] + nums[r];
            if (currentSum > target) {
                --r;
            } else if (currentSum < target){
                ++l;
            } else {
                answer[0] = findInArrayBecauseJavaIsStupid(nums[l], numsBackUp);
                answer[1] = findInArrayBecauseJavaIsStupid2(nums[r], numsBackUp);
                break;
            }
        }
        
        return answer;
    }
    
    public int findInArrayBecauseJavaIsStupid(int num, int[] array) {
        for (int i = 0; i < array.length; i++){
            if (array[i] == num){
                return i;
            }
        }
        return -1;
    }
    
        public int findInArrayBecauseJavaIsStupid2(int num, int[] array) {
        for (int i = array.length - 1; i >= 0; i--){
            if (array[i] == num){
                return i;
            }
        }
        return -1;
    }
}