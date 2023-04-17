package pack;

public abstract class Cars {
    private int width;
    private int lenght;
    private int height;

    public Cars(){

    }
    public Cars(int width,int lenght,int height){
        this.height=height;
        this.lenght=lenght;
        this.width=width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width >= 0 ){
        this.width = width;}
        else {
            System.err.println("Invalid number");
            }
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {

        if (lenght >= 0 ){
            this.lenght = lenght;}
        else {
            System.err.println("Invalid number");
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height >= 0 ){
            this.height = height;}
        else {
            System.err.println("Invalid number");
        }
    }

    @Override
    public String toString() {
        return this.getType() + ":  width=" + this.getWidth() + ", lenght=" + this.getLenght() + ", height=" + this.getHeight() + " ,  Fuel consumption ="+this.getFuel()+"L/100KM" + " , Gas consumption = "+this.getgas()+'}';
    }
    public  abstract double getFuel();
    public  abstract double getgas();

    public String getType(){return "Cars";}
}
