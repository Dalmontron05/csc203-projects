// Inherits from Person.java
public class Student extends Person
{
    private String studentID;

    public Student(String firstName, String lastName, String studentID)
    {
        // call the paretn class constructor
        super(firstName, lastName);

        // initalizing studentID
        this.studentID = studentID;
    }

    public void Studying()
    {
        System.out.println("The student " + getFirstName() + " is studying");
    }

    // getters and setters
    public String getStudentID()
    {
        return studentID;
    }

    public void setStudentID(String studentID)
    {
        this.studentID = studentID;
    }
}

