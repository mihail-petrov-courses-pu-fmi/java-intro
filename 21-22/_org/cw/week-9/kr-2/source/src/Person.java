public class Person {

    // properties
    private String firstName;
    private String lastName;
    private int age;
    private double weight;
    private double height;

    public Person() {
        // default constructor without values of the object characteristics
    }

    public Person(String firstName, String lastName, int age, double weight, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void eat() {
        System.out.println("Person with name " + this.firstName + " " + this.lastName + " is eating!");
    }

    public void walk() {
        System.out.println("Person with name " + this.firstName + " " + this.lastName + " is walking!");
    }

    public void printPersonInfo() {
        System.out.println("Person Information: ");
        System.out.println("First Name: "   + this.firstName);
        System.out.println("Last Name: "    + this.lastName);
        System.out.println("Age: "          + this.age);
        System.out.println("Weight: "       + this.weight);
        System.out.println("Height: "       + this.height);
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
