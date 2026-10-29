package Ducat.ducat.Interface;

public class Dogesh implements Animal, A, B {

    @Override
    public void wakeUP() {

        System.out.println("Dogesh is waking up");

    }

    @Override
    public void eat() {
        System.out.println("Dogesh is eating");

    }

    @Override
    public void sleep() {

        System.out.println("Dogesh is sleeping");

    }

    @Override
    public void Run() {

        System.out.println("Dogesh is running");

    }

    @Override
    public void f1() {

        System.out.println("Dogesh f1 method called");

    }

    @Override
    public void m1() {

        System.out.println("Dogesh m1 method called");

    }

    @Override
    public void f2() {
        System.out.println("interface class f2 method called");
    }

    @Override
    public void m2() {
        System.out.println("interface class m2 method called");
    }

}
