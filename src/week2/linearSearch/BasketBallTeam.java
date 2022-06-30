package week2.linearSearch;

import java.util.ArrayList;
import java.util.List;

public class BasketBallTeam implements Team{
    List<Float> playersHeight = new ArrayList<>();
    BasketBallTeam(List<Float> playersHeight){
        this.playersHeight = playersHeight;
    }
    @Override
    public int eligiblePlayers(float height) {
        int count = 0;
        for(int i = 0; i < playersHeight.size(); i++){
            if(playersHeight.get(i) > height) count++;
        }
        return count;
    }
}
