# Week 7

In this project, define a customer class similar to what you defined for project 5 and 6.  A Customer has a first name, last name, and social security number. Define the Customer constructor so it will initialized those attributes.  Define an exception class called "InvalidCustomerException".  Update the Customer constructor to throw an exception when an invalid Social Security Number is passed to the constructor. Update the main method with a try/catch block to catch the exception and call the getMessage() method in the catch block.

InvalidCustomerException class should override the getMessage() method to return a string such as “Invalid SSN 5438-98-9876”.