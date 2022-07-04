package week1;

import java.util.List;
public class ElectricalAppliancesAutomation implements Automation{
    List<String> electricAppliances;
    boolean sensorMsg;
    ElectricalAppliancesAutomation(List<String> electricAppliances, boolean sensorMsg){
        this.electricAppliances= electricAppliances;
        this.sensorMsg = sensorMsg;
    }
    @Override
    public void automate() {
        if(this.sensorMsg == true){
            System.out.println("Switch on all "+this.electricAppliances);
        }
        else{
            System.out.println("Switch off all "+this.electricAppliances);
        }
    }
}
