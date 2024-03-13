import java.util.Scanner;
class Test{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter one num:");
     int num=sc.nextInt();
     int res= num*25/100;
     int increasedNum=num+res;
     System.out.println("Original number is"+num);
     System.out.println("25%of"+num+"is ="+res);
     System.out.println("Number after 25% increased is:"+increasedNum);


    }
}