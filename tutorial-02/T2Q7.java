import java.util.Scanner;

public class T2Q7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value in inch: ");
        double inches = scanner.nextDouble();
        double meters = inches * 0.0254;
        System.out.printf("%.2f inches = %.2f meters\n", inches, meters);

        scanner.close();
    }
}