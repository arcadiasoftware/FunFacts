package software.arcadia.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by ${user} on ${date}
 */
public class ColorWheel {
    // Fields or member variables - properties about the object.
    String[] colorsArray = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };
    // Methods - actions the object can take.
    int getColor() {
        /*
         Randomly select a fact.
        */
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(colorsArray.length);
        int color = Color.parseColor(colorsArray[randomNumber]);
        return color;
    }
}
