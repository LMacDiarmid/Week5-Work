package Question_2_and_5;
import java.util.Scanner;

/**
 * <h1> Question_2_and_5 <h1>
 *
 * @author Leanne
 * @since 11/10/2021
 **/
public class Student extends Person
{
    protected String matriculationNumber;
    protected String courseTitle;

    public Student()
    {
        setMatriculationNumber();
        setCourseTitle();

    }

    public Student(String personsName, String personsAddress, int personsAge, String matriculationNumber, String courseTitle)
    {
        super(personsName,personsAddress,personsAge);
        setMatriculationNumber(matriculationNumber);
        setCourseTitle(courseTitle);
    }



    public void setMatriculationNumber() {
        this.matriculationNumber = getUserInput("Please enter the matriculation number:");

    }

    public void setMatriculationNumber(String matriculationNumber)
    {
        this.matriculationNumber = matriculationNumber;
    }


    public void setCourseTitle() {
        this.courseTitle = getUserInput("Please enter the course title: ");
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void changeAddress()
    {
        this.personsAddress = getUserInput("Please enter the new address: ");


    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Matriculation Number: "+matriculationNumber);
        System.out.println("Course Title: "+courseTitle);
    }
}
