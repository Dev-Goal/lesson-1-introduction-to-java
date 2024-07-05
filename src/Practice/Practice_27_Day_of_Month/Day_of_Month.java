package Practice.Practice_27_Day_of_Month;

import java.util.Scanner;

public class Day_of_Month {
    public static void main(String[] args) {
        int month;
        String dayInMonth;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tháng: ");
        month = scanner.nextInt();
        dayInMonth = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> "31";
            case 4, 6, 9, 11 -> "30";
            case 2 -> "28 hoặc 29";
            default -> "";
        };
        if(!dayInMonth.isEmpty()){
            System.out.printf("Tháng %d có %s ngày", month, dayInMonth);
        }else{
            System.out.print("Vui lòng nhập tháng");
        }
    }
}
