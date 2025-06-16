package in.tamilarasu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = 0;
        for(int candy : candies){
            if(candy > max){
                max = candy;
            }
        }

        List<Boolean>  maxCandiesList = new ArrayList<>(candies.length);
        for(int candy : candies){
            maxCandiesList.add(candy+extraCandies >= max);
        }
        return maxCandiesList;
    }
}
