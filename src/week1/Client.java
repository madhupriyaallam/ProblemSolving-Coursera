package week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        double topLevel = 120.6;
        double presentLevel;
        Scanner sc = new Scanner(System.in);
        presentLevel = sc.nextDouble();
        Automation wMA = new WaterMotorAutomation(topLevel,presentLevel);
        wMA.automate();
        List<String> electricAppliances = new ArrayList<>();
        electricAppliances.addAll(Arrays.asList("Fans","AC's","Lights"));
        boolean sensorMsg = false;
        Automation eAA = new ElectricalAppliancesAutomation(electricAppliances,sensorMsg);
        eAA.automate();
    }
}
