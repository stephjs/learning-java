import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author stephanieorpilla
 */
public class UseBoat {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Boat> allBoats = new ArrayList();
        List<String> boatNames = new ArrayList();
        String filename = "boats.txt";
        String singleBoat = null;
        try {
            FileReader fileReader =  new FileReader(filename);
            BufferedReader bufferedReader =  new BufferedReader(fileReader);
            while((singleBoat = bufferedReader.readLine()) != null) {
                Boat newBoat = new Boat(singleBoat);
                allBoats.add(newBoat);
                boatNames.add(newBoat.name);
            }
            bufferedReader.close();
        } catch(FileNotFoundException e) {
            System.out.println("File: "+filename+" not found.");
            return;
        } catch(IOException ex) {
            System.out.println("Cannot read file: "+filename+".");
        }
        System.out.println("Enter boat name and command (BoatName, Command) or 'quit'");
        System.out.println("Boat names: "+ boatNames);
        System.out.println("Commands: power on, power off, speed up, slow down, turn left, turn right");
        Scanner keyboard = new Scanner(System.in);
        while (keyboard.hasNextLine()) {
            String input = keyboard.nextLine();
            if (input.equalsIgnoreCase("quit")) {
                break;
            } else {
                List<String> inputs = Arrays.asList(input.split("\\s*,\\s*"));
                
                if (inputs.size() != 2) {
                    System.out.println("Invalid format. Please enter 'BoatName, Command'");
                    continue;
                }
                Boat currBoat = allBoats.get(0);
                boolean found = false;
                for (Boat b : allBoats) {
                    if (b.name.equalsIgnoreCase(inputs.get(0))) {
                        found = true;
                        currBoat = b;
                    }
                }
                if (!found) {
                    System.out.println("Boat '"+inputs.get(0)+"' does not exist.");
                    continue;
                } else {
                    String currCommand = inputs.get(1);
                
                    switch (currCommand) {
                        case "power on":
                            currBoat.togglePower("on");
                            break;
                        case "power off":
                            currBoat.togglePower("off");
                            break;
                        case "speed up":
                            currBoat.changeSpeed("speed up");
                            break;
                        case "slow down":
                            currBoat.changeSpeed("slow down");
                            break;
                        case "turn left":
                            currBoat.turnBoat("left");
                            break;
                        case "turn right":
                            currBoat.turnBoat("right");
                            break;
                        default :
                            System.out.println("Sorry, the command '"+currCommand+"' doesn't exist.");
                            break;
                    }
                }
            }
        }
    }
}
