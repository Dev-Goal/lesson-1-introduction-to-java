package Practice.Practice_28_Check_Leap_Year;

import java.util.Scanner;

public class Check_Leap_Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.print("Nhập năm: ");
        year = scanner.nextInt();

//        if(year % 4 == 0){
//            if(year % 100 == 0){
//                if(year % 400 == 0){
//                    System.out.printf("%d là năm nhuận", year);
//                }else{
//                    System.out.printf("%d không phải là năm nhuận", year);
//                }
//            }else{
//                System.out.printf("%d là năm nhuận", year);
//            }
//        }else{
//            System.out.printf("%d không phải là năm nhuận", year);
//        }

        boolean isLeapYear = false;
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isLeapYear = true;
                }
            }else{
                isLeapYear = true;
            }
        }
        if(isLeapYear){
            System.out.printf("%d là năm nhuận", year);
        }else{
            System.out.printf("%d không phải là năm nhuận", year);
        }
    }
}
