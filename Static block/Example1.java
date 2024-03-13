class Example1{
   static int a=m1();

    static int m1(){
        System.out.println("EXsv");
        return 10;
    }
    static{
       System.out.println("EXSB");  
    }
    static void m2(){
         System.out.println("EXsm");
    }

    public static void main (String[] args){
     System.out.println("EXMM");
    }
}