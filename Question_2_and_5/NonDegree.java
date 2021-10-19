package Question_2_and_5;

/**
 * <h1> Question_2_and_5 <h1>
 *
 * @author user
 * @since 14/10/2021
 **/
public class NonDegree extends Student
{
    private String levelOfStudy;
    private String courseSupervisor;

    public NonDegree()
    {
        setLevelOfStudy();
        setCourseSupervisor();

    }

    public NonDegree(String personsName, String personsAddress, int personsAge, String matriculationNumber, String courseTitle,String levelOfStudy,String courseSupervisor)
    {
        super(personsName,personsAddress,personsAge,matriculationNumber,courseTitle);
        setLevelOfStudy(levelOfStudy);
        setCourseSupervisor(courseSupervisor);

    }

    public void setLevelOfStudy()
    {
        this.levelOfStudy = getUserInput("Please enter the level of study: ");

    }

    public void setLevelOfStudy(String levelOfStudy) {
        this.levelOfStudy = levelOfStudy;
    }

    public void setCourseSupervisor()
    {
        this.courseSupervisor = getUserInput("Please enter the name of the course supervisor: ");
    }

    public void setCourseSupervisor(String courseSupervisor) {
        this.courseSupervisor = courseSupervisor;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Level of Study: "+levelOfStudy);
        System.out.println("Course Supervisor: "+courseSupervisor);
    }
}
