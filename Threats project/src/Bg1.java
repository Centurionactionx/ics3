/*
 * Name: Joseph Wang and Sean Wu
 * Date: Oct 25
 * Description: The background for the first scene
 */

public class Bg1 {
    Assets a = new Assets();

    public void background(){
        // Runway
        a.runway();

        // Sky and ground
        a.sky_ground();

        // Tower
        a.cTower();
    }
}
