import java.util.Scanner;
class TestA{
    public static void main(String[] args){
       while(true){
        try{
            Scanner scn = new Scanner(System.in);
            Addition A= new Addition();
             System.out.print("Enter the num :");
             A.setNum(scn.nextInt());
             if(A.getNum()==0)
               System.out.println("Dont pass 0 pass greater then 0 ...!");
            else
             System.out.println("Your current value is :"+ A.getNum());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());

        }
       }
    }
}