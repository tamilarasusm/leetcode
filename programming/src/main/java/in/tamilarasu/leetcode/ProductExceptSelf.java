package in.tamilarasu.leetcode;

public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {

        int[] output = new int[nums.length];
        int product = 1;
        for(int i=0; i<nums.length; i++) {
            output[i] = product;
            product = product * nums[i];
        }
        product = 1;
        for(int j=nums.length-1; j>=0; j--) {
            output[j] = product * output[j];
            product = product * nums[j];
        }
        return output;
    }

}
