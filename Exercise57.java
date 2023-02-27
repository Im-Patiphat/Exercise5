import java.util.Scanner;

public class Exercise57 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter normal working hours : ");
        double work = input.nextDouble();
        System.out.print("Enter OT working hours : ");
        double OT = input.nextDouble();
        System.out.print("Enter hourly wage rate : ");
        double rate = input.nextDouble();
        double pay = work * rate;
        double rateOT = rate * 1.5;
        double payOT = OT * rateOT;
        System.out.println("Regular wages is " + pay + "bath");
        System.out.println("Overtime wages is " + payOT + "bath");
        System.out.println("You get " + (pay + payOT) + "baht");
    }
}
