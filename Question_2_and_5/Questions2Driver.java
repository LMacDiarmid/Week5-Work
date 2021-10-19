package Question_2_and_5;

/**
 * <h1> Question2 <h1>
 *
 * @author user
 * @since 11/10/2021
 **/
public class Questions2Driver
{
    public static void main(String[] args)
    {
        lineBreak();
        //Degree d1 = new Degree();
        Degree d2 = new Degree("Jim","1 high street", 19, "0123456","Maths",3,"Jimble Gimble");
        lineBreak();

        //NonDegree nD1 = new NonDegree();
        NonDegree nD2 = new NonDegree("Janine","3 street high", 26,"3456789","Something","HND","Marget Margretson");

        //lineBreak();
        //d1.displayDetails();
        lineBreak();
        d2.displayDetails();
        //lineBreak();
        //nD1.displayDetails();
        lineBreak();
        nD2.displayDetails();
        lineBreak();

    }



    public static void lineBreak()
    {
        System.out.println("\n_____________________________________________________________________\n");
    }
}
