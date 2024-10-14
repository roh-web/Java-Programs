public class StringBufferMethods {
    public static void main(String args[]){

        StringBuffer str1 = new StringBuffer("Hey Java");
        str1.append(" Hey");
        System.out.println(str1);        

        StringBuffer str2 = new StringBuffer("Java");
        str2.reverse();
        System.out.println(str2);

        StringBuffer str3 = new StringBuffer("Hey Java");
        str3.insert(1,"a");
        System.out.println(str3);

        StringBuffer str4 = new StringBuffer("Java");
        System.out.println(str4.length());

        StringBuffer str5 = new StringBuffer("Hey Java");
        String str5Duplicate = str5.substring(3);
        System.out.println(str5Duplicate.trim());

        StringBuffer str6 = new StringBuffer("Hey Java");
        System.out.println(str6.indexOf("e"));

        StringBuffer str7 = new StringBuffer("Java");
        System.out.println(str7.charAt(2));
    }    
}
