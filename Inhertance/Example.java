class Example {
    static int a=m1();
    static{
        System.out.println("Example SB");
    }
    int x=m2();
    {
        System.out.println("Example NSB");
    }
    Example(){
        System.out.println("Example Const");
    }
    static int m1(){
        System.out.println("Example Variable is created");
        return 10;
    }
    int m2(){
        System.out.println("Example non-static variable is created");
        return 20;
    }
    void abc(){
         System.out.println("Example abc");
    }
    void bbc(){
         System.out.println("Example bbc");
    }
}