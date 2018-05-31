# Week 8

In this project, you will create a Boat application.  Each Boat has the following attributes: name, speed, angle, and power. The Boat names should be read from a text file “boats.txt”. You can assume there will be a maximum of 100 boats in the file. For testing, use the following boat names in the boats.txt file:

Sea Monkey

Backdraft

Cast Away

Nautifish

Destiny

The application should be able to accept commands from the user.  The user has to provide the commands in the following format:

<Boat name>, <command>

Example:

Sea Monkey, power on

Sea Monkey, turn left

Sea Monkey, speed up

 

The acceptable commands are the following (Any other command should be considered invalid):

Command

Description

power on

power up the boat

power off

power off the boat

speed up

increases the boat speed by the minimum speed increment 2 mph

slow down

decreases the boat speed by the minimum speed decrement 2 mph

turn left

turns the boat to the left by the minimum left turn degree 5 deg

turn right

turns the boat to the right by the minimum right turn degree 5 deg

 

After each command is entered and executed, the state of the boat should be displayed. For Example:

User Enters>> Sea Monkey, power on

Program output>> Sea Monkey is pointing in the direction of 0 deg.

User Enters>> Sea Monkey, turn right

Program output>> Sea Monkey is in 5 deg angle.

User Enters>> Sea Monkey, speed up

Program output >> Sea Monkey is moving in 5 deg angle at the speed of 2 mph.

User Enters>> Sea Monkey, power off

Program output >> Sea Monkey is powered off.

 

Error checking:

If the user enters an invalid command, a message should be displayed that the command was invalid.

If the user enters a boat name that does not exist, a message should be displayed that the boat not does not exist.

If the user enters a command that is not in the correct format (boatname, command), a message should be displayed that the command format is invalid.