package Ducat.ducat.polymorphism;

class Advocate{
String name, gender;
int age;


public Advocate(String name){
    this.name=name;
    System.out.println("1st constructor called");

}

public Advocate(String name, String gender){
    this(name);
    this.gender=gender;
    System.out.println("2nd constructor is called");
}

public Advocate(String name, String gender, int age){
    this(name,gender);
    this.age=age;
    System.out.println("3rd constructor is called");

}

public void display(){
    System.out.println("Name: "+name);
    System.out.println("Gender: "+gender);
    System.out.println("Age: "+age);    

    
    
}

}


public class constructorChaining {

    public static void main(String[] args) {

        Advocate adv=new Advocate("John","Male", 26);
        adv.display();

        
        

    }
    
}


