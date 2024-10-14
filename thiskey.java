public class thiskey {
    public static void main(String args[]) {
        SamKey ob1 = new SamKey();

        ob1.samKey();
    }
}

class SamKey {
    int a = 20, b = 30;

    public void samKey() {      
       // this.a = a;
        this.b=210;
        int sum = a+b;
        System.out.println("Result : "+sum);
        }
    }