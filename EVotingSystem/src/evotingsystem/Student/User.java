package evotingsystem.Student;

public class User {
    
    private int studID;
    private String lastName;
    private String firstName;
    private String middleName;
    private int userID;
    private String gender;
    private String course;
    private String year;
    
    public User(int StudentID, String LastName, String FirstName,String MiddleName, int UserID,String Gender, String Course,String Year)
    {
        this.studID = StudentID;
        this.lastName = LastName;
        this.firstName = FirstName;
        this.middleName = MiddleName;
        this.userID = UserID;
        this.gender = Gender;
        this.course = Course;
        this.year = Year;
    }

    public int getStudentID()
    {
        return studID;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getMiddleName()
    {
        return middleName;
    }

    public int getUserID()
    {
        return userID;
    }

    public String getGender()
    {
        return gender;
    }

    public String getCourse()
    {
        return course;
    }
    
    public String getYear()
    {
        return year;
    }
    
}


