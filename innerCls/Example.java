class Example{
    
    static{
        System.out.println("Outer class Static block");
    }
    public static void main(String[] args){
        System.out.println("Outer class Main");
             A.m1();
              A a1 = new A();
              a1.m2();//non-static method access using class refrence in same inner outerclass
    }
    class Ac{}

    static class A{
        static int a=10;
        int x = 20;

         static {
              System.out.println("\n static inner class Static block");
         }

         {
            System.out.println("\n static inner class Instance inniligation block");
         }

         A(){
            System.out.println("\n static inner class Non-param Constractor");
         }

         static void m1(){
             System.out.println("\n static inner class Static Method");
         }

         void m2(){
            System.out.println("\n static inner class N0n-Static Method");
         }

         public static void main(String[] args){
            System.out.println("\n static inner class Main");
              m1();
              A a1 = new A();
               a1.m2();

         }
         static class B{
             public static void main(String[] args){
            System.out.println("\n static inner class Main");
         }
         
         class C{}
         //abstract void m3(); allowed
    } //static inner class close'
}  //  Outer class close'
}