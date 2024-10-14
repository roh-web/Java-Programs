import java.util.Scanner;

public class SquareFinder {
    public static void main(String args[]){
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        num = scan.nextInt();
        int sqaureOfTheNumber = num * num;
        System.out.println("The square is : "+sqaureOfTheNumber);
        scan.close();
    }
}
