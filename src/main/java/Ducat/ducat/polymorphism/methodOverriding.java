package Ducat.ducat.polymorphism;


class Animal{
    private String name;

    public Animal(String name){
        this.name=name;

    }

    public String getName(){
        return name;
    }

    public void wakeUp(){
        System.out.println(name + "is waking up");

    }

    public void eat(){
        System.out.println(name + "is eating");

    }

    public void sleep(){
        System.out.println(name + "is sleeping");

    }


    

}

//----------------cow class----------------

 class cow extends Animal{

    public cow(String name) {
         //Parent constructor calling using super keyword
        super(name);
        
    }

    @Override
    public void wakeUp(){
        System.out.println(getName() + " is waking up early in the morning");
    }

    @Override
    public void eat(){
        System.out.println(getName() + " is eating grass");

    }

    @Override
    public void sleep(){
        System.out.println(getName() + " is sleeping in the shade");
    }

}

//-----------------dog class-------------------

class Dogesh extends Animal{
    private int age;

    
    public Dogesh(String name, int age) {
       //Parent constructor calling using super keyword
        super(name);
        this.age=age;
        
    }


    public int getAge() {
        return age;
    }


    @Override
    public void wakeUp(){
        System.out.println(getName() + " is waking up at morning");
    }

    @Override
    public void eat(){
        System.out.println(getName() + " is eating bones");

    }

    @Override
    public void sleep(){
        System.out.println(getName() + " is sleeping on the couch");
    }



}




public class methodOverriding {
    
    public static void main(String[] ards){

      Animal a=new cow("Gora");
      a.wakeUp();
      a.eat();

      System.out.println("----------------------------");

      Animal b=new Dogesh("Dodo", 5);
      b.wakeUp();
      b.eat();
     
     

    }
    
}
