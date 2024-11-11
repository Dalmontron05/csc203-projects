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

    
    public void Talk(String text)
    {
        System.out.println(getFirstName() + ": " + text);
    }


    public void Eat(String food, int timeInHours)
    {
        System.out.println(getFirstName() + " will be eating " + food + " for " + timeInHours + " hours");
    }


    public void Sleep(String location, int timeInHours) 
    {
        System.out.println(getFirstName() + " will sleep at " + location + "for " + timeInHours + " hours");
    }


    // time in minutes is additional to time in hours (ex. 1 hour and 25 minutes. ex. 40 minutes)
    public void Sleep(String location, int timeInHours, int timeInMinutes) 
    {
        System.out.println(getFirstName() + " will sleep at " + location + "for " + timeInHours + " hours and " + timeInMinutes + " minutes.");
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

