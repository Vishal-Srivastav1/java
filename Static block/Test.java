class Test{
    static int a=10;

    static{
        System.out.println("EXSB1");
    }
    static int b=20;
     static{
        System.out.println("EXSB2");
    }
    public static void main(String[] args){
        System.out.println("main method");
    }
    static{
         System.out.println("EXSB3");
    }
    static int c=30;

}