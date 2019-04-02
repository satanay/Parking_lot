package parking_lot;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Tenant extends Customer {

    int ID;
    int rent;
    int Park;

    @Override
    void showMenu() {
        System.out.println("\n");
        System.out.println("Welcome Tenant");
        System.out.println("\n");
        System.out.println("------------------------------");

        System.out.println("Please Enter Your ID:");
        Scanner n = new Scanner(System.in);
        this.ID = n.nextInt();
        System.out.println("\n");
        InputStream Tenant = null;
        try {
            Tenant = new FileInputStream("Tenant.txt");
            Scanner t = new Scanner(Tenant);
            do {
                String str = t.nextLine();
                if (t.nextInt() == ID) {
                    System.out.println("--------------------------------------------");
                    System.out.println(str);
                    System.out.println("--------------------------------------------");
                    System.out.println("Thank You For Your Trust");
                }
            } while (t.hasNextLine());
            t.close();

        } catch (Exception e) {
            System.out.println("");
        }
    }
}
