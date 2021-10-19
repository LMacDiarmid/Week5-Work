package Question_1_and_4;

import java.io.IOException;

/**
 * <h1> Question1_and_4 <h1>
 *
 * @author user
 * @since 11/10/2021
 **/
public class Kitten extends Cat
{

     protected String eyeColour;
     protected int lengthInCM;



    public Kitten(String gName, String gBreed, int gAge, String gEyeColour, int gLengthInCM)
    {
        getCatName(gName);
        getCatBreed(gBreed);
        getCatAge(gAge);
        getEyeColour(gEyeColour);
        getLengthInCM(gLengthInCM);

    }

    public void getEyeColour(String gEyeColour)
    {
        this.eyeColour = gEyeColour;
    }

    public void getLengthInCM(int gLengthInCM)
    {
        this.lengthInCM = gLengthInCM;
    }



    @Override
    public void displayDetails() throws IOException {
        super.displayDetails();

        System.out.println("Kittens eye colour: "+eyeColour);
        System.out.println("Kittens length: "+lengthInCM+"cm");
    }


}
