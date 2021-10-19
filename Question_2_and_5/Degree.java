package Question_2_and_5;

/**
 * <h1> Question_2_and_5 <h1>
 *
 * @author user
 * @since 14/10/2021
 **/
public class Degree extends Student
{
    private int yearOfStudy;
    private String tutorsName;

    public Degree()
    {
        setYearOfStudy();
        setTutorsName();

    }

    public Degree(String personsName, String personsAddress, int personsAge, String matriculationNumber, String courseTitle, int yearOfStudy, String tutorsName)
    {
        super(personsName,personsAddress,personsAge,matriculationNumber,courseTitle);
        setYearOfStudy(yearOfStudy);
        setTutorsName(tutorsName);
    }


    public void setYearOfStudy()
    {
        this.yearOfStudy = Integer.parseInt(getUserInput("Please enter the year of study: "));

    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void setTutorsName()
    {
        this.tutorsName = getUserInput("Please enter the tutors name: ");
    }

    public void setTutorsName(String tutorsName) {
        this.tutorsName = tutorsName;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Year of Study: "+yearOfStudy);
        System.out.println("Tutors Name: "+tutorsName);
    }
}
