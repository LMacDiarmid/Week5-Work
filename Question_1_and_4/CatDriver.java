package Question_1_and_4;

import java.io.IOException;

/**
 * <h1> CatDriver</h1>
 * <p>This is the driver for Question 1 of the classes - inheritance tutorial</p>
 *
 * @author Leanne
 * @since 10/10/2021
 **/
public class CatDriver
{

    public static void main(String[] args) throws IOException {

        Cat c1 = new Cat("Hamish", "Fat White", 3);
        Cat c2 = new Cat("Tango", "Striped Orange", 10);
        Cat c3 = new Cat();

        c3.getCatName("Mindy");
        c3.getCatBreed("Huge Grey Striped");
        c3.getCatAge(10);
        LineBreak();
        c1.displayDetails();
        LineBreak();
        c2.displayDetails();
        LineBreak();
        c3.displayDetails();
        LineBreak();



    }

    public static void LineBreak()
    {
        System.out.println("______________________________________________________________________");
    }
}
