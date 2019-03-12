package Vererbung_student;

public class Student {
	private String name;
	private String firstname;
	private int stNr;
	private Adresse adresse;
	public Student(String name, String firstname, int stNr, Adresse adresse) {
		this.name = name;
		this.firstname = firstname;
		this.stNr = stNr;
		this.adresse = adresse;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public int getStNr() {
		return stNr;
	}
	public void setStNr(int stNr) {
		this.stNr = stNr;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public String toString() {
		return name+", "+ firstname+", "+stNr+", "
				+adresse.toString();
	}
	public void sayHallo() {
		System.out.println("Hallo, ich bin da, "+this.name+this.firstname);
	}
	
	
}
