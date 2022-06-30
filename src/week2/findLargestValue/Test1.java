package week2.findLargestValue;

import java.util.ArrayList;
import java.util.List;

public class Test1 implements HighestScore {
    List<Integer> marks = new ArrayList<>();
    Test1(List<Integer> list){
        this.marks = list;
    }
    @Override
    public float getTopScore() {
        int max = marks.get(0);
        for(int i=1 ; i < marks.size(); i++){
            if(marks.get(i) > max) max = marks.get(i);
        }
        return max;
    }
}
