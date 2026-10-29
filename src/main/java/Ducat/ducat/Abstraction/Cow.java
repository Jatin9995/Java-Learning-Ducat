package Ducat.ducat.Abstraction;

public class Cow extends Animal {

    

    Cow(){       //calling parent class constructor
        super();
       
    }

    

    @Override
    public void wakeUP() {

        System.out.println("Cow is waking up! ");

    }
        

    @Override
    public void eat() {

        System.out.println("Cow is eating veg only");

    }
        

    @Override
    public void sleep() {

        System.out.println("Cow is sleeping at 8 pm ");
       
    }

    @Override
    public void Run() {
        System.out.println("Cow is running at a speed of 10km/hour " );
        
    }
    
    
    
}
