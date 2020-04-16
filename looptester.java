import static java.lang.System.*;
/**
 * Write a description of class looptester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class looptester
{
    public static void main(String[] args)
    {
        z: while(true)
        {
            y: while(true)
            {
                break z;
            }
        }
        out.println("complete");
        main(null);
    }
    
    static void main()
    {
        z: while(true)
        {
            y: while(true)
            {
                break y;
            }
            err.println("noo");
        }
    }
}
