class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] copy = new int[nums.length][2];
        for (int i=0; i<nums.length; i++){
            copy[i][0] = nums[i];
            copy[i][1] = i;
        }
        Arrays.sort(copy, Comparator.comparingInt(a -> a[0]));
        int start = 0;
        int end = nums.length-1;
        while (start < end){
            int val = copy[start][0]+copy[end][0];
            if (val == target){
                return new int[]{Math.min(copy[start][1], copy[end][1]), Math.max(copy[start][1], copy[end][1])};
            } else if (val < target){
                start++;
            } else {
                end--;
            }
        }
        return new int[0];
    }
}
