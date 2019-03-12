package Vererbung_student;
import java.util.LinkedList;
public class BwlStudent extends Student{
	LinkedList<String> currencies;
	
	public BwlStudent(String name, String firstname, int stNr, Adresse adresse,LinkedList<String> currencies) {
		super(name, firstname, stNr, adresse);
		this.currencies=currencies;
	}

	public String toString() {
		return this.getName()+", "+ this.getFirstname()+", "+this.getStNr()+", "+
		this.getAdresse().toString()+","
		+this.currencies.toString();
	}
	@Override
	public void sayHallo() {
		System.out.print("BwlStudent: ");
		super.sayHallo(); 
	}
}
