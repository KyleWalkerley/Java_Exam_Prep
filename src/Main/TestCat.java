package Main;

public class TestCat {

    public static void main(String[] args) {
        cat Steve = new cat();  // Steve is object of instance of the Cat class
        System.out.println("*" + Steve.is_male + " *" + Steve.age);
        // instance variable of object Steve is :is_male and age
    }

}

class cat{

    boolean is_male; // class variable becomes instance variable
    int age;  // after class is instantiated(new Cat();)
}
