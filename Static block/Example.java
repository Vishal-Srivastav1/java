class Example {
    static int a=10;
     
     static{
        System.out.println("SB1");
     }
     public static void main(String[] args){
        System.out.println("Main Method");
     }
     static{
        System.out.println("SB2");
     }
     static int b=20;
     static void m1(){
        System.out.println("SM");
     }
}