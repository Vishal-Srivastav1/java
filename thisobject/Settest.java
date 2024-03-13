class Settest{
    public static void main (String[] args){
    Setmethod s1 =new Setmethod();
    Setmethod s2 =new Setmethod();

    s1.setX(10);
    s1.setY(20);

    s2.setX(30);
    s2.setY(40);

    s1.display();
    s2.display();
  System.out.println();
  s1.setX(15);
   s1.setY(16);

   s2.setX(18);
   s2.setY(19);

   s1.display();
   s2.display();

    }
}