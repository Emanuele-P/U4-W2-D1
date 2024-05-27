package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the km driven: ");
            double inputKm = sc.nextDouble();

            System.out.println("Enter the liters of fuel consumed: ");
            double inputL = sc.nextDouble();

            if (inputL == 0) {
                throw new ArithmeticException("Error: Division by zero");
            }

            double kmPerLiter = inputKm / inputL;
            System.out.println("The car's fuel efficiency is: " + kmPerLiter + " km/l");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
        sc.close();
    }
}
