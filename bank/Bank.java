package bank; 
class Account {
    public String name;
    public int amount;

}
public class Bank {
    Account account;
    public Bank(){
        this.account = new Account();
        this.account.name = "Mayank";
        this.account.amount = 25000;
    }
    public void displayInfo(){
        System.out.println("Name: " + this.account.name + " Amount :" + this.account.amount);
    }
    
}
public class New{
    
}