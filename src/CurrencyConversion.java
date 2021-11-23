import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What kind of money transfer do you want?");
        System.out.println("1. USD to VND");
        System.out.println("2. VND to USD");
        int type = scanner.nextInt();

        System.out.println("Input the money: ");
        double rate = scanner.nextDouble();

        switch(type){
            case 1:
                rate *= 23000;
                System.out.println("You have: " + rate + "VND");
                break;
            case 2:
                rate /= 23000;
                System.out.println("You have: " + rate + "USD");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
