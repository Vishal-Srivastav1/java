class B1 extends A1{
    static int b=m2();
    static int m2(){
        System.out.println("B.b");
        return 20;
    }
    static{
        System.out.println("B class is lodded");
    }
    public static void main(String[] args){
        System.out.println("B main");
         System.out.println("B main a:"+a);
          System.out.println("B main b:"+b);
    }
}