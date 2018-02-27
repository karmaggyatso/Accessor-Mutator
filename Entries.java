import java.util.*; 
public class Entries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonAddress form1 = new PersonAddress(); 
		PersonAddress form2 = new PersonAddress(); 
		
		form1.setEntries("john", "smith"); 
		form1.setEmail("john.smith@abc.com"); //old email address
		form1.setEmail("johnsmith@abc.com"); //changed to new email address
		
		form1.setTelephone("347.123.456");//old phone number
		form1.setTelephone("219.123-467"); //changed to new telephone number
		
		form2.setEntries("john", "smith");
		form2.setEmail("wonderland@wonderland.com");
		form2.setTelephone("347.789.123");
		
		if (form1.equals(form2)) {
			System.out.println("They have same name. ");
		}
		else 
			System.out.print("They don't have same name. ");
		
	}

}
