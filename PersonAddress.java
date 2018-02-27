
public class PersonAddress {
	private String FirstName; 
	private String LastName;
	private String Email;
	private String Telephone; 
	
	public String getFirstName() {return FirstName;} //accessor. returns the value of data member FirstName
	public String getLastName() {return LastName;} //accessor. retruns the value of data member LastName

	public void setEntries(String fn, String ln) {
		FirstName = fn; 
		LastName = ln;
	}
	public void setEmail(String newEmail) {
		Email = newEmail; 
	}
	
	public void setTelephone(String newTele) {
		Telephone = newTele; 
	}
	
	public boolean equals(PersonAddress compare) { //for comparison whether they are equal interm of their names
		return this.FirstName == compare.getFirstName() && this.LastName == compare.getLastName();
	}
	
}