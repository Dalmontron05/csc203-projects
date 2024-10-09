public class Person
{
    private String firstName;
    private String lastName;
    private int age;

    /*Constructor for the Person class
     * This is a special method that is called only once per object when an object is created
     * However it can be called multiple times fromt eh calss if we have multiple constructors.
    */
    public Person(String firstName, String lastName, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Method to introduce the person
    public void introduce()
    {
        System.out.println("\n\nHello, my name is " + this.firstName + " " + this.lastName + " and I am " + this.age + " years old\n");
    }

    public static void main(String[] args)
    {
        Person obj_person01 = new Person("Red", "Bull", 21);
        Person obj_person02 = new Person("Blue", "Cow", 32);
        obj_person01.introduce();
        obj_person02.introduce();
    }
}

