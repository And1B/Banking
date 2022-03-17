public class Giro extends Account{
    private double fee = 0.1;

    Giro(String accountNo){
        super(accountNo);
    }

    public double getFee(){
        return this.fee;
    }

    public void setFee(double fee){
        this.fee = fee;
    }

}
