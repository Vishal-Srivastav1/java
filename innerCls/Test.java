class  Test{
    static {
        System.out.println(" T OOC SB");
    }
    public static void main (String[] args){
        System.out.println("T OOC MM");
        Example.A.m1();
        //A a1 = new A();
        Example.A a1 = new Example.A();
          a1.m2();
         Example.A.B b1 = new Example.A.B(); 
    }
}