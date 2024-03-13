class Example{
    int x;
   void m1(){
      System.out.println(" from m1 x:="+x);
      x=50;
      System.out.println(" from m1 x:="+x);
   }
   void m2(){//void m2(Example this) this is current class refrence
      System.out.println(" from m2 x:="+x);
      
   }

}