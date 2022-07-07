package week4;

import java.util.ArrayList;
import java.util.List;

public class User {
    public static void main(String[] args) {
        List<String> advertisements = new ArrayList<>();
        SocialMedia sm = new Instagram(advertisements);
        sm.advertisementsRelatedToHT("Guys hurry up.. recruitment is gonna start for available roles make sure be available at given location");
        sm.advertisementsRelatedToHT("New product launched....try it and leave comments below.");
        advertisements = sm.listOfAdvertisements();
        for(int i=0;i<advertisements.size();i++){
            System.out.println(advertisements.get(i));
        }
        Ads fsa = new FlagSuspiciousAds(advertisements);
        fsa.ads();
    }
}
