// ===========================================
//Test11.java
/*
On a collection or on an array we perform below 9 operations
 1. adding objects
 2. counting objects
 3. printing objects
 4. searching object
 5. retrieving object
 6. removing object
 7. inserting object
 8. replacing object
 9. sorting object
 */
public class Test11 {
 public static void main(String[] args) {
 NITCollection col = new NITCollection();
 col.add("a");
 col.add("b");
 col.add(5);
 col.add(6.7);
 col.add('p');
 col.add(true);
 col.add(null);
 col.add("a");
 col.add(5);
 col.add(new Sa(5, 6));
 col.add("a");
 col.add(new Sa(7, 8));
 Sa s3 = new Sa(9,10);
 col.add(s3);
 System.out.println("size: "+ col.size());
 System.out.println("eles: "+ col);
 System.out.println();
 System.out.println(col.contains("a")); //"a".equals(ele) in loop -> String -> overridden -> content
 System.out.println(col.contains(5));   //5.equals(ele) in loop -> Integer -> overridden -> content
 System.out.println(col.contains(true));//true.equals(ele)->Boolean-> Overridden-> content
 System.out.println(col.contains(null));//null.equals(ele)->NPE
 System.out.println(col.contains(new Sa(5,6))); //false ->Sa(5,6).equals(ele)->!Overridden->ref
 System.out.println(col.contains(s3)); //true ->s3.equals(ele)->!Overridden->ref
 System.out.println();
 System.out.println(col.indexOf("a"));
 System.out.println(col.indexOf("A"));
 System.out.println(col.indexOf(5));
 System.out.println(col.indexOf(true));
 System.out.println(col.indexOf(null));
 System.out.println(col.indexOf(new Sa(5,6)));
 System.out.println(col.indexOf(s3));
 System.out.println();
 System.out.println(col.lastIndexOf("a"));
 System.out.println(col.lastIndexOf("A"));
 System.out.println(col.lastIndexOf(new Sa(5,6)));
 System.out.println(col.lastIndexOf(s3));
 System.out.println();
 System.out.println(col);
 System.out.println(col.get(0));
 System.out.println(col.get(5));
 System.out.println(col.get(10));
 System.out.println(col.get(12));
 Object obj = col.get(9);
 System.out.println(obj);
 Sa sa = (Sa)obj;
 System.out.println(sa.getX());
 System.out.println(sa.getY());
 sa.setX(23);
 sa.setY(24);
 System.out.println(sa.getX());
 System.out.println(sa.getY());
 System.out.println(obj);
 System.out.println(col);
 obj = col.get(0);
 String str = (String)obj;
 str.toUpperCase();
 System.out.println(col);
 System.out.println();
 System.out.println(col.capacity()); 
 System.out.println(col.size()); 
 //System.out.println(col.get(-1));
 //System.out.println(col.get(15));
 System.out.println();
 System.out.println(col);//[a, b, 5, 6.7, p, true, null, a, 5, Sa(23, 24), a, Sa(7, 😎, Sa(9, 10)]
 col.remove(0);
 System.out.println(col);//[b, 5, 6.7, p, true, null, a, 5, Sa(23, 24), a, Sa(7, 😎, Sa(9, 10)]
 col.remove(4);
 System.out.println(col);//[b, 5, 6.7, p, null, a, 5, Sa(23, 24), a, Sa(7, 😎, Sa(9, 10)]
 col.remove(9);
 System.out.println(col);//[b, 5, 6.7, p, null, a, 5, Sa(23, 24), a, Sa(9, 10)]
 System.out.println("6.7 removed: "+ col.remove(6.7)); 
 System.out.println(col);//[b, 5, p, null, a, 5, Sa(23, 24), a, Sa(9, 10)]
 System.out.println("null removed: "+ col.remove(null)); 
 System.out.println(col); //[b, 5, p, a, 5, Sa(23, 24), a, Sa(9, 10)]
 System.out.println("\"b\" removed: "+ col.remove(new String("b"))); 
 System.out.println(col); //[5, p, a, 5, Sa(23, 24), a, Sa(9, 10)]
 System.out.println("Sa(23,24) removed: "+ col.remove(new Sa(23, 24))); 
 System.out.println(col); //[5, p, a, 5, Sa(23, 24), a, Sa(9, 10)]
 col.remove(5); 
 System.out.println(col); //[5, p, a, 5, Sa(23, 24), Sa(9, 10)]
 col.remove((Integer)5); 
 System.out.println(col); //[p, a, 5, Sa(23, 24), Sa(9, 10)]
 //col.remove('p'); 
 col.remove((Character)'p'); 
 System.out.println(col); //[a, 5, Sa(23, 24), Sa(9, 10)]
 System.out.println();
 System.out.println(col.capacity());
 System.out.println(col.size());
 System.out.println(col);
 col.add(1, "X");
 System.out.println(col);
 System.out.println(col.capacity());
 System.out.println(col.size());
 System.out.println();
 NITCollection col2 = new NITCollection();
 for(int i=1; i<=10;i++) {
 col2.add(i*10);
 }
 System.out.println(col2.capacity());
 System.out.println(col2.size());
 System.out.println(col2);
 col2.add(4, "X");
 System.out.println(col2);
 System.out.println(col2.capacity());
 System.out.println(col2.size());
 System.out.println();
 System.out.println(col.capacity());
 System.out.println(col.size());
 System.out.println(col);
 col.set(3, "Y");
 System.out.println(col);
 System.out.println(col.capacity());
 System.out.println(col.size());
 }
}