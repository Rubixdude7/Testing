
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog extends Animal
{
    private double weight, height;
    
    public Dog(double w, double h)
    {
        weight = w;
        height = h;
    }
    public static void speak()
    {
        System.out.println("woof");
    }
    
    public static void main(String[] args)
    {
        Animal doge = new Dog(1.2,1.3);
        speak();
    }
    
    public Dog inception()
    {
        return this;
    }
}
