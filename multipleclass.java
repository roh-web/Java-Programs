public class multipleclass {
    public static void main(String hai[]){
        multipleclass1 ob1=new multipleclass1();
        ob1.display();
    }
}
class multipleclass1 {
   void display() {
    multipleclass2 ob2=new multipleclass2();
    ob2.outdisplay();
   }
}
class multipleclass2 {
    void outdisplay() {
        System.out.println (" Hello world");
    }
}