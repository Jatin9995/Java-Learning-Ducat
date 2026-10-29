package Ducat.ducat.Interface;

public class Myinterface {
    public static void main(String[] args) {

        Animal c = new Cow();
        c.wakeUP();
        c.eat();
        c.sleep();
        c.Run();
        c.f1();
        c.m1();
        c.m2();
        c.f2();

        System.out.println("------------------------------");

        Animal d = new Dogesh();
        d.wakeUP();
        d.eat();
        d.sleep();
        d.Run();
        d.f1();
        d.m1();
        d.m2();
        d.f2();

    }
}
