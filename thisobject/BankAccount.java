
class BankAccount{
    double balance;
    public void deposit(double amt){
        BankAccount acc = new BankAccount();
     
          // acc.balance=acc.balance+amt; //0.0
           //balance = balance+amt;  //500.0
          // acc.balance=balance+amt;  //0.0
           balance=acc.balance+amt; //500.0

    }
    public void currentBalance(){
         System.out.println(balance);
    }
}