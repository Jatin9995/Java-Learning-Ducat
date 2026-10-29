package Methods;

class testClass{

    String name="Jatin";
    static int age= 34;

    public void m1(){

        m2();
        s1();
        s2();
        s3();
        System.out.println(name);
        System.out.println(age);
    
    }

    public void m2(){

        System.out.println("Instance method-2");
        
    
    }

public static void s1(){
        System.out.println("Static method S1");
    //    System.out.println(name);//static method cannot call non-static method and variable
        System.out.println(age);
     //   m2();  //static method cannot call non-static method and variable

    
    }

    public static void s2(){
        
         System.out.println("Static method S2");
    
    }

    public static void s3(){

        System.out.println("Static method S3");
    }

    
}


public class StaticNonstaticMethods {

    public static void main(String[] args){

        testClass test=new testClass();
        test.m1();
       
        testClass.s1();
        testClass.s2();
        testClass.s3();

        
        
    
       

      
        

        

    }
    
}
