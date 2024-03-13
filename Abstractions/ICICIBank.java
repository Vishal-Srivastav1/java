class ICICIBank extends BankAccount{
      public double balance;
   
        @Override
      public void deposit(double amt){
        balance = balance + amt;
         System.out.println("Deposite \t\t:"+amt);
     } 
       @Override
     public void withdral(double amt){
        balance = balance - amt;
         System.out.println("Withdral \t\t:"+amt);
     } 
      @Override
      public void CurrentBalance(){
        System.out.println("CurrentBalance is \t:"+balance);
        
      }

    //   public void display(){
    //   System.out.println(balance);
    //   System.out.println(CurrentBalance);
    //  } 
}