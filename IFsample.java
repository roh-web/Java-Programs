import java.util.Scanner;
class main {
    public static void main(String ar[]) {
        System.out.println ("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if( num<0){
            System.out.println("This Number is Negative");
        }else {
            System.out.println("This Number is Possitive");
        }
    }
}