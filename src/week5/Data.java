package week5;

import java.util.HashMap;
import java.util.Map;

public class Data {
    private Location location;
    Map<String, Double> intensityOfRainInMonths = new HashMap<>();
    Data(){
        //System.out.println("Hello in data");
    }
    Data(Location location, Map<String, Double> intensityOfRainInMonths) {
        this.location = location;
        this.intensityOfRainInMonths = intensityOfRainInMonths;
    }
    public void setIntensityOfRainInMonths(Map<String, Double> intensityOfRainInMonths) {
        this.intensityOfRainInMonths = intensityOfRainInMonths;
        //System.out.println("In setIntensity");
    }
    public Map<String, Double> getIntensityOfRainInMonths() {
        return intensityOfRainInMonths;
    }

    public Location getLocation() {
        return location;
    }
}
