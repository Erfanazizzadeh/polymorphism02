package pack;

public   class Mini extends  Cars{
    private double bock;
    private String name;//we can use it for carname with setter and getter

    public double getBock() {
        return bock;
    }

    public void setBock(double bock) {
        this.bock = bock;
    }

    public Mini(){super();}
    public Mini(double bock){
       super();
       this.bock=bock;
    }
    public Mini(int widht,int lenght,int heghit,double bock){
        super(widht,lenght,heghit);
        this.bock=bock;
    }
    @Override
    public double getFuel() {
        return bock*100/50;
    }

    @Override
    public double getgas() {
        return 0;
    }

    public String getType(){return "Mini Coupe";}
}
