class Example3{
    static int a;
    static void m1(int a){
        Example3.a=a;
        System.out.println(a);
    }
    
        public static void main(String[] args){
        System.out.println(a);
        m1(50);
        System.out.println(a);
    }
}