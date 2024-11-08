public class Person
{
    // Attributes
    private String firstName;
    private String lastName;

    // Methods
    // Default Constructor
    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    
    public void Move(String roomName)
    {
        System.out.println("The person is moving to the " + roomName + " room.");
    }


    // getters and setters
    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
}

