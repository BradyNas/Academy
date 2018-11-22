
public class Person implements Comparable<Person>{
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String houseNumber;
	private String streetName;
	private String cityName;
	private String stateName;
	private String zipCode;
	private String telephoneNumber;
	
	
	public Person(String fN, String mN, String lN, String hN, String sN, String cN, String SN, String zC, String tN) {
		this.firstName = fN;
		this.middleName = mN;
		this.lastName = lN;
		this.houseNumber = hN;
		this.streetName = sN;
		this.cityName = cN;
		this.stateName = SN;
		this.zipCode = zC;
		this.telephoneNumber = tN;
	}

	private void Person() {
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName
				+ ", houseNumber=" + houseNumber + ", streetName=" + streetName + ", cityName=" + cityName
				+ ", stateName=" + stateName + ", zipCode=" + zipCode + ", telephoneNumber=" + telephoneNumber + "]";
	}
		
	public int compareTo(Person comparePerson) {
		
		return this.firstName.compareTo(comparePerson.getFirstName());
	
		}
		
}
