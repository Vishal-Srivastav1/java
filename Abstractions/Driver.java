//Loose Coupling and Runtime Polymorphism
class Driver{
        //Loose Coupling
    void drive(Vehicle v){
        //Runtime Polymorphism
        v.engine();
        v.breaks();
    }
}