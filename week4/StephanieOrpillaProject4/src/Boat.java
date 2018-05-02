/*
 * @author stephanieorpilla
 */
public class Boat {
    private String name;
    private float speed;
    private float minSpeed = 0;
    private float maxSpeed = 100;
    private boolean sailPosition;
    
    Boat(String name) {
        this.name = name;
        speed = 0;
    }
    void goFast() {
        sailPosition = true;
        if (speed + 10 < maxSpeed) {
            speed = speed + 10;
            System.out.println(name+" is raising the sail at the speed of "+ Math.round(speed) +" mph.");
        } else {
            speed = maxSpeed;
            System.out.println(name+" is raising the sail and has reached the max speed of "+ Math.round(speed) +" mph.");
        }
    }
    
    void goSlow() {
        sailPosition = false;
        if (speed - 5 > minSpeed ) {
            speed = speed - 5;
            System.out.println(name+" is lowering the sail at the speed of "+ Math.round(speed) +" mph.");
        } else {
            speed = minSpeed;
            System.out.println(name+" is lowering the sail and has reached the min speed of "+ Math.round(speed) +" mph.");
        }
    }
    
    void whereIsTheSail() {
        String position;
        if (sailPosition) {
            position = "up";
        } else {
            position = "down";
        }
        System.out.println(name + " sail is "+position);
    }
}
