package gun3Odev2;

public class User {
	int id;
	String firstName;
	String lastName;
	String national�dentity;
	String email;
	String course;
	
	public User() {
		
	}
	public User(int id, String firstName, String lastName, String national�dentity, String email, String course) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.national�dentity = national�dentity;
		this.email = email;
		this.course = course;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getNational�dentity() {
		return national�dentity;
	}
	public void setNational�dentity(String national�dentity) {
		this.national�dentity = national�dentity;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
}
