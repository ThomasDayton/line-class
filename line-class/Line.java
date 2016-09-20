
/**
 * Makes a line based on an inputted slope and y-intercept.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Line
{
    // Defines the equation for the line.
    private String lineEquation;
    // Inputs the slope and y-intercept of the line
    /**
     * Description: Defines the slope and y-intercept, and creates the line.
     * Input: double slope, double yIntercept
     * Output: void
     * Purpose: To create the line.
     * Example: 3.5 9
     */
    public void Line(double slope, double yIntercept){
        lineEquation = "y = " + slope + "x + " + yIntercept;
    }
    // Prints out the line.
    /**
     * Description: Prints out the line created.
     * Input: none
     * Output: void
     * Purpose: To show the user the line.
     * Example: y = 3.5x + 9
     */
    public void getLineEquation(){
        System.out.println(lineEquation);
    }
}