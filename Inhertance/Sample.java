class Sample extends Example{
      static int b=m3();

      static{
         System.out.println("Sample SB");
      }
      int y=m4();
      {
         System.out.println("Sample NSB");
      }
      Sample(){
         System.out.println("Sample Const..");
      }
      static int m3(){
         System.out.println("Sample Static variable is created");
         return 30;
      }
      int m4(){
         System.out.println("Sample Non-static variable is created");
         return 40;
      }
      void abc(){
         System.out.println("Sample abc");
      }
      public static void main(String[] args){
         System.out.println("Sample main");
               Sample s = new Sample();
               s.abc();
               s.bbc();
      }
}