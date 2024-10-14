public class InterfaceIsSimple {

    public static void main(String args[]) {
        Intersimple is = new Intersimple();
        System.out.println(is.n);
        is.print();
    }
}

interface Inter {

    String NAME = "Rohith"; // compiler : public static final String NAME = "Rohith";
    int AGE = 20; // compiler : public static final int AGE = 20;

    public void print();
}

/*
 * interface bottle extends Inter{ 
 * public void fillBottle(); 
 * }
 */
interface ENEMY extends Inter{
    class Enemy {
        public void attack() {
            System.out.println("HAHAHAH , Im an enemy!");
        }
    }
}

class Intersimple implements Inter {

    // @Override
    String n = Inter.NAME;
    public void print() {
        System.out.println("hello!");
    }
}
