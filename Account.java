public class Account extends Client {
    private double accountBalance;
    private String accountNo;

    public Account(String accountNo) {
        this.accountNo = accountNo;
        this.accountBalance = 0;
        System.out.println("Thank you for creating an Account!");
        System.out.println("Your Account Number is " + this.accountNo);
        System.out.println("Your Account Balance is " + this.accountBalance);
    }

    public Account(String accountNo, double accountBalance){
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
        System.out.println("Thank you for creating an Account!");
        System.out.println("Your Account Number is " + this.accountNo);
        System.out.println("Your Account Balance is " + this.accountBalance);
    }

    public double getAccountBalance(){
        return this.accountBalance;
    }

    public void setAccountBalance(double accountBalance){
        this.accountBalance = accountBalance;
        System.out.println("New account Balance: " + this.accountBalance);
    }

    public String getAccountNo(){
        return this.accountNo;
    }

    public void setAccountNo(String accountNo){
        System.out.println("New Account No: " + this.accountNo);
        this.accountNo = accountNo;
    }

    public void booking(double amount){
        if(amount > this.accountBalance){
            System.out.println("You don't have enough money!");
        }  else {
            this.accountBalance -= amount;
            System.out.println("Booking was successfull.");
            System.out.println("New Balance: " + this.accountBalance);
        }
    }

    public boolean withdrawMoney(double amount){
        if(amount > this.accountBalance){
            System.out.println("You tried withdrawing more money than you own. Nice try.");
            System.out.println("Your current balance is: " + this.accountBalance);
            return false;
        } else {
            this.accountBalance -= amount;
            System.out.println("Withdrawing succeeded. Please don't forget your card and your money!");
            return true;
        }
    }

    public boolean depositMoney(double amount){
        if (amount <= 0){
            System.out.println("Please select a value above Zero..");
            return false;
        } else {
            this.accountBalance += amount;
            System.out.println("Thank you for using this option.");
            System.out.println("Your new balance is: " + this.accountBalance);
            return true;
        }
    }

}   
