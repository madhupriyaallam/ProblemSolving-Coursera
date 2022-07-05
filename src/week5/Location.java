package week5;

public class Location {
    String place;
    String typeOfRegion;
    Location(String place, String typeOfRegion){
        this.place = place;
        this.typeOfRegion = typeOfRegion;
        //System.out.println("In location");
    }
    public String getPlace() {
        return place;
    }
    public String getTypeOfRegion() {
        return typeOfRegion;
    }
}
