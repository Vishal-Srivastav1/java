class Sample{
    static int d=50;
    static{
        System.out.println("SASB1");
        System.out.println(Test.a);
    }
    public static void main (String[] args){
        System.out.println("Sample main");
        System.out.println(Test.b);
    }
}