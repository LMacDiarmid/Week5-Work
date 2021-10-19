package Question_2_and_5;
import java.util.Scanner;

/**
 * <h1> Question2 <h1>
 *
 * @author Leanne
 * @since 11/10/2021
 **/
public class Person
{
    //Member variable declarations

    protected String personsName;
    protected String personsAddress;
    protected int personsAge;

    public Person()
    {
        setPersonsName();
        setPersonsAddress();
        setPersonsAge();

    }

    public Person(String personsName, String personsAddress, int personsAge)
    {
        setPersonsName(personsName);
        setPersonsAddress(personsAddress);
        setPersonsAge(personsAge);

    }

    public void setPersonsName()
    {
       this.personsName = getUserInput("Please enter the persons name:");
    }

    public void setPersonsName(String personsName) {
        this.personsName = personsName;
    }

    public void setPersonsAddress()
    {
        this.personsAddress = getUserInput("Please enter their address:");
    }

    public void setPersonsAddress(String personsAddress) {
        this.personsAddress = personsAddress;
    }

    public void setPersonsAge() {
        this.personsAge = Integer.parseInt(getUserInput("Please enter the persons age:"));
    }

    public void setPersonsAge(int personsAge) {
        this.personsAge = personsAge;
    }

    public String getUserInput(String prompt)
    {
        Scanner kboard = new Scanner(System.in);
        System.out.println(prompt);
        String input;
        input= kboard.nextLine();
        return input;
    }

    public void displayDetails()
    {
        System.out.println("Name: "+personsName);
        System.out.println("Address: "+personsAddress);
        System.out.println("Age: "+personsAge);

    }

    public int returnAge()
    {
        return personsAge;
    }

    public void changeAge()
    {
        this.personsAge = Integer.parseInt(getUserInput("Please enter the persons age:"));
    }


}
