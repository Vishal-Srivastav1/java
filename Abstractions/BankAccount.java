abstract class BankAccount implements Bank{
       public double balance;
        @Override
       public void deposit(double amt){
        System.out.println("deposit ");
       }
        @Override
       public void withdral(double amt){
        System.out.println("withdraw ");
       }

        @Override
      public void CurrentBalance(){
        System.out.println("CurrentBallance ");
       }

}
