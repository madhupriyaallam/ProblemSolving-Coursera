package week5;
import java.util.Map;
import java.util.Scanner;

public class Predict extends Data{
    private Data data;
    double currentIntensityOfRain;
    boolean likelyToOccur = true;
    Predict(Data data, double currentIntensityOfRain){
        super();
        this.data = data;
        this.currentIntensityOfRain = currentIntensityOfRain;
        this.intensityOfRainInMonths = data.intensityOfRainInMonths;
        //System.out.println("Hello in predict");
    }
    public Predict(){}
    String typeOfRegion(){
        return data.getLocation().typeOfRegion;
    }
    double averageIntensityOfRain(){
        double avgIntensityOfRain = 0;
//        System.out.println("In avg intensity");
//        System.out.println(avgIntensityOfRain);
        for(double intensity : intensityOfRainInMonths.values()){
            avgIntensityOfRain = avgIntensityOfRain + intensity;
        }
        avgIntensityOfRain = avgIntensityOfRain/(intensityOfRainInMonths.size());
        return avgIntensityOfRain;
    }
    boolean willOccur(){
        if(currentIntensityOfRain >= averageIntensityOfRain()){
            return likelyToOccur;
        }
        else{
            return !likelyToOccur;
        }
    }
}
