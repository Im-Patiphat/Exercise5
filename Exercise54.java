import java.util.Scanner;

public class Exercise54 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter call time : ");
        double time = input.nextInt();
        int pimn1 = 5;
        int pmin2 = 2;
        double a = 0;
        if(time<=2){
            a = time * pimn1;
        }
        else {
            a = 10 + (pmin2 * (time - 2));
        }
        System.out.println("call cost "+a + " baht");
    }
}
