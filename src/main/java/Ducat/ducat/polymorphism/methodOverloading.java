package Ducat.ducat.polymorphism;


class calculation{

    public void sum(int a, int b){
        System.out.println(a+b);
    }

    public void sum(int a, int b, int c){
        System.out.println(a+b+c);

    }

    public void sum(double a, int b, int c){
        System.out.println(a+b+c);

    }

    public void sum( double a, int b){
        System.out.println(a+b);

    }

    public void sum( int a, double b){
        System.out.println(a+b);

    }

     public void sum( int a, double b, int c){
        System.out.println(a+b);

    }

     public void sum( int a, int b, double c){
        System.out.println(a+b);

    }
}




public class methodOverloading {

    public static void main (String[] args){

        calculation c=new calculation();
        c.sum(5, 5.5);
        c.sum(7.5, 6);
        c.sum(12, 5);
        c.sum(5, 5, 5.5);
        c.sum(6, 6.6, 6);
        c.sum(12.5, 5, 5);
        c.sum(12, 4, 6);






    }
    
}
