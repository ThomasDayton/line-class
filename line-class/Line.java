
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
    public Line(double slope, double yIntercept){
        lineEquation = "y = " + slope + "x + " + yIntercept;
    }
    // Prints out the line.
    public void getLineEquation(){
        System.out.println(lineEquation);
    }
}