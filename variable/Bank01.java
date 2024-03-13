class Bank01{
    public static void main(String[] args){
        BankAccount acc1 =new BankAccount();
         BankAccount acc2 =new BankAccount();

        //intializing acc1 with vishal values
            acc1.bankName="Purvanchar gramin Bank";
            acc1.branchName="Sakhwaniya";
            acc1.ifsc="PUBXO0x";

           acc1.accno=112022335678l;
           acc1.accHName="VISHAL SRIVASTAV";
           acc1.balance=555;

           acc1.address=new Address();

            acc1.address.doorNo="1/12-A/B";
            acc1.address.aptName="vk village";
            acc1.address.flateNo="G102";
            acc1.address.landmark="Kushinagar";
            acc1.address.city="Padrouna";
            acc1.address.State="UTTAR PARDESH";
            acc1.address.Pincode="274402";

            //intializing acc2 with Raju values
            acc1.bankName="HDFC";
            acc1.branchName="Gopalgang";
            acc1.ifsc="HDXXO0x";

           acc1.accno=233567881122l;
           acc1.accHName="RAJU KUMAR";
           acc1.balance=40005;

           acc1.address=new Address();

            acc1.address.doorNo="6/5-B/B";
            acc1.address.aptName="RK house";
            acc1.address.flateNo="C102";
            acc1.address.landmark="Gopalgang";
            acc1.address.city="Gopalgang";
            acc1.address.State="BIHAR";
            acc1.address.Pincode="440207";

            System.out.println();
            System.out.println("============================");
            System.out.println(" Purvanchar_gramin_Bank 1st");
            System.out.println("============================");
            System.out.println("bank\t\t\t:="+acc1.bankName);
            System.out.println("branchName\t\t:="+acc1.branchName);
            System.out.println("ifsc\t\t\t:="+acc1.ifsc);
            System.out.println();
            System.out.println("acc1.accno\t\t:="+acc1.accno);
            System.out.println("acc1.accHName\t\t:="+acc1.accHName);
            System.out.println("acc1.balance\t\t:="+acc1.balance);
            System.out.println("acc1.address\t\t:="+acc1.address);

            System.out.println("acc1.address.doorNo\t:="+acc1.address.doorNo);
            System.out.println("acc1.address.aptName\t:="+acc1.address.aptName);
            System.out.println("acc1.address.flateNo\t:="+acc1.address.flateNo);
            System.out.println("acc1.address.landmark\t:="+acc1.address.landmark);
            System.out.println("acc1.ad.ct\t\t:="+acc1.address.city);
            System.out.println("acc1.ad.St\t\t:="+acc1.address.State);
            System.out.println("acc1.ad.pin\t\t:="+acc1.address.Pincode);
            System.out.println();
            System.out.println();
            System.out.println("========================");
            System.out.println("     HDFC 2st");
            System.out.println("========================");
            System.out.println("bank\t\t\t:="+acc1.bankName);
            System.out.println("branchName\t\t:="+acc1.branchName);
            System.out.println("ifsc\t\t\t:="+acc1.ifsc);
            System.out.println();
            System.out.println("acc1.accno\t\t:="+acc1.accno);
            System.out.println("acc1.accHName\t\t:="+acc1.accHName);
            System.out.println("acc1.balance\t\t:="+acc1.balance);
            System.out.println("acc1.address\t\t:="+acc1.address);

            System.out.println("acc1.address.doorNo\t:="+acc1.address.doorNo);
            System.out.println("acc1.address.aptName\t:="+acc1.address.aptName);
            System.out.println("acc1.address.flateNo\t:="+acc1.address.flateNo);
            System.out.println("acc1.address.landmark\t:="+acc1.address.landmark);
            System.out.println("acc1.ad.ct\t\t:="+acc1.address.city);
            System.out.println("acc1.ad.St\t\t:="+acc1.address.State);
            System.out.println("acc1.ad.pin\t\t:="+acc1.address.Pincode);
            System.out.println();
            
           

}
    }
