package week2.greedy;
import java.util.Scanner;

//You have a long flowerbed in which some plots are planted, and some are not. However, flowers cannot be planted in adjacent plots

public class FlowerBed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] flowerbed = new int[a];
        int n = sc.nextInt();//no of new flowers can be planted in the flowerbed
        for(int i = 0; i < a; i++){
            flowerbed[i] = sc.nextInt();
        }
        Solution solution = new Solution();
        if(solution.canPlaceFlowers(flowerbed,n)){
            System.out.println("Flowers can be planted in flowerbed");
        }
        else {
            System.out.println("Flowers cannot be planted");
        }
    }
}
