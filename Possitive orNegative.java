import java.util.Scanner;

public class ReeIsADummy {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        long b;
        System.out.println("Enter A Number");

        b = a.nextInt();
        a.close();
        if (b > 0) {
            System.out.println("The number is possitive");
        } else if (b == 0) {
            System.out.println("The number is neither possitive nor negative");
        } else {
            System.out.println("The number is negative");
        }
    }
}
