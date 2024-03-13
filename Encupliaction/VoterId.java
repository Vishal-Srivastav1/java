import java.util.Scanner;
class VoterId{
    public static void main(String[] args){
        while(true){
        try{
        Scanner scn = new Scanner(System.in);
        Person p =new Person();
         System.out.print("Enter your age For VoterId Card :");
         p.setAge(scn.nextInt());
             System.out.println("you are eligible for VoterID Card your is :"+p.getAge());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        }

    }
}