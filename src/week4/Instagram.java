package week4;
import java.util.List;
//How social media contribute for human trafficking
public class Instagram implements SocialMedia{
    List<String> advertisements;
    Instagram(List<String> advertisements){
        this.advertisements = advertisements;
    }
    @Override
    public void advertisementsRelatedToHT(String advertisement){
        advertisements.add(advertisement);
    }
    @Override
    public List<String> listOfAdvertisements(){
        return advertisements;
    }
}
