public class SIRImplementation implements SIR{
    int S,V,I,R;
    double b,r;
    int totalInfectedPeople;
    SIRImplementation(int S, int V, int I, int R, double b, double r){
        this.S=S;
        this.V=V;
        this.I=I;
        this.R=R;
        this.b=b;
        this.r=r;
    }
    @Override
    public int noOfInfectedPeoplePerDay() {
        S = S - V;
        I = (int)(I + b*S*I);
        S = (int)(S - b*S*I);
        R = (int)(R + r*I);
        I = (int)(I - r*I);
        return I;
    }
}
