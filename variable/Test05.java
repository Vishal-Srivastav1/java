class Test05{
   static int a;
    int x;
    public static void main (String[] args){
       int p;
        Test05 t1= new Test05();

        System.out.println(a);
        System.out.println(t1.x);
        //System.out.println(p); CE variable p might not have been  initialized
    }
}