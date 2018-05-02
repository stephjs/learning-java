# Week 4

Write a Java application that defines a class Boat. The Boat class should provide three fields/attributes: 1) name is a variable of type String, 2) sail position is a variable of type boolean, 3) speed is a variable of type float.

The Boat class must define a constructor and three methods: goFast, goSlow, whereIsTheSail.

goFast sets the position of the sail to true and increase the speed of the boat by 10 mph and prints the following text (BlueSea is the boat name):

BlueSea is raising the sail at the speed of 10 mph.

 

goSlow sets the position of the sail to false and decreases the speed of the boat by 5 mph and prints the following text:

BlueSea is lowering the sail at the speed of 5 mph.

 

whereIsTheSail prints the name of the boat and “sail is up” or “sail is down” depending on the sail position:

BlueSea sail is up.

 

Note: The boat speed should not exceed 100 mph (max speed is 100 mph) and cannot go below 0 mph.  

 

Start out by writing a Java class Boat. Provide the methods described above. Create the main class (call it SimpleBoatMain) with a static main method (example provided below). Inside the main method create a new instance of class Boat and then invoke the proper methods as shown below:

 

public class SimpleBoatApp {

    public static void main (String[] args) {

        Boat simpleBoat = new Boat("Destinty");

        simpleBoat.goFast();   

        simpleBoat.goSlow();

        simpleBoat.whereIsTheSail();

        simpleBoat.goFast();

        simpleBoat.whereIsTheSail();

        simpleBoat.goFast();

    }

}