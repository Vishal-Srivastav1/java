class Vishal{
    static{
        System.out.println("static");
    }

    {
       System.out.println("NSB");

    }
    static int m1(){
        int a=10;
        int b=20;
        int c=a+b;
        return c;
        
    }

    public static void main(String[] args){
         System.out.println("main");
         
          System.out.println(m1());
    }
}