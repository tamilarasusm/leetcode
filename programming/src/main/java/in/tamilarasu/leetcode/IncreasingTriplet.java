package in.tamilarasu.leetcode;

public class IncreasingTriplet {

    public boolean increasingTriplet(int[] nums){
        int max = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= min) {
                min = num;
            } else if (num <= max) {
                max = num;
            } else {
                return true;
            }
        }
        return false;
    }
}
