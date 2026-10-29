package Ducat.ducat.Abstraction;

public class Abstraction {

    public static void main(String[] args) {

        Animal a; // Upcasting of polymorphism used here.

        a = new Cow(); // putting the child object into a parent variable.

        a.wakeUP();
        a.eat();
        a.sleep();
        a.Run();
        a.nature(); //// method without body called
        a.finalkeyword(); // Final method called
        Animal.staticMethod(); // static method called
        a.protectedMethod(); // protected method called

        System.out.println("---------------------------------");

        a = new Dogesh();
        a.wakeUP();
        a.eat();
        a.sleep();
        a.Run();
        a.nature(); // method without body called
        a.finalkeyword(); // Final method called
        Animal.staticMethod(); // static method called without creating the object Animal class

        // Animal ani=new Animal(); --Object of the abstract class cannot be created or
        // instantiated.

    }
}
