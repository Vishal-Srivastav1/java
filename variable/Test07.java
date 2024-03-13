class Test07{
  public static void main(String[] args){
    long time1,time2;
    time1= System.currentTimeMillis();
    for(int i=1; i<=1000000; i++){
        int p=10;
        p=p+i;
    }
    
    time2= System.currentTimeMillis();
    System.out.println(time2-time1);

    time1= System.currentTimeMillis();
    int p=10;
    for(int i=1; i<=1000000; i++){
        p=p+i;
    }
    time2= System.currentTimeMillis();
    System.out.println(time2-time1);
     System.out.println("time 1st\t:" +time1);
    System.out.println("time 2nd\t:" +time2);
    
   
  }
}