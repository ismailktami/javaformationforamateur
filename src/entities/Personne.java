package entities;

public abstract class Personne {

	private String cin;
	private String name;
	private String age;
	public Personne() {
	}
	public Personne(String cin,String name,String age) {
			this.cin=cin;
			this.name=name;
			this.age=age;
	}
	
	public String getAge() {
		return age;
	}
	
	public String getCin() {
		return cin;
	}
	
	public String getName() {
		return name;
	}


	public void setAge(String age) {
		this.age = age;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void showMetier();
	

}


