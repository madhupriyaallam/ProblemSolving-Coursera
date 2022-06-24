package week1;

public class WaterMotorAutomation implements Automation{
    private double topLevel;
    private double level;
    WaterMotorAutomation(double topLevel, double level){
        this.topLevel=topLevel;
        this.level=level;
    }
    @Override
    public void automate() {
        if (this.level == this.topLevel){
            System.out.println("Sensor identifies that top level is reached and Water-motor gets off");
        }
        else{
            System.out.println("Water motor is in on state");
        }
    }

}
