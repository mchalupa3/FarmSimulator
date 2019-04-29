import java.util.Scanner;

public class Shop {

    public void tpShop() {

        Scanner Sc = new Scanner(System.in);
        String userinput;

        int plot = 50;
        int sTractor = 50;
        int mTractor = 100;
        int bTractor = 150;
        int lTractor = 200;

        do {
            System.out.println("Welcome to the shop!");
            System.out.println("If you have just started buy a plot and a tractor with your money");
            System.out.println("Your current amount of money is : " + Inventory.sum);
            System.out.println("What would you like to buy? Tractors or Plots?");
            userinput = Sc.nextLine();


            if (userinput.toLowerCase().equals("tractors")) {
                System.out.println("The selection of tractors are: Small(50), Medium(100), Big(150), or Large(200)");
                userinput = Sc.nextLine();
            }if (userinput.toLowerCase().equals("small") && Inventory.sum > 50) {
                System.out.println("You have successfully bought a Small tractor");
                Inventory.sum = Inventory.sum - sTractor;
            } else if (userinput.toLowerCase().equals("medium") && Inventory.sum > 100) {
                System.out.println("You have successfully bought a Medium tractor");
                Inventory.sum = Inventory.sum - mTractor;
            } else if (userinput.toLowerCase().equals("big") && Inventory.sum > 150) {
                System.out.println("You have successfully bought a Big tractor");
                Inventory.sum = Inventory.sum - bTractor;
            } else if (userinput.toLowerCase().equals("large") && Inventory.sum > 200) {
                System.out.println("You have successfully bought a Large tractor");
                Inventory.sum = Inventory.sum - lTractor;
            } else if (userinput.toLowerCase().equals("small") && Inventory.sum < 50) {
                System.out.println("You cannot afford a small tractor");
            } else if (userinput.toLowerCase().equals("medium") && Inventory.sum < 100) {
                System.out.println("You cannot afford a medium tractor");
            } else if (userinput.toLowerCase().equals("big") && Inventory.sum < 150) {
                System.out.println("You cannot afford a big tractor");
            } else if (userinput.toLowerCase().equals("large") && Inventory.sum < 200) {
                System.out.println("You cannot afford a large tractor");
            }


            if (userinput.toLowerCase().equals("plots")) {
                System.out.print("How many plots would you like to buy? Each plot is 50 each.");
                userinput = Sc.nextLine();
            }
            if (userinput.toLowerCase().equals("one") && Inventory.sum > 50) {
                System.out.println("You have successfully bought a plot");
                Inventory.sum = Inventory.sum - plot;
            } else if (userinput.toLowerCase().equals("two") && Inventory.sum > 100) {
                System.out.println("You have successfully bought 2 plots");
                Inventory.sum = Inventory.sum - plot * 2;
            } else if (userinput.toLowerCase().equals("three") && Inventory.sum > 150) {
                System.out.println("You have successfully bought 3 plots");
                Inventory.sum = Inventory.sum - plot * 3;
            } else if (userinput.toLowerCase().equals("four") && Inventory.sum > 200) {
                System.out.println("You have successfully bought 4 plots");
                Inventory.sum = Inventory.sum - plot * 4;
            } else if (userinput.toLowerCase().equals("five") && Inventory.sum > 250) {
                System.out.println("You have successfully bought 5 plots");
                Inventory.sum = Inventory.sum - plot * 5;
            } else if (userinput.toLowerCase().equals("six") && Inventory.sum > 300) {
                System.out.println("You have successfully bought 6 plots");
                Inventory.sum = Inventory.sum - plot * 6;
            } else if (userinput.toLowerCase().equals("seven") && Inventory.sum > 350) {
                System.out.println("You have successfully bought 7 plots");
                Inventory.sum = Inventory.sum - plot * 7;
            } else if (userinput.toLowerCase().equals("eight") && Inventory.sum > 400) {
                System.out.println("You have successfully bought 8 plots");
                Inventory.sum = Inventory.sum - plot * 8;
            } else if (userinput.toLowerCase().equals("nine") && Inventory.sum > 450) {
                System.out.println("You have successfully bought 9 plots");
                Inventory.sum = Inventory.sum - plot * 9;
            } else if (userinput.toLowerCase().equals("one") && Inventory.sum < 50) {
                System.out.println("You cannot afford 1 plot!");
            } else if (userinput.toLowerCase().equals("two") && Inventory.sum < 100) {
                System.out.println("You cannot afford 2 plots!");
            } else if (userinput.toLowerCase().equals("three") && Inventory.sum < 150) {
                System.out.println("You cannot afford 3 plots!");
            } else if (userinput.toLowerCase().equals("four") && Inventory.sum < 200) {
                System.out.println("You cannot afford 4 plots!");
            } else if (userinput.toLowerCase().equals("five") && Inventory.sum < 250) {
                System.out.println("You cannot afford 5 plots!");
            } else if (userinput.toLowerCase().equals("six") && Inventory.sum < 300) {
                System.out.println("You cannot afford 6 plots!");
            } else if (userinput.toLowerCase().equals("seven") && Inventory.sum < 350) {
                System.out.println("You cannot afford 7 plots!");
            } else if (userinput.toLowerCase().equals("eight") && Inventory.sum < 400) {
                System.out.println("You cannot afford 8 plots!");
            } else if (userinput.toLowerCase().equals("nine") && Inventory.sum < 450) {
                System.out.println("You cannot afford 9 plots!");
            }


            System.out.println("Your amount of money is " + Inventory.sum);
            System.out.println("Would you like to continue shopping? (yes or no) ");
            userinput = Sc.nextLine();

        } while (userinput.toLowerCase().equals("yes"));

        System.out.println("Would you like to sell your products at the market?");
        userinput = Sc.nextLine();
        if (userinput.toLowerCase().equals("yes")) {
            Selling market = new Selling();
            market.market();
        }
    }
}




