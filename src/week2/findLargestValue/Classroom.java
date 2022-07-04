package week2.findLargestValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Classroom {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            marks.add(sc.nextInt());
        }
        HighestScore topScore = new Test(marks);
        System.out.println("The highest score is : "+topScore.getTopScore());
    }
}
