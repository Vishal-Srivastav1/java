class Bank{
    public static void main(String [] args){

        BankAccount acc1 = new BankAccount();
        System.out.println("acc1 is created \n");

        BankAccount acc2 = new BankAccount();
        System.out.println("acc2 is created \n");

        BankAccount acc3 = new BankAccount();
        System.out.println("acc3 is created \n");
        //displaying object values
        System.out.println("acc1 object details");
        acc1.display();

         System.out.println("acc2 object details");
         acc2.display();

         System.out.println("acc3 object details");
         acc3.display();

        //store new values or modify existing values
         acc1.setAccHName("HK");
         System.out.println(acc1.getAccHName());

         acc2.setAccHName("vk");
         System.out.println(acc2.getAccHName());

         acc3.setAccHName("sk");
         System.out.println(acc3.getAccHName());

          acc1.display();//missing
          acc2.display();//
          acc3.display();//missing

          //bussiness oprations
          acc1.deposit(5000);
          acc2.deposit(7000);
          acc3.deposit(2000);

           acc1.display();//missing
          acc2.display();//
          acc3.display();//missing

          System.out.println("\n acc1 Current balance");
          acc1.CurrentBalance();

          System.out.println("\n acc2 Current balance");
          acc2.CurrentBalance();

          System.out.println("\n acc3 Current balance");
          acc3.CurrentBalance();

    }

}