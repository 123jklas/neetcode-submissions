class Solution {
    public int longestConsecutive(int[] nums) {
        // sort array and find smallest
        // put nums into set
        // for arr.add(i)
        // if (i+1 is in nums)
        // add result
        // if not, then just update max to length of result and reset []
        Arrays.sort(nums);
        if (nums.length == 0){
            return 0;
        }
        int current = nums[0];
        int temp = 1;
        int max=0;
        for (int j=1; j<nums.length; j++){
            if (nums[j] == (current+1)){
                current++;
                temp++;
            } else if (nums[j] == current){
                continue;
            } else {
                max = Math.max(temp, max);
                current = nums[j];
                temp = 1;
            }
        }
        max = Math.max(temp, max);
        return max;
    }
}
