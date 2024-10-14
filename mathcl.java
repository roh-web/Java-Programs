public class mathcl {
    int adnum1,adnum2,sum,sunum1,sunum2,dif,munum1,munum2,pro;
    int divnum1,divnum2,quo;
    void addition(int adnum1, int adnum2){
            sum=adnum1+adnum2;
            System.out.println("Sum : "+sum);
    }
    void subtraction(int sunum1, int sunum2){
            dif=sunum1-sunum2;
            System.out.println("Difference : "+dif);
    }
    void multiplication(int munum1, int munum2) {
            pro=munum1*munum2;
            System.out.println("Product : "+pro);
    }
    void division(int divinum1, int divinum2){
            quo = divinum1/divinum2;
            System.out.println("Quotient : "+quo);
    }
}