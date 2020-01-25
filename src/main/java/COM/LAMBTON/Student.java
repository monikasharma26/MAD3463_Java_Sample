package COM.LAMBTON;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
enum Gender
{
    MALE,
    FEMALE,
    OTHER

}
public class Student {
    int studentId;
    String firstName, lastName;
    LocalDate birthDate;
    Gender gender;
    float totalMarks;

    public void setData(int studentId, String firstName,String lastName, LocalDate birthDate,Gender gender, float totalMarks)
    {
        this.studentId=studentId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthDate=birthDate;
        this.gender=gender;
        this.totalMarks=totalMarks;
    }

    public  void printData()
    {
        System.out.println("Student Id:" +studentId);
        System.out.println("Student FirstName:" +firstName);
        System.out.println("Student LastName:" +lastName);
        System.out.println("Student BirthDate:" +birthDate);
        System.out.println("Student Gender:" +gender);
        System.out.println("Student TotalMarks:" +totalMarks);
        System.out.println(" ");

    }
    public  void ageCalulate(LocalDate d)
    {
        LocalDate now = LocalDate.now();
        Period diff = Period.between(d, now);
        System.out.println(diff.getYears() + "years" + diff.getMonths() + "months" + diff.getDays() + "days");
    }
}