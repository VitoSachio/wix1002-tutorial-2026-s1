void main() {

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the diameter of the circle: ");
        double diameter = input.nextDouble();
        double circumference = Math.PI * diameter;
        System.out.printf("The circumference of the circle is %.3f\n", circumference);
        input.close();

    }