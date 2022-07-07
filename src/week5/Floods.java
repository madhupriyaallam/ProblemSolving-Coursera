package week5;

import java.util.HashMap;
import java.util.Map;

public class Floods {
    public static void main(String[] args) {
        Location location = new Location("Kurnool","City");
        System.out.println("Checking whether floods will occur in "+location.place);
        System.out.println("Previous months in which floods are occurred with intensities of rain");
        Map<String, Double> intensityOfRainInMonths = new HashMap<>();
        intensityOfRainInMonths.put("June",400.8);
        intensityOfRainInMonths.put("July",401.4);
        intensityOfRainInMonths.put("August",332.5);
        intensityOfRainInMonths.put("September",265.0);
        Data data = new Data(location,intensityOfRainInMonths);
        data.setIntensityOfRainInMonths(intensityOfRainInMonths);
        System.out.println(data.getIntensityOfRainInMonths());
        System.out.println();

        Predict predict = new Predict(data,500.9);
        double avgIntensity = predict.averageIntensityOfRain();
        System.out.println("Predicting whether floods occur in this month of given current intensity");
        System.out.println("Avg intensity is "+avgIntensity);
        System.out.println("Will floods occur? "+predict.willOccur());
        System.out.println();

        ListOfActions listOfActions = new ListOfActions();
        Actions actions = new Actions(predict, listOfActions);
        System.out.println("The type of region in which the place is located is "+predict.typeOfRegion());
        System.out.println("The Actions to be taken in "+predict.typeOfRegion()+" are :");
        int num = 0;
        if(predict.typeOfRegion() == "Coastal") num = 1;
        else if (predict.typeOfRegion() == "City") num = 2;
        else if (predict.typeOfRegion() == "Village") num = 3;
        actions.actionsToBeTaken(num);
    }
}
