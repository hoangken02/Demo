import java.sql.SQLOutput;
import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("In put here: ");

        System.out.println("In put width:");
        width = scanner.nextFloat();

        System.out.println("In put height:");
        height = scanner.nextFloat();

        float area = width * height;
        System.out.println(" Area: " + area);

    }
}
