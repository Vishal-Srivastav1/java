class B extends A{
    int x=50;
    void m1(){
        System.out.println(x);
         System.out.println(this.x);
          System.out.println(super.x);
    }
    public static void main (String[] args){
         System.out.println("main");
         B b =new B();
           b.m1();

    }
}