class Test{
    public static void main(String[] arg){
        A a1 =new A();
        Test t=new Test();
        a1.m1(99);
         a1.m1('c');
          a1.m1((char)100);
           a1.m1((int)'d');
           System.out.println();
           int i1 =97;
           int i2='a';
           char ch1=98;
           char ch2='b';

           a1.m1(i1);
           a1.m1(i2);
           a1.m1(ch1);
           a1.m1(ch2);
           System.out.println();

           a1.m1((char)i1);
           a1.m1((int)ch1);

           System.out.println();
           a1.m1(i1+i2);
           a1.m1(ch1+ch2);

           System.out.println();
           a1.m1(10+'a');
           a1.m1('a'+'b');
            a1.m1((char)('a'+'b'));
             a1.m1((char)'a'+'b');
              //a1.m1(5+true);

              System.out.println();
              a1.m1(m2());
              a1.m1(m3());
    }
     static int m2(){
        return 'c';
    }
     static char m3(){
        return 67;
    }
    
}
