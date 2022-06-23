package week1;

public class WaterMotor implements WaterMotorAutomation{
    private double topLevel;
    WaterMotor(double topLevel){
        //this.bottomLevel=bottomLevel;
        this.topLevel=topLevel;
    }
    @Override
    public void automateWaterMotor(double level) {
        if (level == topLevel){
            System.out.println("Sensor identifies the bottom level is reached and Water-motor gets off");
        }
        else{
            System.out.println("Water motor is in on state");
        }
    }
}
