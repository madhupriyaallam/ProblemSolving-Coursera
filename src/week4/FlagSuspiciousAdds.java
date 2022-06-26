package week4;

import java.util.List;

public class FlagSuspiciousAdds {
    List<String> advertisements;
    FlagSuspiciousAdds(List<String> advertisements){
        this.advertisements = advertisements;
    }
    //Considering mentioning location/ address to reach as suspicious
    void adds(){
        for(int i=0;i<advertisements.size();i++){
            String advertisement = advertisements.get(i);
            if(advertisement.contains("location") ||advertisement.contains("address")){
                System.out.println("This advertisement '"+advertisement+"' is suspicious");
            }
        }
    }
}
