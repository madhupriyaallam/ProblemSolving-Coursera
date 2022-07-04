package week2.binarySearch;

public class BinarySearch {
    int n;
    static final int notAPerfectSquare = -1;
    BinarySearch(int n){
        this.n = n;
    }
    public static int squareRoot(int n){
        int l = 1, r = n, mid = 1;
        while(l <= r) {
            mid = (l + r) / 2;
            int square = mid * mid;
            if (square == n) {
                return mid;
            }
            if (square < n) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return notAPerfectSquare;
    }
}
