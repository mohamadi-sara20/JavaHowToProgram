//Note that we didn't get use of our ColorTest class in another application yet. 
//
// (Color Chooser) Use a HashMap to create a reusable class for choosing one of the 13 pre-
//defined colors in class Color. The names of the colors should be used as keys, and the predefined
//Color objects should be used as values. Place this class in a package that can be imported into any
//Java program. Use your new class in an application that allows the user to select a color and draw a
//shape in that color.
package JavaHowToProgram.Chapter16;
import java.awt.Color;
import java.util.HashMap;

public class ColorTest {
    private HashMap<String, Color> colorMap = new HashMap<>();

    public ColorTest(){
        colorMap.put("Black", Color.BLACK);
        colorMap.put("Blue", Color.BLUE);
        colorMap.put("Red", Color.RED);
        colorMap.put("Green", Color.GREEN);
        colorMap.put("Gray", Color.GRAY);
        colorMap.put("Yellow", Color.YELLOW);
        colorMap.put("Cyan", Color.CYAN);
        colorMap.put("Magenta", Color.MAGENTA);
        colorMap.put("White", Color.WHITE);
        colorMap.put("Orange", Color.ORANGE);
        colorMap.put("Pink", Color.PINK);
        colorMap.put("Dark Gray", Color.DARK_GRAY);
        colorMap.put("Light Gray", Color.LIGHT_GRAY);


    }


    public String getName(Color color){
        return color.getClass().getName();
    }

    public HashMap<String,Color> getAllColors(){
        return colorMap;

    }

}
