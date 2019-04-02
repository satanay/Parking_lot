package parking_lot;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Parking_Lot {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        System.out.println("WELCOME");
        System.out.println("\n");
        System.out.println("*********************************************************************** ");
        System.out.println("A I AM A TENANT");
        System.out.println("B I AM A VISITOR");
        System.out.println("\n");
        System.out.println("*********************************************************************** ");
        System.out.println("Enter an option :");
        System.out.println("*********************************************************************** ");

        Scanner op = new Scanner(System.in);
        char option = '\0';
        option = op.next().charAt(0);
        switch (option) {
            case 'A':
                Tenant tt = new Tenant();
                tt.showMenu();
                break;
            case 'B':

                FileWriter fv = null;
                try {
                    fv = new FileWriter("visitor.txt", true);
                    Visitor v = new Visitor();
                    v.showMenu();
                    String a = v.toString();
                    fv.write(a);
                } catch (Exception e) {
                    System.out.println("file not found");
                } finally {
                    fv.close();
                }
                break;
            default:
                System.out.println("Invaild option!!.please enter again");
                break;

        }
        System.out.println("\n");
    }
}
