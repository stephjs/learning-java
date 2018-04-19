/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentGrade;

/**
 *
 * @author stephanieorpilla
 */
public class StudentGrade {
    public static void main(String[] args) {
        int numberOfGrades = 5;
        for (int i = 0; i < numberOfGrades+1; i++) {
            int randomGrade = (int)(Math.random() * 50) + 50;
            char studentLetterGrade;
            if (randomGrade < 60) {
                studentLetterGrade = 'F';
            } else if (randomGrade < 70) {
                studentLetterGrade = 'D';
            }  else if (randomGrade < 80) {
                studentLetterGrade = 'C';
            } else if (randomGrade < 90) {
                studentLetterGrade = 'B';
            } else {
                studentLetterGrade = 'A';
            }
            System.out.println("Student grade is "+randomGrade+" which is "+studentLetterGrade+".");
        }
    }
}
