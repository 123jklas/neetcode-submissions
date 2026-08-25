class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int zerocount = 0;
        int[] result = new int[nums.length];
        for (int i : nums){
            if (i != 0){
                prod *= i;
            } else {
                zerocount++;
            }
        }
        if (zerocount > 1){
            return new int[nums.length];
        }
        for (int j=0; j<nums.length; j++){
            if (zerocount == 1){
                if (nums[j] == 0){
                    result[j] = prod;
                } else {
                    result[j] = 0;
                }
            } else {
                result[j] = prod/nums[j];
            }
        }
        return result;
    }
}  
