// if we use sub type in program anywere then the program became type coupuling
// NOw we are reading data from the keyboaard using "scanner" import java.util.scanner;

 import java.util.Scanner;
class BusManager{
    public static void main(String[] args)throws Exception{
        Driver vk =new Driver();

        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER VEHICLE:");//RB VOLVO EXPRESS
         String vehicleName = sc.next();//reading sub class name dynamically
       
      
       // 1. Load the sub class into JVM that we read from Keyboard
       //Reflction  API
       Class cls = Class.forName(vehicleName);//1>dynamic loaded
    
       //create object of the sub class that we read from keyboard     
       Object obj = cls.newInstance();//2>its created objects of loaded class may be rb, volvo, express etc;
                        // ist created for all class 
                      //should be assiment for super type


        //check type and type cast
        if(obj instanceof Vehicle){
        Vehicle vehicle = (Vehicle)obj;
        vk.drive(vehicle);
        }else{
              System.out.println(vehicleName+ "is not Vehicle");
        }
        
    } 
}



// class BusManager{
//     public static void main(String[] args){
//         Driver vk =new Driver();
//         vk.drive(new RedBus());//Message passing
//         System.out.println();

//         vk.drive(new Volvo());//Message passing
//         System.out.println();

//         vk.drive(new Express());//Message passing
//         System.out.println();
//     }
// }
// we are passing implementation object instants to User class Driver
// Here the problem is this BusManager class is not dynamic or LC code class
// because we are directly specifying implementation class name.
// when we neeed to change  current implementation class to another 
// every time we must modifying code.