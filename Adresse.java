package Vererbung_student;

public class Adresse {
	private String Stadt, Straﬂe;
	private int Hausnummer, PLZ;
	public Adresse(String Straﬂe,int Hausnummer,int PLZ,String Stadt) {
		this.Hausnummer=Hausnummer;
		this.PLZ=PLZ;
		this.Stadt=Stadt;
		this.Straﬂe=Straﬂe;
	}
	public String getStadt() {
		return this.Stadt;
	}
	public String getStraﬂe() {
		return this.Straﬂe;
	}
	public int getHausnummer() {
		return Hausnummer;
	}
	public int getPLZ() {
		return this.PLZ;
	}
	public void setStadt(String stadt) {
		Stadt = stadt;
	}
	public void setStraﬂe(String straﬂe) {
		Straﬂe = straﬂe;
	}
	public void setHausnummer(int hausnummer) {
		Hausnummer = hausnummer;
	}
	public void setPLZ(int pLZ) {
		PLZ = pLZ;
	}
	public String toString(){
		return this.Straﬂe+" "+ this.Hausnummer+", "+this.PLZ+" "+this.Stadt;
	}
}