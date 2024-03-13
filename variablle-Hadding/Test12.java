class Test12{
    static{
        System.out.println("Test12 is loaded");
    }
    public static void main(String[] args){
        B12 b1 =new B12();
        C12 c1= new C12();

         b1.a=15;
         b1.x=16;
         System.out.println(b1.a);
          System.out.println(c1.a);
           System.out.println(b1.x); 
           System.out.println(c1.x);

    }
}