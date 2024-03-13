class Example{
    private int x;
    Example(int x){
        this.x = x;
    }
    Example(Integer x){
        this.x = x.intValue();
    }
    Example(String x){
        this.x=Integer.parseInt(x);
    }
    public int getX(){
        return x;
    }
}
class Test{
    public static void main (String[] args){
        Example e1 = 
          new Example(5);
         Example e2 = 
             new Example(new Integer(6));
        Example e3 = 
            new Example("7");   
     
    System.out.println(e1.getX());

    System.out.println(e2.getX());
    System.out.println(e3.getX());
  }
}
    Test.java:6: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
             new Example(new Integer(6));
                         ^
         1 warning