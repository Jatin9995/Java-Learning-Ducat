package Ducat.ducat.encapsulation;


class Person{
    private String name, gender;
    private int age, id;


    public Person(String name, String gender, int age, int id){
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.id=id;

    }

    public void printDescription(){
        System.out.println("Name is: " + name);
         System.out.println("Gender is: " + gender);
          System.out.println("Age is: " + age);
           System.out.println("ID is: " + id);


    }

    //---------------------setter---------

    public void setName(String name){
        this.name=name;

    }

    public void setGender(String gender){
        this.gender=gender;

    }

    public void setAge(int age){
        this.age=age;
    }

    public void setId(int id){
        this.id=id;
    
    }
   
  //-----------------Getter-----------------------------------
  
  public String getName(){
    return name;
  }

  public String getGender(){
    return gender;

  }

  public int getAge(){
    return age;
  }
  
  public int getId(){
    return id;
  }

  public void calculateAge(){
    if (age>=50) {
        System.out.println(name + " " +  "Congratulations! you are elegible for seniour citizen 20% discount");
    }else
        System.out.println("Sorry !! You are not elegible");
  }

    }



public class getterNSetter {

public static void main (String [] args){

   Person jatin=new Person("Jatin", "male", 34, 100);
   jatin.printDescription();

    System.out.println("-------------------------------------------------------------");

   Person vijit=new Person("Vijit", "male", 32, 101);
   vijit.printDescription();

   System.out.println("-------------------------------------------------------------");

   jatin.setName("Jatin Rout");
   jatin.setGender("Male");
   jatin.setAge(50);
   jatin.setId(201);
   jatin.printDescription();
   jatin.calculateAge();
   
    System.out.println("-------------------------------------------------------------");

   vijit.setName("Vijit Sharma");
   vijit.setGender("Male");
   vijit.setAge(20);
   vijit.setId(202);
   vijit.printDescription();
   vijit.calculateAge();

}


}
    

