class Example extends Sample{
    static void m1(){
        System.out.println("vi m1example");
       
    }
    static void m2(){
        System.out.println("vi m2example");
       
    }
    static void m3(){
        System.out.println("m3example ");
        
     }
     public static void main(String[] args){
        System.out.println("srivastav");
        Example.m1();
        Sample e1=new  Example();
         //Test e1=new Test();
         e1.m3();
         e1.m1();
         e1.m2();
    }

}