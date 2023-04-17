package pack;
// we have some problem in this here.
public class Sedan extends Mini {
    private double gas;

    public Sedan() {
        super();
    }

    public Sedan(int a, double b, double gas) {
        super(a, a, a, b);
        this.gas = gas;
    }

    public void setwidth(int width) {
        // is not true but this is the example
        super.setWidth(width);
        super.setHeight(width);
        super.setLenght(width);
    }

    public void setheight(int width) {
        // is not true but this is the example
        super.setWidth(width);
        super.setHeight(width);
        super.setLenght(width);
    }

    public void setFuel(double Fuel) {
        super.setBock(Fuel);
    }


    @Override
    public double getgas() {
        return getBock()*35/100;
    }


    public String getType(){return "Sedan cars";}
}

