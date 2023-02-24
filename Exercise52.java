import java.util.Scanner;

public class Exercise52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sum number : ");
        int sum = input.nextInt();
        
        for (int i = 1; i <= 100; i++){
            if(i % sum ==0){
                System.out.println(i+"is divisible by"+sum);
            }
        }
        System.out.println("end");
    }
}
