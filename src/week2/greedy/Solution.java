package week2.greedy;

public class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n)
        {
            int i = 0;
            int len = flowerbed.length;
            int num = 0;
            while(i < len){
                if(flowerbed[i] == 1){
                    i += 2;
                }else if (flowerbed[i] == 0) {
                    if(i + 1 < len && flowerbed[i+1] != 1){
                        num++;
                        i += 2;
                    }else if(i == len-1){
                        num++;
                        i++;
                    }else
                        i++;
                }else
                    i++;
            }
            return num >= n;
        }
}
