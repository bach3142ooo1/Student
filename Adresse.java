package Vererbung_student;

public class Adresse {
	private String Stadt, Stra�e;
	private int Hausnummer, PLZ;
	public Adresse(String Stra�e,int Hausnummer,int PLZ,String Stadt) {
		this.Hausnummer=Hausnummer;
		this.PLZ=PLZ;
		this.Stadt=Stadt;
		this.Stra�e=Stra�e;
	}
	public String getStadt() {
		return this.Stadt;
	}
	public String getStra�e() {
		return this.Stra�e;
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
	public void setStra�e(String stra�e) {
		Stra�e = stra�e;
	}
	public void setHausnummer(int hausnummer) {
		Hausnummer = hausnummer;
	}
	public void setPLZ(int pLZ) {
		PLZ = pLZ;
	}
	public String toString(){
		return this.Stra�e+" "+ this.Hausnummer+", "+this.PLZ+" "+this.Stadt;
	}
}