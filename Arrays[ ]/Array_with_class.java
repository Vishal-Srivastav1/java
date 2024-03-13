/* Devlop a program to store multiple object of a class as one group by 
   using an array. */

class Array_with_class {
public static void main (String[] args){
// static natural code for Storing object
// When we need to store new object every time
 // we must modify this code by creating new variable
       Xyz x1=new Xyz();
      Xyz x2=new Xyz();
       Xyz x3=new Xyz();

       System.out.println(x1);
       System.out.println(x2);
// soluction= we must create array object with the reguired number of variable
  // on its size 
       Xyz[] xa =new Xyz[3];
       xa[0] =new Xyz();
       xa[1] =new Xyz();
       xa[2] =new Xyz();
//reading and displaying 0 index object 
       System.out.println("===Printing[xa[0]]====");
        System.out.println(xa[0].i);
        System.out.println(xa[0].ch);
         System.out.println(xa[0].sa);
          System.out.println(xa[0].sa[0]);
          System.out.println(xa[0].sa[1]);
           System.out.println(xa[0].s);
            System.out.println(xa[0].a1);
             System.out.println(xa[0].a1.L);
              System.out.println(xa[0].a1.bo);
              System.out.println();
    System.out.println("===Printing[xa[1]]====");
              System.out.println(xa[1].i);
        System.out.println(xa[1].ch);
         System.out.println(xa[1].sa);
          System.out.println(xa[1].sa[0]);
          System.out.println(xa[1].sa[1]);
           System.out.println(xa[1].s);
            System.out.println(xa[1].a1);
             System.out.println(xa[1].a1.L);
              System.out.println(xa[1].a1.bo);
              System.out.println();
     System.out.println("===Printing[xa[2]]====");
                    System.out.println(xa[2].i);
        System.out.println(xa[2].ch);
         System.out.println(xa[2].sa);
          System.out.println(xa[2].sa[0]);
          System.out.println(xa[2].sa[1]);
           System.out.println(xa[2].s);
            System.out.println(xa[2].a1);
             System.out.println(xa[2].a1.L);
              System.out.println(xa[2].a1.bo);
System.out.println();
System.out.println("Dyanimic Natural");
              for(int i=0;i<xa.length;i++){

                System.out.println(xa[i].i);
        System.out.println(xa[i].ch);
         System.out.println(xa[i].sa);
              }
         for(int j=0;j<xa.length;j++){

          System.out.println(xa[j].sa[0]);
          System.out.println(xa[j].sa[1]);
           System.out.println(xa[j].s);
            System.out.println(xa[j].a1);
             System.out.println(xa[j].a1.L);
              System.out.println(xa[j].a1.bo);
         }

   }

}