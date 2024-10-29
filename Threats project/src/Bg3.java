/*
 * Name: Joseph Wang and Sean Wu
 * Date: Oct 25
 * Description: The background for the third scene
 */

public class Bg3 {
    Assets a = new Assets();

    public void background(){
        a.runway();
        a.sky_ground();
        a.sky.setColor(a.night);
        a.ground.setColor(a.dark_green);

        a.buildings();
    }
}
