package Ducat.ducat.Interface;

public class Cow implements Animal, A, B {

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
        System.out.println("Cow is running at a speed of 10km/hour ");

    }

    @Override
    public void f1() {
        System.out.println("cow f1() is called  ");

    }

    @Override
    public void m1() {
        System.out.println("cow m1() is called  ");

    }

    @Override
    public void f2() {
        System.out.println("Interface class method f2 called");
    }

    @Override
    public void m2() {
        System.out.println("Interface class method m2 called");
    }

}
