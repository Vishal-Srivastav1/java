class Test08{
    public static void main (String[] args){
        System.out.println("Original value");
         System.out.println("from mma:"+Example.a);
         Example.m2();
         Example.m1();
          System.out.println("After modification a value m1 ");
          System.out.println("from mma:"+Example.a);
          Example.m2();
          Example.a=60;
           System.out.println("After modification a value mm ");
            System.out.println("from mma:"+Example.a);
            Example.m2();
    }
}