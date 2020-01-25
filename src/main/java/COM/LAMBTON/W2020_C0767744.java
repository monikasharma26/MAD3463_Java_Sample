package COM.LAMBTON;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class W2020_C0767744
{
    public static void main(String[] args)
    {

        Student st=new Student();
        LocalDate dateOfBirth= LocalDate.of(1992,  8, 28);
       st.setData(0764433,"Monika", "Sharma",dateOfBirth,Gender.FEMALE,96);
       st.printData();
       st.ageCalulate(dateOfBirth);


    }
}
