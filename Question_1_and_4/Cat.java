package Question_1_and_4;
import java.io.*;
/**
 * <h1> Cat Class</h1>
 * <p>This is the class for cat</p>
 * @author Leanne
 * @since 10.10.2021
 * @version 1
 */

public class Cat
{
    //Declarations of member variables
     protected String catName;
     protected String catBreed;
     protected int catAge;

    /**
     * <h1> Cat Constructor </h1>
     * <p> takes in three parameters and then proceeds to
     *     call the getter that then assigns those parameters to
     *     private member variable</p>
     * @param a name
     * @param b breed
     * @param c age
     */
    public Cat(String a, String b, int c)
    {
        getCatDetails(a,b,c);
    }

    /**
     * <h1> Cat Constructor</h1>
     * <p>This is an empty constructor</p>
     */
    public Cat()
    {

    }

    /**
     * <h1> getCatName</h1>
     * <p> sets the member variable CatName with the taken
     *     parameter</p>
     *
     * @param gCatName catName
     */
    public void getCatName(String gCatName)
    {
        catName = gCatName;
    }

    /**
     * <h1>getCatBreed</h1>
     * <p> sets the member variable CatBreed with the taken
     *     parameter</p>
     *
     * @param gBreed catBreed
     */
    public void getCatBreed(String gBreed)
    {
        catBreed = gBreed;
    }

    /**
     *<h1>getCatAge</h1>
     *<p>sets the member variable CatAge with the taken
     *   parameter</p>
     *
     * @param gAge CatAge
     */
    public void getCatAge(int gAge)
    {
        catAge = gAge;
    }

    /**
     * <h1>GetCatDetails</h1>
     * <p> sets the corresponding member variable with
     *     the taken in parameter</p>
     *
     * @param gCatName CatName
     * @param gBreed CatBreed
     * @param gAge CatAge
     */
    public void getCatDetails(String gCatName, String gBreed, int gAge)
    {
        catName = gCatName;
        catBreed = gBreed;
        catAge = gAge;

    }

    /**
     * <h1>displayDetails</h1>
     * <p>displays each of the stored values in the
     *    member variables</p>
     * @throws IOException the exception
     */
    public void displayDetails() throws IOException
    {
        System.out.println("Cats name is : "+catName);
        System.out.println("Cats breed is : "+catBreed);
        System.out.println("Cats age is : "+catAge);

    }

}
