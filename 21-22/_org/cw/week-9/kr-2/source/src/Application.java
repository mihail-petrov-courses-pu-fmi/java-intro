public class Application {

    public static void main(String[] args) {

        // Create an object of type Person with information for teacher
        Person teacher = new Person();
        teacher.setFirstName("Konstantin");
        teacher.setLastName("Rusev");
        teacher.setAge(29);
        teacher.setWeight(83.0);
        teacher.setHeight(180.0);
        teacher.eat();

        System.out.println("Teacher Information: ");
        System.out.println("First Name: " + teacher.getFirstName());
        System.out.println("Last Name: " + teacher.getLastName());
        System.out.println("Age: " + teacher.getAge());
        System.out.println("Weight: " + teacher.getWeight());
        System.out.println("Height: " + teacher.getHeight());
        System.out.println();

        // Create an object of type Person with information for student
        Person student = new Person("Ivan", "Ivanov", 18, 70.5, 180.0);
        student.printPersonInfo();
        student.walk();
    }
}
