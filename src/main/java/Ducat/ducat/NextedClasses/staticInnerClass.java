package Ducat.ducat.NextedClasses;


class Outerr{

    String name="Jatin";
    static String companyName="HCL";

    //Non-static method
    public void m1(){
        System.out.println(name);
        System.out.println(companyName);
        System.out.println("Outer class non-static method m1 executed");
    }

    //static method
    public static void m2(){
      // System.out.println(name);  //Error: Cannot use non-static variable in a static method
        System.out.println(companyName);
        System.out.println("Outer class static method m1 executed");
    }


    //static inner class
    public static class Innerr{
        int id=22;
        static int age= 32;

        //Non-static method
    public void method1(){
      //  System.out.println(name);
        System.out.println(companyName);
        System.out.println(id);
        System.out.println(age);
        System.out.println("Inner class non-static method1 executed");
    }

    //static method
    public static void method2(){
      //  System.out.println(name);  //Error: Cannot use non-static variable in a static method
        System.out.println(companyName);
      //  System.out.println(id); //Error: Cannot use non-static variable in a static method
        System.out.println(age);
        System.out.println("Inner class static method2 executed");
    }

    }

}


public class staticInnerClass {

    public static void main(String[] args) {

        Outerr out=new Outerr(); //object created of outer class
        out.m1(); //calling non-static method of outer class
        Outerr.m2(); //calling static method of outer class in static way. class name & method name.

       Outerr.Innerr in=new Outerr.Innerr(); //object created of inner class
        in.method1(); //calling non-static method of inner class
       Outerr.Innerr.method2(); //calling static method of inner class in static way. class name & method name.

        System.out.println("Main method executed in staticInnerClass class"); //Main method executed in staticInnerClass class
    
    
    
    
    
    }
    
}
