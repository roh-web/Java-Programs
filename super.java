class sup {
    int a=30;
    void display() {
        System.out.println("Helo!");
    }
}
class sup1 extends sup {
    int a=20;
    void display(){
        System.out.println("Yo!");
        System.out.println(""+a);
        super.display();
    }
    public static void main(String[] args){
        sup1 ob1=new sup1();
        ob1.display();

    }
}