import java.util.Scanner;

public class Exercise55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number(1)");
        int x = input.nextInt();
        System.out.print("Enter number(2)");
        int y= input.nextInt();
        System.out.print("Enter number(3)");
        int z = input.nextInt();
        int max = 0;
        if(x>y){
            if (x>z){
                System.out.println(x + " is greater than " + y + " but" + x + " is less than " + z);
            }
            else{
                System.out.println(x + " is greater than " + y + " and " + z);
            }
        }
        else {
            System.out.println(x +" is less then " +2);
        }

    }
}
