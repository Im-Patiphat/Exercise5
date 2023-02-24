import java.util.Scanner;

public class Exercise53 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter radius :");
        int radius = input.nextInt();
        System.out.print("Enter height :");
        int height = input.nextInt();
        double volume = (3.14*(radius * radius)*height);
        System.out.print("volume is "+volume);
    }
}
