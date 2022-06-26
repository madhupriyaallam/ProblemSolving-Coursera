package week4;
import java.util.List;
//How social media contribute for human trafficking
public class SocialMedia {
    List<String> advertisements;
    SocialMedia(List<String> advertisements){
        this.advertisements = advertisements;
    }
    void advertisementsRelatedToHT(String advertisement){
        advertisements.add(advertisement);
    }
    List<String> listOfAdvertisements(){
        return advertisements;
    }
}
