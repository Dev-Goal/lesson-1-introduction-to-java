package Exercise.Exercise_31_App_Convert_Money;

import java.util.Scanner;

public class App_Convert_Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyVND, moneyUSD;
        int rate = 23000;
        System.out.print("Nhập giá tiền USD: ");
        moneyUSD = scanner.nextDouble();
        moneyVND = moneyUSD * rate;
        System.out.printf("%s USD có mệnh giá tương đương %s VND", moneyUSD, moneyVND);
    }
}
