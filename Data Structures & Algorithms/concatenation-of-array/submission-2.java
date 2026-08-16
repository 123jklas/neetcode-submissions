class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] copy = new int[size * 2];
        for (int i=0; i<size; i++){
            copy[i] = nums[i];
            copy[i+size] = nums[i];
        }
        return copy;
    }
}