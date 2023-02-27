
import java.time.LocalDate;
import java.util.Scanner;

public class Exercise59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = input.nextLine();

        int BY;
        do {
            System.out.print("Enter you BirthYear (A.D.) : ");
            BY = input.nextInt();
            if (BY >= LocalDate.now().getYear())
                ;
            {
                System.out.println("fall, Enter agin");
            }
        } while (BY >= LocalDate.now().getYear() + 543);
        int age = (LocalDate.now().getYear()) - BY;
        System.out.println(name + " your are " + age + " years old");
        int gender;
        System.out.println("Select product type:");
        System.out.println("1. Male");
        System.out.println("2. Female");

        gender = input.nextInt();
        switch (gender) {
            case 1:

                System.out.println("Mr." + name + " is " + age + " years old");
                break;
            case 2:
                System.out.println("Ms." + name + " is " + age + " years old");
                break;
        }
    }
}
