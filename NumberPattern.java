import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int coloumn, row;
        System.out.println("How much number of rows you want?");
        row = scan.nextInt();
        for (int i = 0; i < row; i++) {
            for (coloumn = 0; coloumn <= i; coloumn++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }
}
