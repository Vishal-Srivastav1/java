class BankAccount{
    static long accNumSeq = 9342300000l;
    long accNum;
    String accHName;
    double balance;
    long mobile;
     
     {
        accNum=++accNumSeq;
        System.out.println("nsb is executed");
     }
     BankAccount(){
        System.out.println("npc is executed");
     }
      BankAccount(String ahName){
        accHName=ahName;
        System.out.println("spc is executed");
     }
      BankAccount(String ahName, double bal){
        accHName=ahName;
        balance=bal;
        System.out.println("sdpc is executed");
     }
     long getAccNum(){
        return accNum;
     }
     void setAccHName(String ahName){
        accHName=ahName;
     }

     String getAccHName(){
        return accHName;
     }

     void deposit(double amt){
        balance = balance + amt;
     } 

     void withdral(double amt){
        balance = balance - amt;
     } 
      public void CurrentBalance(){
        System.out.println(balance);
      }
      
      void  display(){
         System.out.println(accNum);
         System.out.println(accHName);
         System.out.println(balance);
         System.out.println(mobile);
      }
      

}