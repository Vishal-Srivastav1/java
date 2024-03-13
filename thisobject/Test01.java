class Test01{
    public static void main(String[] args){
         Example e1 =new Example();
         Example e2 =new Example();
         System.out.println("from main e1.x="+e1.x);
         e1.m1();
         System.out.println("from main e1.x="+e1.x);
         System.out.println();

         System.out.println("from main e2.x="+e2.x);
         e2.m1();
         System.out.println("from main e2.x="+e2.x);
         System.out.println();
         //==========================================
         System.out.println("from main e1.x="+e1.x);//50
         e1.x=25;
          System.out.println("from main e1.x="+e1.x);//25
         e1.m2(); //25
         e1.m1();//25,50
         System.out.println();
         e2.x=27;
          System.out.println("from main e2.x="+e2.x);//27
         e2.m2();//27
         e2.m1(); //27,50

         
    }
}