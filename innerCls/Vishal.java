class Vishal {
  
    static void m1(){
    //A a1 = new A();
    class A{
        static final int a=10;
        int x=10;
        {
            System.out.println("IIB");
        }
        A(){
            System.out.println("A-npc");
        }
        void m1(){
            System.out.println("Nsm");
        }
        class B{}
    }//lic close

          A a1 = new A();
          System.out.println(a1.x);
          a1.m1();

  }//m1() mwthod close
   static void m2(){
    //A a1 = new A();
   }
   static I1 m3(){
    class B implements I1{
        @Override
        public void m1(){
            System.out.println("m1 is in implements in Lic B");
        }
    }
    B b1 = new B();
    return b1;
}
  static int a=10;
  int x= 20;

  static void m4(){
    class c{
        void m1(){
            System.out.println(a);
            //System.out.println(x);
            System.out.println(new Vishal().x);
        }
    }
  }
  void m5(){
    class D{
        void m1(){
            System.out.println(a);
            System.out.println(x);
        }
    }
  }
  void m6(){
          System.out.println("In m6 Start");
          int a=110;
          int x=115;

          class D{
            int a=50;
            int x=60;
        void m1(){
            int a=80;
            int x=90;
            System.out.println("In m6,in LIC D,In m1 methods");
            System.out.println(a);
            System.out.println(x);
            System.out.println(this.a);
            System.out.println(this.x);
            System.out.println(Vishal.a);
            System.out.println(Vishal.this.x);
            
        }
    }
          D d1 = new D();
          d1.m1();
          System.out.println("In m6 End");
           
  }
  static int p=10;
  int q=20;
  void m7(int m){
   int n=40;
   class E{
    void m1(){
        p=15;
        x=16;
        //m=25;
        //n=26;
    }
   }
  }
}
  
