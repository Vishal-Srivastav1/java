//abstraction+inheritance +Polymorphism +encapsulation
// (Partial abstraction)  

// All 'Bus' sub types 
// RedBus
// Volvo
// Express
// Vehicle interface class common for all sub type classes
// Driver for calling
// BusManager user class

abstract class Bus implements Vehicle{
    @Override
      public void breaks(){
        System.out.println("Bus has normal breaks");
      }
}