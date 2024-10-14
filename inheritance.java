public class inheritance {
    int a;
     void display() {
        System.out.println("Mikey is Good");
    }
}
class inh extends inheritance {
        int b;
    void display2() {
            System.out.println("This is second one!");
        }
}
class in extends inh {
    int c=40;
    void Displayfinal() {
        this.c=c;
        System.out.println(""+c);
    }
    }
class inheri {
    public static void main(String[] args) {
        in ob1=new in();
        ob1.display();
        ob1.display2();
        ob1.Displayfinal();
    }
}
