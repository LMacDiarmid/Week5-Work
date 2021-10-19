package Question_1_and_4;

import java.io.IOException;

/**
 * <h1> CatDriver</h1>
 * <p>This is the driver for Question 4 of the classes - inheritance tutorial</p>
 *
 * @author Leanne
 * @since 10/10/2021
 **/
public class CatDriverQ4
{

    public static void main(String[] args) throws IOException {

        Cat c1 = new Cat("Hamish", "Fat White", 21);
        Kitten k1 = new Kitten("Hamish 2", "Fat Grey",1,"green eyes",25);
        Kitten k2 = new Kitten("Mindy","Striped Grey",2,"blue eyes",40);

        lineBreak();
        c1.displayDetails();
        lineBreak();
        k1.displayDetails();
        lineBreak();
        k2.displayDetails();
        lineBreak();






    }

    private static void lineBreak()
    {
        System.out.println("______________________________________________________________________");
    }

}
