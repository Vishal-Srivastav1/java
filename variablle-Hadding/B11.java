class B11 extends A10{
   int x=30;
   int y=40;

   void m2(){
     System.out.println(x+" "+y);
      System.out.println(super.x+" "+super.y);
   }
   void m3(){
    x=50;
    y=60;
    super.x=70;
    super.y=80;
   }
}