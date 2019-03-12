package Vererbung_student;
import java.util.LinkedList;
public class main {
	public static void main(String[] args) {
		LinkedList<String> currencies=new LinkedList<>();
		currencies.add("Dollar");
		currencies.add("Euro");
		LinkedList<String> prolangs=new LinkedList<>();
		prolangs.add("java");
		prolangs.add("python");
		Student st1= new Student("Le","Bach",12845,new Adresse("Kurt mothes Straﬂe",8,62510,"Halle"));
		BwlStudent bwlst1= new BwlStudent("Erhard","Bachmann",12342,new Adresse("Kurt mothes Straﬂe",6,62510,"Halle"),currencies);
		InfStudent infst1= new InfStudent("Hans","Schmidt",12343,new Adresse("Kurt mothes Straﬂe",5,62510,"Halle"),prolangs);
		System.out.println(bwlst1);
		System.out.println(infst1);
		System.out.println(st1);
		bwlst1.sayHallo();
	}

}
