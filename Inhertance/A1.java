class A1{
    static int a=m1();
    static int m1(){
        System.out.println("A.a");
        return 10;
    }
    static{
        System.out.println("A class is loded");
    }
    public static void main(String[] args){
        System.out.println("A.main");
    }
}