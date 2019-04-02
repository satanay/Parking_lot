package parking_lot;

import java.util.Scanner;

public class Visitor extends Customer {

    int entering_hour;
    int leaving_hour;
    int total_cost;

    Visitor() {

    }

    protected void payment() {
        this.total_cost = (leaving_hour - entering_hour) * 500;
        System.out.print(total_cost);
    }

    @Override
    void showMenu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Welcome Visitor");
        System.out.println("\n");
        System.out.println("------------------------------");
        System.out.println("Please Enter Your Name:");
        Scanner s = new Scanner(System.in);
        super.name = s.next();
        System.out.println("\n");
        System.out.println("------------------------------");
        System.out.println("Please Enter Your Car Number:");
        Scanner n = new Scanner(System.in);
        super.number = n.next();
        System.out.println("\n");
        System.out.println("*********************************************************************** ");
        System.out.println("A. Entering Hour");
        System.out.println("B. Leaving Hour");
        System.out.println("C. Total cost");
        System.out.println("D. Exit");

        do {

            System.out.println("*********************************************************************** ");
            System.out.println("Enter an option");
            System.out.println("*********************************************************************** ");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 'A':
                    System.out.println("------------------------------");
                    System.out.println("Enter Your Visit Beginning Hour");
                    System.out.println("------------------------------");
                    this.entering_hour = scanner.nextInt();
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("------------------------------");
                    System.out.println("Enter Your Visit Ending Hour");
                    System.out.println("------------------------------");
                    this.leaving_hour = scanner.nextInt();
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("------------------------------");
                    System.out.println("The Total Cost For Your Visit:");
                    System.out.println("------------------------------");
                    payment();
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("***********************************************************");
                    break;

                default:
                    System.out.println("Invaild option!!.please enter again");
                    break;
            }

        } while (option != 'D');

        System.out.println("Thank you for your visit");
    }

    public String toString() {
        return name + " " + number + " " + entering_hour + " " + leaving_hour + " " + total_cost + " ";
    }
}
