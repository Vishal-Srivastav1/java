class Gettest {
    public static void main(String[] args){
         Getmethod g1 = new Getmethod();
         Getmethod g2 = new Getmethod();

        g1.setX(20);
        g1.setY(30);
        g2.setX(40);
        g2.setY(50);

        System.out.println(g1.getX()+" "+g1.getY());
        System.out.println(g2.getX()+" "+g2.getY());

        g1.setX(60);
        g1.setY(70);
        g2.setX(80);
        g2.setY(90);

        g1.display();
        g2.display();



    }
}