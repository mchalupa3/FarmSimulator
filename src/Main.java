import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userinput;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Welcome to our farming game");
        System.out.println("To buy your first tractor and plot of land type Shop");
        userinput = Sc.nextLine();

        if (userinput.toLowerCase().equals("shop")) {
            Shop tpShop = new Shop();
            tpShop.tpShop();
        }


    }
}