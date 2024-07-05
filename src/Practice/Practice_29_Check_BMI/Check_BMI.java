package Practice.Practice_29_Check_BMI;

import java.util.Scanner;

public class Check_BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Nhập vào cân nặng: ");
        weight = scanner.nextDouble();
        System.out.print("Nhập vào chiều cao: ");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);

        if(bmi < 18.5){
            System.out.print("BMI: " + bmi + " Underweight");
        }else if(bmi < 25.0){
            System.out.print("BMI: " + bmi + " Normal");
        }else if(bmi < 30.0){
            System.out.print("BMI: " + bmi + " Overweight");
        }else{
            System.out.print("BMI: " + bmi + " Obese");
        }
    }
}
