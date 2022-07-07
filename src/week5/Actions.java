package week5;

public class Actions extends Predict{
    private Predict predict;
    private ListOfActions listOfActions;
    Actions(Predict predict, ListOfActions listOfActions){
        super();
        this.predict = predict;
        this.listOfActions = listOfActions;
    }
    void forCoastal() {
        if (predict.typeOfRegion() == "Coastal") {
            for (String actionCommonToAllRegionType : listOfActions.actionsCommonToAllRegionTypes) {
                System.out.println(actionCommonToAllRegionType);
            }

            for (String actionCommonToCoastalRegion : listOfActions.actionsSpecificToCoastalRegion) {
                System.out.println(actionCommonToCoastalRegion);
            }
        }
    }
    void forCity() {
        if (predict.typeOfRegion() == "City") {
            for (String actionCommonToAllRegionType : listOfActions.actionsCommonToAllRegionTypes) {
                System.out.println(actionCommonToAllRegionType);
            }

            for (String actionCommonToCities : listOfActions.actionsSpecificToCities) {
                System.out.println(actionCommonToCities);
            }
        }
    }
    void forVillage() {
        if (predict.typeOfRegion() == "Village") {
            for (String actionCommonToAllRegionType : listOfActions.actionsCommonToAllRegionTypes) {
                System.out.println(actionCommonToAllRegionType);
            }

            for (String actionCommonToVillages : listOfActions.actionsSpecificToVillages) {
                System.out.println(actionCommonToVillages);
            }
        }
    }
    void actionsToBeTaken(int num){
        boolean flag = predict.willOccur();
        if(flag) {
            switch (num){
                case 1: forCoastal();
                        break;
                case 2: forCity();
                        break;
                case 3: forVillage();
                        break;
                default: System.out.println("Please provide valid region");
            }
        }
        else{
            System.out.println("Still be alert!!");
        }
    }
}
