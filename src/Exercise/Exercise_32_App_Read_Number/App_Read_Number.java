package Exercise.Exercise_32_App_Read_Number;

import java.util.Scanner;

public class App_Read_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, ones, tens;
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        ones = 20 - number;
        tens = number / 10;
        switch (number){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
        }
        switch (ones){
            case 1:
                System.out.println("Nineteen");
                break;
            case 2:
                System.out.println("Eighteen");
                break;
            case 3:
                System.out.println("Seventeen");
                break;
            case 4:
                System.out.println("Sixteen");
                break;
            case 5:
                System.out.println("Fifteen");
                break;
            case 6:
                System.out.println("Fourteen");
                break;
            case 7:
                System.out.println("Thirteen");
                break;
            case 8:
                System.out.println("Twelfth");
                break;
            case 9:
                System.out.println("Eleven");
                break;
            case 10:
                System.out.println("Ten");
        }
        switch (tens){
            case 2:
                System.out.println("Twenty");
                break;
            case 3:
                System.out.println("Thirty");
                break;
            case 4:
                System.out.println("Forty");
                break;
            case 5:
                System.out.println("Fifty");
                break;
            case 6:
                System.out.println("Sixty");
                break;
            case 7:
                System.out.println("Seventy");
                break;
            case 8:
                System.out.println("Eighty");
                break;
            case 9:
                System.out.println("Ninety");
                break;
        }
    }
}
