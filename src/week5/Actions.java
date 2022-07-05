package week5;

public class Actions extends Predict{
    Predict predict;
    Actions(Predict predict){
        super();
        this.predict = predict;
//        System.out.println("Hello in actions");
//        System.out.println(predict.typeOfLocation());
    }
    void actionsToBeTaken(){
        boolean flag = predict.willOccur();
        //String regionType = predict.getLocation().typeOfRegion;
        if(flag) {
            //System.out.println("Location type is "+regionType);
            if (predict.typeOfRegion() == "Coastal") {
                System.out.println("Protect the community through warning systems and adapt to the changing climate");
                System.out.println("Proper planning should be made while constructing buildings high quality material should be used and choose an area which won't effect much from floods");
                System.out.println("Be prepared by constructing areas where we can store food and etc at the time of floods");
                System.out.println("Floods barriers, seawalls etc should be constructed for safe side");
                System.out.println("Raising roads above sea level can help drain water and reduce tidal flooding");
            } else if (predict.typeOfRegion() == "City") {
                System.out.println("Protect the community through warning systems and adapt to the changing climate");
                System.out.println("Proper planning should be made while constructing buildings high quality material should be used and choose an area which won't effect much from floods");
                System.out.println("Be prepared by constructing areas where we can store food and etc at the time of floods");
                System.out.println("As population is more in cities frequently check whether drainage system is proper");
                System.out.println("If there is any problem with roads and etc try to fix them as soon as possible");
            } else if (predict.typeOfRegion() == "Village") {
                System.out.println("Protect the village through warning systems and adapt to the changing climate");
                System.out.println("Proper planning should be made while constructing buildings high quality material should be used and choose an area which won't effect much from floods");
                System.out.println("Be prepared by constructing areas where we can store food and etc at the time of floods");
                System.out.println("Identify stock, machinery and tools that can easily be moved off the farm to prevent loss or damage");
                System.out.println("Identify any chemicals or fuels on the farm that could contaminate floodwater and think about how they could be moved to safety during a flood");
                System.out.println("Consider purchasing a stockpile of useful materials that can be used during a flood such as sandbags to prevent water entering barns or sheds, plywood to board up windows and pallets to raise stock and equipment above floodwater level");
            }
        }
        else{
            System.out.println("Still be alert!!");
        }
    }
}
