package edu.wctc.coffee;


import edu.wctc.coffee.addons.*;
import edu.wctc.coffee.beverages.*;

import java.util.Scanner;

public class Register {

    private Scanner keyboard;


    private int getBeverageChoice() {
        System.out.println();
        System.out.println("*** Choose Main Beverage ***");
        System.out.println("1. Dark Roast");
        System.out.println("2. House Blend");
        System.out.println("3. Decaf");
        System.out.println("4. Espresso");
        System.out.println("9. CLOSE REGISTER");
        System.out.print(">> ");

        return Integer.parseInt(keyboard.nextLine());
    }

    private int getAddonChoice() {
        System.out.println();
        System.out.println("*** Choose Add-ons ***");
        System.out.println("1. Mocha");
        System.out.println("2. Soy Milk");
        System.out.println("3. Whipped Cream");
        System.out.println("9. DONE");
        System.out.print(">> ");

        return Integer.parseInt(keyboard.nextLine());
    }

    public void takeOrders() {
        keyboard = new Scanner(System.in);

        int mainChoice = 0;
        do {
            mainChoice = getBeverageChoice();

            Beverage beverage = null;

            switch (mainChoice) {
                case 1:
                    beverage = new DarkRoast();
                    break;
                case 2:
                    beverage = new HouseBlend();
                    break;
                case 3:
                    beverage = new Decaf();
                    break;
                case 4:
                    beverage = new Espresso();
                    break;
            }

            if (beverage != null) {
                int extraChoice = 0;

                do {
                    extraChoice = getAddonChoice();

                    switch (extraChoice) {
                        case 1:
                            beverage = new Mocha(beverage);
                            break;
                        case 2:
                            beverage = new SoyMilk(beverage);
                            break;
                        case 3:
                            beverage = new WhippedCream(beverage);
                            break;
                    }

                } while (extraChoice != 9);

                System.out.printf("That will be $%.2f\n", beverage.getCost());
                System.out.println("Enjoy your " + beverage.getDescription());
            }

        } while (mainChoice != 9);
    }
}
