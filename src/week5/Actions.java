package week5;

public class Actions extends Predict{
    private Predict predict;
    private ListOfActions listOfActions;
    public static final String COASTAL = "Coastal";
    public static final String CITY = "City";
    public static final String VILLAGE = "Village";
    Actions(Predict predict, ListOfActions listOfActions){
        super();
        this.predict = predict;
        this.listOfActions = listOfActions;
    }
        void actionsToBeTakenInCoastalRegion() {
        if (predict.typeOfRegion() == COASTAL) {
            for (String actionCommonToAllRegionType : listOfActions.actionsCommonToAllRegionTypes) {
                System.out.println(actionCommonToAllRegionType);
            }

            for (String actionCommonToCoastalRegion : listOfActions.actionsSpecificToCoastalRegion) {
                System.out.println(actionCommonToCoastalRegion);
            }
        }
    }
    void actionsToBeTakenInCities() {
        if (predict.typeOfRegion() == CITY) {
            for (String actionCommonToAllRegionType : listOfActions.actionsCommonToAllRegionTypes) {
                System.out.println(actionCommonToAllRegionType);
            }

            for (String actionCommonToCities : listOfActions.actionsSpecificToCities) {
                System.out.println(actionCommonToCities);
            }
        }
    }
    void actionsToBeTakenInVillages() {
        if (predict.typeOfRegion() == VILLAGE) {
            for (String actionCommonToAllRegionType : listOfActions.actionsCommonToAllRegionTypes) {
                System.out.println(actionCommonToAllRegionType);
            }

            for (String actionCommonToVillages : listOfActions.actionsSpecificToVillages) {
                System.out.println(actionCommonToVillages);
            }
        }
    }
    void actionsToBeTaken(){
        boolean flag = predict.willOccur();
        String region = predict.typeOfRegion();
        if(flag) {
            switch (region){
                case COASTAL: actionsToBeTakenInCoastalRegion();
                        break;
                case CITY: actionsToBeTakenInCities();
                        break;
                case VILLAGE: actionsToBeTakenInVillages();
                        break;
                default: System.out.println("Please provide valid region");
            }
        }
        else{
            System.out.println("Still be alert!!");
        }
    }
}
