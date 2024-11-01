/*
 * Name: Joseph Wang and Sean Wu
 * Date: Oct 25
 * Description: The background for the first scene
 */

import graphics.*;

public class Bg1 {
    Assets a = new Assets();

    public void background(){

        
        // Runway
        a.runway();

        // Sky and ground
        a.sky_ground();

        // Tower
        a.cTower();
        Text greeting = new Text(600,475, "Joseph Wang and Sean Wu");
        greeting.grow(120, 20); 
        greeting.draw();
    }

}
