class OV{
     void m1(){
                 System.out.println("no paraam");
     }
     void m1( float f){}

    static void m1(int i){
         System.out.println("S int paraam");
     }
     static void m1(double s) {
         System.out.println("v m1 double");
     }
     void m1(int i1, int i2){
         System.out.println("v m1 2 Int");
     }
      //  int m1(int i1, int i2){
//     //     System.out.println("v m1 22 Int");
//     //     return 10;
//     // }


    static int m1(String s){
         System.out.println("String paraam");
         return 10;
     }
      String m1(String s, float f){
         System.out.println("STR FL paraam");
         return "vk";
     }

 void m1(char ch){
    System.out.println("char-arg");
 }
         
     static void m2(int x){
         int x='a';
        System.out.println("x"+x);
     }

    public static void main (String[] args){
        System.out.println("main");
        OV v= new OV();
          v.m1();
          v.m1(5);
          v.m1(5.4);
          v.m1(5,5);
          v.m1("vk");
          v.m1("hk",5);

         v.m1(99);
          v.m1('c');
           v.m1((char)100);
            v.m1((int) 'c');
            v.m2(x);
            // v.m1(int)true; error
    }
}