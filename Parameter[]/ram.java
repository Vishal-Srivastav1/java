class  parameter {
	 static void m1 (){
	  System.out.println("no parameter");
	}
    static void m2  (int x) {
	   System.out.println("one parameter");
	}
     static void m3 (int x,int y) {
	    System.out.println("two parameter");
	}
	 static void m4 (int x,int y,int z ) {
	   System.out.println("three parameter");
	}
	public static void main(String[] args) {
	  System.out.println("main");
            int a,b,c;
			a=10;
			b=20;
			c=30;
			m1();
			m2(a);
		   m3(a,b);
		   m4(a,b,c);
	}
}
