class Test04{
    static int i4;
    int i5;
    public static void main (String[] args){
      // i1 =10;  c f s
       int i1;
        i1=10;

       int i2=20;
       System.out.println(i1);
       // System.out.println(i3);  //CE c f s
        int i3;
       // System.out.println(i3);//CE: VARIABLE I3 MIGHT NOT HAVE BEEN INITIALIZED
        i3 =30; 
        Test04 t1= new Test04();
        System.out.println(i3);
      System.out.println(i4);
      System.out.println(t1.i5);
       
    }//end main method
  // static int i4;
   //int i5;
}