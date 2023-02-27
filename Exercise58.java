import java.util.Scanner;

public class Exercise58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int i = 100; i <= 999; i++) {
            if (i % 5 == 0 || i % 11 == 0) {
                if (i % 55 != 0) {
                    System.out.println(i + " ,");
                }

            }

        }
    }
}
