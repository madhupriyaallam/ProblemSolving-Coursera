public class City {
    public static void main(String[] args) {
        int S = 34000;
        int V = 1200;
        int I = 3;
        int R = 0;
        double b = 0.32;
        double r = 0.67;
        SIR sir = new SIRImplementation(S,V,I,R,b,r);
        int countOfInfectedPeople = sir.noOfInfectedPeoplePerDay();
        System.out.println("Number of Infected people in a city by the eod is "+countOfInfectedPeople);
        System.out.println();
    }
}
