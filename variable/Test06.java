class Test06{
    static byte b1;
    static short s1;
    static int i1;
    static long l1;
    static float f1;
    static double d1;
    static char ch1;
    static boolean bo1;


    static String str1;
    static Example e1;
    static int[] ia;
    static boolean[] ba;

    static int[] ia2 =new int[5];
    static boolean[] ba2 =new boolean[5];

    public static void main (String[] args) {
       int p;
       boolean q;

       String r;
       int[] s;
       Example t;

       int[] ia3 =new int[5];
       boolean[] ba3=new boolean[5];
       Example[] ea3= new Example[5];

       System.out.println("b1:"+b1);
       System.out.println("s1:"+s1);
       System.out.println("i1:"+i1);
       System.out.println("l1:"+l1);
       System.out.println("f1:"+f1);
       System.out.println("d1:"+d1);
       System.out.println("ch1:"+ch1);
       System.out.println("bo1:"+bo1);
       System.out.println();

       System.out.println("str1:"+str1);
        System.out.println("e1:"+e1);
        System.out.println("ia:"+ia);
        System.out.println("ba:"+ba);
        System.out.println();
        System.out.println("ia2:"+ia2);
        System.out.println("ba2:"+ba2);
       //char ch2='';
       //System.out.println(ch1==ch2);//false
       
        char ch3='\0';
        System.out.println(ch1==ch3);//true

        char ch4='\u0000';
        System.out.println(ch1==ch4);//true
        System.out.println(ch1==ch4);//true
               System.out.println();

       System.out.println("str1:"+str1);
        System.out.println("e1:"+e1);
        System.out.println("ia:"+ia);
        System.out.println("ba:"+ba);
        System.out.println();
        System.out.println("ia2:"+ia2);
        System.out.println("ba2:"+ba2);
              System.out.println();
               



    }
}