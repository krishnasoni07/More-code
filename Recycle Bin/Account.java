public class Account {
    private String AccType;
    private int AccNumber;

    Account( String AccType , int AccNumber ){
        this.AccNumber = AccNumber;
        this.AccType = AccType;
    }

    public int getAccNumber(){
        return this.AccNumber;
    }

    public String getAccType(){
        return this.AccType;
    }
}
