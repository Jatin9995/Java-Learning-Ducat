package Ducat.ducat.NextedClasses;


class Outer{

    String name="Jatin";
    static String companyNamne="HCL";

    //Non-static method
    public void m1(){
        System.out.println(name);
        System.out.println(companyNamne);
        System.out.println("Outer class non-static method m1 executed");
    }

    //static method
    public static void m2(){
      // System.out.println(name);  //Error: Cannot use non-static variable in a static method
        System.out.println(companyNamne);
        System.out.println("Outer class static method m1 executed");
    }


    //Non-static inner class
    class Inner{
        int id=22;
        static int age= 32;

        //Non-static method
    public void method1(){
        System.out.println(name);
        System.out.println(companyNamne);
        System.out.println(id);
        System.out.println(age);
        System.out.println("Inner class non-static method1 executed");
    }

    //static method
    public static void method2(){
      //  System.out.println(name);  //Error: Cannot use non-static variable in a static method
        System.out.println(companyNamne);
      //  System.out.println(id); //Error: Cannot use non-static variable in a static method
        System.out.println(age);
        System.out.println("Inner class static method2 executed");
    }

    }

}

public class Nestedclass {

    public static void main(String[] args) {

        System.out.println("Main method executed in Nestedclass class");


        Outer out=new Outer(); //object created of outer class
        out.m1(); //calling non-static method of outer class
        Outer.m2(); //calling static method of outer class in static way. class name & method name.

       Outer.Inner in=out.new Inner(); //object created of inner class
        in.method1(); //calling non-static method of inner class
        Outer.Inner.method2(); //calling static method of inner class in static way. class name & method name.





        
    }


    
}
