package Ducat.ducat.Abstraction;

public class Dogesh extends Animal{

    Dogesh(){  //calling parent class constructor
        super();        
    }

    @Override
    public void wakeUP() {
        System.out.println("Dogesh is waking up");
        
    }

    @Override
    public void eat() {
        System.out.println("Dogesh is eating veg & non-veg both");
       
    }

    @Override
    public void sleep() {
        System.out.println("Dogesh is sleeping at 10 pm");
            }

    @Override
    public void Run() {
        System.out.println("Dogesh is running at a speed of 50 km/hr");
       
    }


    
}
