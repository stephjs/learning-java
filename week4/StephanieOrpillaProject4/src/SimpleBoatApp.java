/**
 * @author stephanieorpilla
 */
public class SimpleBoatApp {

    public static void main(String[] args) {
        Boat simpleBoat = new Boat("Destinty");
        simpleBoat.goFast();   
        simpleBoat.goSlow();
        simpleBoat.whereIsTheSail();
        simpleBoat.goFast();
        simpleBoat.whereIsTheSail();
        simpleBoat.goFast();
    }
    
}
