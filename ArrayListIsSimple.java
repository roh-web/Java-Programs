import java.util.ArrayList;

public class ArrayListIsSimple {
    public static void main(String[] args){
    ArrayList<String> cars = new ArrayList<String>();

    cars.add("Ferrari");
    cars.add("Lambo");
    cars.add("Ford");
    cars.add("Mustang");

    System.out.println("First :"+cars);
    cars.remove("Ford");
    System.out.println("Second :"+cars);
    cars.clear();
    System.out.println("Final OutPut :"+cars);
    }
}