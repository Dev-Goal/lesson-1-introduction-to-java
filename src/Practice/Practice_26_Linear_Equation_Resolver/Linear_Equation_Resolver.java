package Practice.Practice_26_Linear_Equation_Resolver;

import java.util.Scanner;

public class Linear_Equation_Resolver {
    public static void main(String[] args) {
        double a, b;
        System.out.println("Giải phương trình bậc nhất a*x + b = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        a = scanner.nextDouble();
        System.out.println("b: ");
        b = scanner.nextDouble();

        if( a == 0){
            if( b == 0){
                System.out.println("Phương trình vô số nghiệm");
            }else{
                System.out.println("Phương trình vô nghiệm");
            }
        }else{
            double c = -b / a;
            System.out.println("Phương trình có 1 nghiệm c = " + c);
        }
    }
}
