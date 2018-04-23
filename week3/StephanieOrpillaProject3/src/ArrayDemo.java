/**
 *
 * @author stephanieorpilla
 */
import java.util.*;
public class ArrayDemo {
    public static void main(String[] args) {
        int numberOfUserValues = 5;
        int[]userValues = new int[numberOfUserValues];
        Scanner userInput = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("You will be asked to input "+numberOfUserValues+" integers.");
        System.out.println("--------------------------------------");
        for (int i=0; i<userValues.length; i++) {
            int currentNumber = i + 1;
            System.out.println(" >> Please enter integer #"+currentNumber);
            userValues[i] = userInput.nextInt();
        }
        
        System.out.println("Results-------------------------------");
        System.out.println("User Inputs: "+Arrays.toString(userValues));
        System.out.println("Average: "+ getAverage(userValues));
        System.out.println("Minimum: "+ getSmallest(userValues));
        System.out.println("Maximum: "+ getLargest(userValues));
        System.out.println("--------------------------------------");
    }
    
    static float getAverage(int[] data) {
        float sum = 0;
        for (int el : data) {
            sum = sum + el;
        }
        return sum/data.length;
    }
    
    static int getLargest(int[] data) {
        int largest = data[0];
        for (int el : data) {
            if (el > largest) {
                largest = el;
            }
        }
        return largest;
    }
    
    static int getSmallest(int[] data) {
        int smallest = data[0];
        for (int el : data) {
            if (el < smallest) {
                smallest = el;
            }
        }
        return smallest;
    }
}
