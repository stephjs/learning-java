/**
 *
 * @author stephanieorpilla
 */
public class Boat {
    String name;
    int speed;
    int angle;
    boolean power;
    
    Boat(String name) {
        this.name = name;
        this.speed = 0;
        this.angle = 0;
        this.power = false;
    }
    
    private void printStatus() {
        
        String moving;
        String speedstr = "";
        if (speed > 0) {
            moving = "moving ";
            speedstr =  " at the speed of "+speed+" mph";
        } else {
            moving = "parked ";
        }
        System.out.println(name+" is "+moving+"at a "+angle+" deg angle"+speedstr+".");
    }
    
    public void togglePower(String pStatus) {
        if (pStatus.equalsIgnoreCase("on")) {
            if (power) {
                System.out.println(name+" is already on.");
                return;
            } else {
                power = !power;
                printStatus();
                return;
            }
        } else {
            if (!power) {
                System.out.println(name+" is already off.");
                return;
            } else {
                power = !power;
                System.out.println(name+" is powered off.");
                return;
            }
        }
    }
    
    public void changeSpeed(String direction) {
        if (power) {
            int minspeed = 0;
            int speedDiff = 2;
            if (direction.equalsIgnoreCase("Speed Up")) {
                speed += speedDiff;
            } else {
                if (speed - speedDiff < minspeed) {
                    System.out.println(name+" is parked at "+minspeed+" mph.");
                    return;
                } else {
                    speed -= speedDiff;
                }
            }
            printStatus();
        } else {
            System.out.println(name+" is not powered on.");
        }
    }
    
    public void turnBoat(String direction) {
        if (power) {
            int degs = 5;
            int mindegs = 0;
            int maxdegs = 360;
            if (direction.equalsIgnoreCase("right")) {
                if (angle + degs >= maxdegs) {
                    angle = maxdegs - angle - degs;
                } else {
                    angle += degs;
                }
            } else {
                if (angle - degs < mindegs) {
                    angle = maxdegs - angle - degs;
                } else {
                    angle -= degs;
                }
            }
            printStatus();
        } else {
            System.out.println(name+" is not powered on.");
        }
    }
}
