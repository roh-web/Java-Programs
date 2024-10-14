import java.util.*;

public class ReverseProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String original, reverse = "";

        System.out.println("Enter a number");
        original = scan.nextLine();
        int length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println("Reverse is: " + reverse);

        scan.close();
    }
}


/*Process : "word" , 4 , i=3 ,reverse = d,i=2, reverse = dr ,i=1,reverse=dro,i=0,reverse=drow
 */
