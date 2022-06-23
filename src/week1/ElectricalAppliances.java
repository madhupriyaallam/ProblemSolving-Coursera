package week1;

import java.util.List;

public class ElectricalAppliances implements ElectricAppliancesAutomation{
    List<String> electricAppliances;
    ElectricalAppliances(List<String> electricAppliances){
        this.electricAppliances= electricAppliances;
    }

    @Override
    public void automateElectricAppliances(boolean sensorMsg) {
        if(sensorMsg == true){
            System.out.println("Switch on all "+this.electricAppliances);
        }
        else{
            System.out.println("Switch off all "+this.electricAppliances);
        }
    }

}
