import java.util.Scanner;
class Pulsar{
    public static void main (String[] args){
     while(true){
         try{
        Scanner scn=new Scanner(System.in);
        Bike b1=new Bike();
        System.out.print("ENTER THE GEAR NUM :");
        b1.setGear(scn.nextInt());
       if(b1.getGear()==0)
        System.out.println("Pulsar is Neutral");
        else
             System.out.println("Pulsar Running in Current gear :"+b1.getGear());
      }catch (IllegalArgumentException e){
        System.out.println(e.getMessage());
      }
    }
     }
}