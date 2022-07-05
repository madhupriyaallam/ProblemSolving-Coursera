package week2.linearSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BasketBallTournament {
    public static void main(String[] args) {
        List<Float> playersHeight = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            playersHeight.add(sc.nextFloat());
        }
        System.out.print("What is the considerable height to play in tournament? ");
        float height = sc.nextFloat();
        Team team = new BasketBallTeam(playersHeight);
        System.out.println("Number of players eligible to play in tournament are : "+team.eligiblePlayers(height));
    }
}
