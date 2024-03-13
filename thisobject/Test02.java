class Test02{
     Test02(){ }
    Test02(int x){int d=10;}
    void m1(int x){int d=10;}

    static void m2(int x){int d =10;}

    void m3(){
       // this="a";
    }

    void m4(){
        System.out.println("from m4 this:"+this);
    }
     public static void main(String[] args){
       Test02 t1 = new Test02();
       System.out.println("from main t1:="+t1);
       t1.m4();
       System.out.println();

       Test02 t2= new Test02();
       System.out.println("from main t2:="+t2);
       t2.m4();
       System.out.println();
    }
}
   
    class A{
        void m1 (){
      //      this ="a";
        }
    }
    class B{
        void m1 (){
      //      this ="a";
        }
    }
    class C{
        void m1 (){
      //      this ="a";
        }
    }
    class D{
        void m1 (){
       //     this =null;
        }
    }
