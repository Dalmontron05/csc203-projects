public class Professor extends Person
{
    public Professor(String firstName, String lastName)
    {
        super(firstName, lastName);
    }


    public void Teach(Student student, int timeInHours)
    {
        System.out.println("Professor " + getLastName() + " is teaching student " + student.getFirstName() + " for " + timeInHours + " hours");
    }


    public void Teach(Student student, int timeInHours, int timeInMinutes)
    {
        System.out.println("Professor " + getLastName() + " is teaching student " + student.getFirstName() + " for " + timeInHours + " hours and " + timeInMinutes + " seconds");
    }
}
