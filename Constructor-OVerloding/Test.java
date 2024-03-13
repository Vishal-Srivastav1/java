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