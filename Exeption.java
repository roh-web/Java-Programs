class exep {
    public static void main(String ar[]){
       int div;
            System.out.println("Program Started Execution..!");
             try {
                div = 10/0;
        System.out.println(div);
       System.out.println("Program Successfuly Stopped Execution..!");
             }catch (Exception division) {
                 System.out.println("!!Its Not Possible To Divide By Zero!!");
             }
             System.out.println("Program Stopped With 1 Exception");
    }
}