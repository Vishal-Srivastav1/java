class Office{
    public static void main(String[] args){

        Employee e1 =new Employee();
        Employee e2 =new Employee();
            e1.eno=101;
            e1.ename="vishal";
            e1.sal=2500;
            e1.dept="java";
            e1.mobile= new long[2];
            e1.mobile[0]= 1020304050l;
            e1.mobile[1]= 3040501020l;

            e2.eno=102;
            e2.ename="Raj";
            e2.sal=2500;
            e2.dept="Core\tjava";
            e2.mobile= new long[2];
            e2.mobile[0]= 1020304050l;
            e2.mobile[1]= 3040501020l;
            System.out.println();
                   System.out.println("==================");
                System.out.println(" VISHAL SRIVASTAV");
                    System.out.println("==================");
                    System.out.println();
                System.out.println("Employee E1 values");
        System.out.println("e1.eno\t\t:="+e1.eno);
        System.out.println("e1.ename\t:="+e1.ename);
        System.out.println("e1.sal\t\t:="+e1.sal);
        System.out.println("e1.dept\t\t:="+e1.dept);
        System.out.println("e1.mobile\t:="+java.util.Arrays.toString(e1.mobile));
        System.out.println();
                
                       System.out.println("Employee E2 values");
        System.out.println("e2.eno\t\t:="+e2.eno);
        System.out.println("e2.ename\t:="+e2.ename);
        System.out.println("e2.sal\t\t:="+e2.sal);
        System.out.println("e2.dept\t\t:="+e2.dept);
        System.out.println("e2.mobile\t:="+java.util.Arrays.toString(e2.mobile));
        System.out.println();
                System.out.println();


    }
}