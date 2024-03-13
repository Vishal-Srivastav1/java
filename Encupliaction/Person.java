class Person{
    private int age;

    public void setAge(int age)throws IllegalArgumentException{
    if (age<18 || age>120)
    throw new IllegalArgumentException("your are not eligible for the voterId card...!");
    this.age=age;
   }

   int getAge(){
    return age;
   }

}