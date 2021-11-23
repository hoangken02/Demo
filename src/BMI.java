import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight;
        double height;
        double bmi;

        System.out.println("Input your weight: ");
        weight = scanner.nextDouble();

        System.out.println("Input your height: ");
        height = scanner.nextDouble();

        bmi = weight / (height * height);

        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 15) {
            System.out.println("Underweight");
        } else if (bmi < 25){
            System.out.println("Normal");
        }else if (bmi < 30){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }

    }
}
