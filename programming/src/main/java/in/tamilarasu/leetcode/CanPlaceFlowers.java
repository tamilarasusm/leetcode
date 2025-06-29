package in.tamilarasu.leetcode;

public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count =0;
        for(int i=0;i<flowerbed.length && count < n; i++){
            if(flowerbed[i] == 0){
                boolean leftEmpty = (i==0) || (flowerbed[i-1] == 0);
                boolean rightEmpty = (i == flowerbed.length -1) || (flowerbed[i+1] == 0);
                if(leftEmpty && rightEmpty){
                    flowerbed[i] = 1;
                    count ++;
                }
            }
        }
        return count == n;
    }
}
