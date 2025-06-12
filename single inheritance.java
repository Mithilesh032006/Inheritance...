class Flower{ 
    void intro(){ 
        System.out.println("We are flowers!"); 
    } 
} 
class Type1 extends Flower{ 
    void daisy(){ 
        System.out.println("I am White in color. Find me?"); 
    } 
    void hibiscus(){ 
        System.out.println("My botanical name is Hibiscus Rosacinansis. Find me?");
    } 
    void sunflower(){ 
        System.out.println("I am fond of sun. Find me?");
    }
} 
public class Main{ 
    public static void main(String[] args){ 
        Type1 t1=new Type1(); 
        t1.intro(); 
        t1.daisy(); 
        t1.hibiscus();
        t1.sunflower();
    } 
}