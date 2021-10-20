package entities;

public class Doctor extends Personne implements BrainInterface{

	private int id_doctor;
	public Doctor() {
		super();
	}
	
	public Doctor(String name,String age,String cin,int id_doctor) {
		super(cin,name,age);
		this.id_doctor=id_doctor;
	}
	public int getId_doctor() {
		return id_doctor;
	}
	public void setId_doctor(int id_doctor) {
		this.id_doctor = id_doctor;
	}
	
	@Override
	public void showMetier() {
		System.out.println("DOCTOR");
	}

	@Override
	public void think() {
		// TODO Auto-generated method stub
	}

	@Override
	public int getlevelbrain() {
		return 0;
	}

}
