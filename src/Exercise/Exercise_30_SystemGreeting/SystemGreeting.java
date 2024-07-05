package Exercise.Exercise_30_SystemGreeting;

import java.util.Scanner;

public class SystemGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();
        System.out.printf("Xin chào %s", name);
    }
}
