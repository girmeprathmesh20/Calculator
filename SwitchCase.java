package com.project;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[10];
        double[] marks = new double[10];
        char[] grades = new char[10];

       
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter Student " + (i + 1) + " Name:");
            names[i] = scanner.nextLine();

            System.out.println("Enter Student " + (i + 1) + " Marks:");
            marks[i] = scanner.nextDouble();

           
            scanner.nextLine();
        }

       
        for (int i = 0; i < 10; i++) {
            switch ((int) marks[i] / 10) {
                case 9:
                case 10:
                    grades[i] = 'A';
                    break;
                case 8:
                    grades[i] = 'B';
                    break;
                case 7:
                    grades[i] = 'C';
                    break;
                case 6:
                    grades[i] = 'D';
                    break;
                case 5:
                    grades[i] = 'E';
                    break;
                default:
                    grades[i] = 'F';
            }
        }

       
        System.out.println("Student Details:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Student " + (i + 1) + " Name: " + names[i]);
            System.out.println("Marks: " + marks[i]);
            System.out.println("Grade: " + grades[i]);
        }

        
        scanner.close();
    }
}