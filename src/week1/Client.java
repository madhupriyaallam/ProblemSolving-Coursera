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
        WaterMotorAutomation wMA = new WaterMotor(topLevel);
        wMA.automateWaterMotor(presentLevel);
        List<String> electricAppliances = new ArrayList<>();
        electricAppliances.addAll(Arrays.asList("Fans","AC's","Lights"));
        ElectricAppliancesAutomation eAA = new ElectricalAppliances(electricAppliances);
        boolean sensorMsg = false;
        eAA.automateElectricAppliances(sensorMsg);
    }
}
