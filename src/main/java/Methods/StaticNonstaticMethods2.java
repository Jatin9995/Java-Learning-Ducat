package Methods;

class StaticNonstaticblock{

public StaticNonstaticblock(){
    System.out.println("This is executed for constructor");
}

//--------------instance init block-----------------

{
    System.out.println("Instance init block 2");
    


}

{
    System.out.println("Instance init block 1");
}

//-------------------------static block----------------------

static{
    System.out.println("Static block 1");
}

static{
    System.out.println("Static block 2");
}

}



public class StaticNonstaticMethods2 {

    public static void main(String[] args){

         StaticNonstaticblock obj=new StaticNonstaticblock(); 

       System.out.println("executed for main class");

       {
        System.out.println("Local blcok 1");
       }

        {
        System.out.println("Local blcok 2");
       }

{
       System.out.println("main method 2");
}

{
       System.out.println("main method 3");
}

    }
    
}


