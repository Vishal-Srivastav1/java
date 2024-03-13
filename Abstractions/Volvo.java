// inheritance +polymorphism +encapsulation
class Volvo extends Bus{
    @Override
    public void engine(){
        System.out.println("Volvo engine capsity 110 kmph");
    }

     @Override
    public void breaks(){
        System.out.println("Volvo needs powerful breaks");
    }
}