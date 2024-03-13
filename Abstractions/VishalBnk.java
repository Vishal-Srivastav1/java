// class VishalBnk {
//     public static void main(String[] args){
//        HDFCBank h= new HDFCBank();
        
        
          

//         ATM a= new ATM();
//         a.insertCard(new HDFCBank());

//         System.out.println();

//          a.insertCard(new ICICIBank());

//         System.out.println();

//     }
// }


 import java.util.Scanner;
class VishalBnk{
    public static void main(String[] args)throws Exception{
        // HDFCBank h= new HDFCBank();
         ATM a= new ATM();
         
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER CARD NAME :");//RB VOLVO EXPRESS
         String ATMName = sc.next();//reading sub class name dynamically
          
       System.out.println("deposit AMT :");
       Double deposit = sc.nextDouble();
      // B.deposit(System.in());
       

        System.out.println("withdral AMT :");
        Double withdral = sc.nextDouble();
        // B.withdral(System.in());
      
       // 1. Load the sub class into JVM that we read from Keyboard
       //Reflction  API
       Class cls = Class.forName(ATMName);//1>dynamic loaded
       
       //create object of the sub class that we read from keyboard     
       Object obj = cls.newInstance();//2>its created objects of loaded class may be rb, volvo, express etc;
                        // ist created for all class 
                      //should be assiment for super type


        //check type and type cast
        if(obj instanceof Bank){
       Bank  bank = (Bank)obj;
        a.insertCard(bank);

        
        }else{
              System.out.println(ATMName+ "is not Vehicle");
        }
        
    } 
}