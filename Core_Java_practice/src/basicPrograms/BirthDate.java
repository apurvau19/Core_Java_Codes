package basicPrograms;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;



public class BirthDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
			  
	            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	            Date birthDate = formatter.parse(args[0]);

	            // Get current date
	            Calendar currentDate = Calendar.getInstance();
	            currentDate.setTime(new Date());

	            // Get birth date
	            Calendar birthDateCal = Calendar.getInstance();
	            birthDateCal.setTime(birthDate);

	            // Calculate age
	            int age = currentDate.get(Calendar.YEAR) - birthDateCal.get(Calendar.YEAR);

	            System.out.println("Your birth date is "+args[0]+ " so your age is: "+age);
	
		
		}
		  
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		}

}
