import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("x = ");
            double x = input.nextDouble();

            System.out.println("y = ");
            double y = input.nextDouble();

            double z = (double)Math.pow(x, y);
            // z = Math.pow(x, y);

            System.out.println("z is" +z);
        }

    }
}
