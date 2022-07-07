package week5;

public class Actions extends Predict{
    Predict predict;
    ListOfActions listOfActions;
    Actions(Predict predict, ListOfActions listOfActions){
        super();
        this.predict = predict;
        this.listOfActions = listOfActions;
    }
    void actionsToBeTaken(){
        boolean flag = predict.willOccur();
        String type = predict.typeOfRegion();
        if(flag) {
            switch (type){
                case "Coastal" :
                    for (String actionCommonToAllRegionType : listOfActions.actionsCommonToAllRegionTypes) {
                        System.out.println(actionCommonToAllRegionType);
                    }

                    for (String actionCommonToCoastalRegion : listOfActions.actionsSpecificToCoastalRegion) {
                        System.out.println(actionCommonToCoastalRegion);
                    }
                    break;
                case "City" :
                    for (String actionCommonToAllRegionType : listOfActions.actionsCommonToAllRegionTypes) {
                        System.out.println(actionCommonToAllRegionType);
                    }

                    for (String actionCommonToCities : listOfActions.actionsSpecificToCities) {
                        System.out.println(actionCommonToCities);
                    }
                    break;
                case "Village" :
                    for (String actionCommonToAllRegionType : listOfActions.actionsCommonToAllRegionTypes) {
                        System.out.println(actionCommonToAllRegionType);
                    }

                    for (String actionCommonToVillages : listOfActions.actionsSpecificToVillages) {
                        System.out.println(actionCommonToVillages);
                    }
                    break;
                default :
                    System.out.println("Please provide valid region");
            }
        }
        else{
            System.out.println("Still be alert!!");
        }
    }
}
