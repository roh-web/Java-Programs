public class EncapsulationGetSet {

    // Encapsulation :

    public static void main(String[] args) {

        Student s1 = new Student();
        // s1.name = "Roh"; : Wrong Way , for good practice its very good to asign by
        // getters and setter methods!
        s1.setName("Rohith");
        s1.setAge(15);
        System.out.println(s1.getName());

    }

}

class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("The name has been changed!!!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}