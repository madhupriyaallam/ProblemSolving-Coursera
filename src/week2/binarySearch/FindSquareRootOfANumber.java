package week2.binarySearch;

import java.util.Scanner;

public class FindSquareRootOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        BinarySearch search = new BinarySearch(a);
        System.out.println( "Square root of "+a+" : " + search.squareRoot(a));
    }
}
