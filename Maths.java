import java.util.Scanner;
class mathop  {
        public static void main(String ar[]){
            mathcl ob1=new mathcl();
            int operations=0;
            int add1,add2;
            Scanner sc=new Scanner(System.in);
            System.out.println ("\t\t\t\t\tSelect The Mathematical Operation You Want To Do");
            System.out.println("Enter 1 to addition , 2 : Subtraction , 3 : Multiplication , 4 : Division");
             operations=sc.nextInt();
            if (operations==1){
                System.out.println("Enter 2 Numbers For Addition");
                    add1=sc.nextInt();
                    add2=sc.nextInt();
                    ob1.addition(add1,add2);
            }
            int sub1,sub2; 
            if (operations==2) {
                System.out.println("Enter 2 Numbers For Subtraction");
                sub1=sc.nextInt();
                sub2=sc.nextInt();
                ob1.subtraction(sub1,sub2);
            }
            int mult1,mult2;
            if (operations==3){
                System.out.println("Enter 2 Numbers For Multiplication");
                mult1=sc.nextInt();
                mult2=sc.nextInt();
                ob1.multiplication(mult1,mult2);
            }
            int divis1,divis2;
            if (operations == 4){
                System.out.println("Enter 2 Numbers For Division");
                divis1=sc.nextInt();
                divis2=sc.nextInt();
                ob1.division(divis1,divis2);
            }
            
        }
}