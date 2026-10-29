package Methods;

class Animal{

    public void stay(){

        System.out.println("Animal stays in jungle");
    }

     public void eat(){

        System.out.println("Animal eat meat and tree leaves");
        
       
    }

}


class Tiger extends Animal{

    public void roar(){
        System.out.println("Tiger roars");
    }
    
    public void color(){
        System.out.println("color of the tiger is orange with black strip");
    }

}

    class cup extends Tiger{

        public void play(){
            System.out.println("Cubs play together");
        }

        public void cubcry(){
            System.out.println("Cubs roar like a tiger");
        }

        }


    class dog extends Animal{

        public void bark(){
                System.out.println("Dog barks");
            
        }

        public void dogeat(){
            System.out.println("Dog eats meat");
          
        } 

    }

    class puppy extends dog{

        public void play(){
            System.out.println("Puppy plays with ball");
        }

        public void bark(){
            System.out.println("Puppy barks");
        } 

    }

    class spaceline{
        public void space(){
            System.out.println("-------------------------------------------------");
        }
    }



public class Inheritance {

    public static void main (String[] args){

        spaceline s = new spaceline();
         
        Animal a=new Animal();
        a.stay();
        a.eat();

        s.space();

        Tiger t=new Tiger();
        t.stay();
        t.eat();
        t.roar();
        t.color();

         s.space();

        cup c=new cup();
        c.stay();
        c.eat();
        c.roar();
        c.color();
        c.play();
        c.cubcry();

       s.space();
       
       dog d=new dog();
       d.stay();
       d.eat();
       d.bark();
       d.dogeat();

        s.space(); 

       puppy p=new puppy();
       p.stay();
       p.eat();
       p.bark();
       p.dogeat();
       p.play();
       p.bark();


    }
    
}
