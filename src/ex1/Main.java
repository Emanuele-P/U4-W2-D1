package ex1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numArray = new int[5];
        Random rdm = new Random();

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = rdm.nextInt(1, 10);
        }

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i]);
        }
        System.out.println("Please insert a number: ");
        int userNum = sc.nextInt();
        int position;

        while (true) {
            System.out.println("Enter the position of the number you want to replace (1-5) (0 to exit)");

            position = sc.nextInt();

            if (position == 0) {
                System.out.println("Exiting...");
                break;
            }

            try {
                if (position < 1 || position > 5) {
                    System.out.println("Invalid position. Please enter a position between 1 and 5 (0 to exit)");
                } else {
                    numArray[position - 1] = userNum;

                    System.out.println("Updated list of numbers:");
                    for (int i = 0; i < numArray.length; i++) {
                        System.out.println(numArray[i]);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }

        sc.close();
    }
}