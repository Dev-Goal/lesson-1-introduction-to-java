package Practice.Practice_25_Use_Operator;

import java.util.Scanner;

public class UseOperator {
    public static void main(String[] args) {
        float width;
        float height;
        float area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chiều rộng: ");
        width = scanner.nextFloat();
        System.out.println("Chiều dài: ");
        height = scanner.nextFloat();
        area = width * height;
        System.out.println("Diện tích HCN: " + area);
    }
}
