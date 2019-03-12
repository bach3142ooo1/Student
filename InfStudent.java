package Vererbung_student;
import java.util.LinkedList;
public class InfStudent extends Student {
		LinkedList<String> prolangs;
		
		public InfStudent(String name, String firstname, int stNr, Adresse adresse,LinkedList<String> prolangs) {
			super(name, firstname, stNr, adresse);
			this.prolangs=prolangs;
		}

		public String toString() {
			return this.getName()+", "+ this.getFirstname()+", "+this.getStNr()+", "+
			this.getAdresse().toString()+", "
			+this.prolangs.toString();
		}
		@Override
		public void sayHallo() {
			System.out.print("InfStudent: ");
			super.sayHallo(); 
		}
}