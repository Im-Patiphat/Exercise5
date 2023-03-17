import java.util.Scanner;

public class Exercise510 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter width in area 1 : " );
        Double w1 = input.nextDouble();
        System.out.println("Enter long in area 1 : ");
        Double h1 = input.nextDouble();
        System.out.println("Enter width in area 2 : ");
        Double w2 = input.nextDouble();
        System.out.println("Enter long in area 2 : ");
        Double h2 = input.nextDouble();
        Double area1 = w1*h1;
        Double area2 = w2*h2;
        if(area1>area2){
            System.out.println("Area 1 is greater than Area 2");
            
        }else{
            System.out.println("Area 1 is less than Area 2");
        }
        System.out.println("Area 1 have "+area1);
        System.out.println("Area 2 have "+area2);
    }
}