package Methods;

class Animal1{

    private String name;

    Animal1(String name){
        this.name=name;
    }

 public String getName(){
    return name;
 }

 public void eat(){
    System.out.println(getName() + "Eats meat");
 }

 public void sleep(){
    System.out.println(getName() + " sleeps at night");
 }

 public void home(){
    System.out.println(getName() + " Lives in jungle");
 }

 }

 class tiger1 extends Animal1{
  private String color;
    tiger1(String name, String color) {
        super(name);
        this.color=color;
    }

    public String getColor(){
        return color;
    }

    public void print(){
        System.out.println("Name of the tiger is: " + getName());
        System.out.println("Color of the tiger is: " + getColor());
        eat();
        sleep();
        home();
    }

 }

 class cub1 extends tiger1{
    private int age;
    cub1(String name, String color, int age){
        super(name, color);
        this.age=age;
    }

    public int getAge(){
        return age;
    }


public void print(){
    System.out.println("Name of the cub is: " + getName());
    System.out.println("Color of the cub is: " + getColor());
    System.out.println("Age of the cub is: " + getAge());
    eat();
    sleep();
    home();
}


 }

 class dog1 extends Animal1{
    private String color;
    dog1(String name, String color){
        super(name);
        this.color=color;
    }

    public String getColor(){
        return color;
    }

    public void bark(){
        System.out.println(getName());

    }

    public void print(){
        System.out.println("Name of the dog is : " + getName());
        System.out.println("Color of the dog is : " + getColor());
        eat();
        sleep();
        home();
    }

 }

 class puppy1 extends dog1{
  private int age;
  puppy1(String name, String color, int age){
      super(name, color);
      this.age=age;
  }

  public int getAge(){
      return age;
  }

  public void print(){
    System.out.println("Name of the puppy is: " + getName());
    System.out.println("Color of the puppy is: " + getColor());
    System.out.println("Age of the puppy is: " + getAge());
    eat();
    sleep();
    home();

  }

 }

 
public class inheritance_using_constructor_2 {

    public static void main (String[] args){

        Animal1 a=new Animal1("Tiger");
        a.eat();
        a.sleep();
        a.home();

System.out.println("------------------------------------");
        
        tiger1 t=new tiger1("Sherkhan", "Orange with blank strip");
        t.print();

System.out.println("------------------------------------");

        cub1 c=new cub1("Simba", "orange", 5);
        c.print();

        System.out.println("------------------------------------");



dog1 d=new dog1("Dodo", "Golden");
d.print();



 System.out.println("------------------------------------");

 puppy1 p=new puppy1("charlie", "Black", 2);
 p.print();
 







    }
    
}
