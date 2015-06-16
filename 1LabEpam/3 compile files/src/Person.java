public class Person {
	private String name;
	private String surname ;
	private String birthDate;
	public void setName(String newName){
	name = newName;
	}
	public String getName(){
	return name;
	}
	public void setSurname(String newSurname){
	surname = newSurname;
	}
	public String getSurname(){
	return surname;
	}
	public void setBirthDate(String newBirthDate){
	birthDate = newBirthDate;
	}
	public String getBirthDate(){
	return birthDate;
	}
	public String toString(){
	return name+"; "+surname +"; "+ birthDate;
	}
}