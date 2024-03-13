class Test02{
    public static void main (String[] args){
        int p =10;
        double[] da ={10.5,20.6};
        Example e =new Example();
        System.out.println("p:"+p);     //  p:10
        System.out.println("da:"+da);   // da:[D@5674cd4d   array refrence
        System.out.println("e:"+e);    //  Example@63961c4   objecct refrence

        int i1 =10;  //10
        int i2 =20;  //20
        int i3 =i1+i2; //30

        Example e1 =new Example();
        Example e2 =new Example();
       // Example e3 =e1+e2;   error bad types operaters

       //speacial point on String object
        String s1="abc";
        String s2="bbb";
        String s3=s1+s2;
        System.out.println(s1); //abc
        System.out.println(s2); //bbb
        System.out.println(s3); //abcbbb

      //  String s4 =s1-s2;  error bad types operaters'-'
      //   String s5 =s1*s2;   error bad types operaters'*'
      //   String s6 =s1/s2;   error bad types operaters'/'
      




    }
}