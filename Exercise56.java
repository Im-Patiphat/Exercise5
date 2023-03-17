import java.util.Scanner;

public class Exercise56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int selection;
        System.out.print("Enter volume of water used(liter) : ");
        float water = input.nextFloat();
        System.out.println("Select product type:");
        System.out.println("1. general customer");
        System.out.println("2. commercial customers");

        selection = input.nextInt();
        switch (selection) {
            case 1:
                System.out.println("You general customer");
                System.out.println("you pay " + (100 + (water * 0.5)));
                break;
            case 2:
                System.out.println("You commercial customers");
                System.out.println("you pay " + (100 + (water * 0.9)));
                break;
        }
        

    }
}   

