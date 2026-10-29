package Ducat.ducat.Abstraction;

/*
Abstraction in Java is the process of hiding internal implementation details and showing only essential functionality to the user.
It hides the complex details and shows only essential features.
Abstract classes may have methods without implementation and must be implemented by subclasses.
A method without implementation is called an abstract method.
An abstract class can have both abstract and non-abstract methods.
An abstract class cannot be instantiated.
An abstract class can have constructors.
An abstract class can have final methods. Final methods cannot be overridden by subclasses.
An abstract class can have static methods. Static methods can be called without creating an instance of the class.
An abstract class can have private methods. Private methods cannot be accessed by subclasses.
An abstract class can have protected methods. Protected methods can be accessed by subclasses and by classes in the same package.
An abstract class can have default methods. Default methods can be accessed by subclasses and by classes in the same package.
An abstract class can have private static methods. Private static methods cannot be accessed by subclasses.
Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
An abstract class can have both abstract and regular methods:
Abstract method is also called Non-Concrete Method
Regular method is also called Concrete Method.
 */
public abstract class Animal {

    //Abstract class can have constructor
     Animal(){
        System.out.println("Animal constructor called");
    }

    //Abstract methods
public abstract void wakeUP();
public abstract void eat();
public abstract void sleep();
public abstract void Run();

//Non-abstract methods
public void nature(){
    System.out.println("Every animal have different nature");
    privateMethod();//Private method can be used with concrete method.
    
    
}

//Abstract class can have final methods. final method cannot be overwridden by subclasses.
public final void finalkeyword(){
    System.out.println("Final Method:Every animal can speak");
    
}

//Abstract class can have static methods. Static methods can be called without creating an instance of the class.
public static void staticMethod(){
    System.out.println("Static Method:Every animal can speak");
    


}

//Abstract class can have private methods. Private methods cannot be accessed by subclasses.  it cann be used with concrete method.
private void privateMethod(){
    System.out.println("Private Method:Every animal can speak");
}

//Abstract class can have protected methods. Protected methods can be accessed by subclasses and by classes in the same package.  it cann be used with concrete method.
protected void protectedMethod(){
    System.out.println("Protected Method:Every animal can speak");
}

//Abstract class can have private static methods. Private static methods cannot be accessed by subclasses.  it cann be used with concrete method. means regular method.
private static void privateStaticMethod(){
    System.out.println("Private Static Method:Every animal can speak");
}




    
}
