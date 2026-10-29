package Ducat.ducat.Interface;

interface Animal extends A, B {

	// Abstract method
	public abstract void wakeUP();

	public abstract void eat();

	public abstract void sleep();

	public abstract void Run();

	public abstract void f1();

	public abstract void m1();

}

interface A {

	public abstract void m2();
}

interface B {

	public abstract void f2();
}
