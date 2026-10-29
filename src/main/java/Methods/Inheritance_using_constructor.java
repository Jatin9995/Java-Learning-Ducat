package Methods;


class car{

    private String name;

    //constructor
    car(String name){
        this.name=name;
        System.out.println("Car constructor called");
    }

    public String getName(){
        return name;
    }


   public void weels(){
    System.out.println(getName() + " Car has 4 weels");

   }

   public void fuel(){
    System.out.println(getName() + " Car uses CNG");

   }

   public void sunroof(){
    System.out.println(getName() + " Car has sunroof");

   }
    
}

class suv extends car{

    private int price;

    //constructor
    suv(String name, int price) {
        super(name);
        this.price=price;
        
    }

    public int getPrice(){
        return price;
    }
    
    }
    

    class Scorpio extends suv{
        private int seatingCapacity;

        //constructor
        Scorpio(String name, int price, int seatingCapacity){
            super(name, price);
            this.seatingCapacity=seatingCapacity;

        }

        public int getSeatingCapacity(){
            return seatingCapacity;
        }

        public void print(){
            System.out.println("Car name is: " + getName());
            System.out.println("Price is: " + getPrice());
            System.out.println("Seating capacity is: " + getSeatingCapacity());
            weels();
            fuel();
            sunroof();
        }

    }

    //-------------------------------------------------------------------------------------------------------------------
    

    class Sedan extends car{
     private int price;
        Sedan(String name, int price) {
            super(name);
            this.price=price;
        }

        public int getprice(){
            return price;
        }

        }   

    class verna extends Sedan{
        private int seatingCapacity;
        verna(String name, int price, int seatingCapacity) {
            super(name, price);
            this.seatingCapacity=seatingCapacity;
        }

        public int getSeatingCapacity(){
            return seatingCapacity;
        }

        public void print(){
            System.out.println("Car name is: " + getName());
            System.out.println("Price is: " + getprice());   
            System.out.println("Seating capacity is: " + getSeatingCapacity());
            weels();
            fuel();
            sunroof();
         
        }

        
    }



public class Inheritance_using_constructor {

    public static void main (String[] args){

        Scorpio s=new Scorpio("Scorpio", 120000, 7);
        s.print();

        System.out.println("------------------------------------------");

        verna v=new verna("Verna", 100000, 7);
        v.print();

    





    }
    
}
