class Flower{ 
    void intro(){ 
        System.out.println("We are flowers!"); 
    } 
} 
class Type1 extends Flower{ 
    void daisy(){ 
        System.out.println("I am White in color. Find me?"); 
    } 
} 
class Type2 extends Flower{
    void hibiscus(){ 
        System.out.println("My botanical name is Hibiscus Rosacinansis. Find me?");
    } 
}
class Type3 extends Flower{
    void sunflower(){ 
        System.out.println("I am fond of sun. Find me?");
    }
}
public class Main{ 
    public static void main(String args[]){ 
        Type1 t1=new Type1(); 
        t1.intro(); 
        t1.daisy(); 
        Type2 t2=new Type2();
        t2.hibiscus();
        Type3 t3=new Type3();
        t3.sunflower(); 
    } 
}