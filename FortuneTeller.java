import java.util.Random;

public class FortuneTeller {
    public static void main(String a[]) {
        int opt = (int) (Math.random() * (11 - 1 + 1) + 1);

        switch (opt) {
            case 1:
                System.out.println("You are going to do good today!");
                break;
            case 2:
                System.out.println("Some problems gonna happen..");
                break;
            case 3:
                System.out.println("You're luckyy :>");
                break;
            case 4:
                System.out.println("You will be a millionare!!");
                break;
            case 5:
                System.out.println("You will be sad today :(");
                break;
            case 6:
                System.out.println("You could buy a new supercar");
                break;
            case 7:
                System.out.println("You will loose your pen");
                break;
            case 8:
                System.out.println("You will get to meet a famous celebrity");
                break;
            case 9:
                System.out.println("You will pass you examss!!");
                break;

            default:
                break;
        }
    }
}