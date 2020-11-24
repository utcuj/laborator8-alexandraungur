
public class Student implements Cloneable{
	private String nume;
	private String prenume;
	private Masina masinaa;
	
	public Student(String nume, String prenume, Masina masinaa) {
		this.nume=nume;
		this.prenume=prenume;
		this.masinaa=masinaa;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public Masina getMasinaa() {
		return masinaa;
	}

	public void setMasinaa(Masina masinaa) {
		this.masinaa = masinaa;
	}
	
	public String toString() {
		return "Nume:"+nume+" Prenume:"+prenume+" Masina"+masinaa;
	}
	
	//shallow 
	/*protected Student clone() throws CloneNotSupportedException{
		return super.clone();
	}*/
	
	//deep
	protected Student clone() throws CloneNotSupportedException{
		Student cloned=(Student)super.clone();
		cloned.setMasinaa((Masina)cloned.getMasinaa().clone());
		return cloned;
	}
	
	

	

}
