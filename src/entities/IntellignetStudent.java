package entities;

public class IntellignetStudent extends Personne implements BrainInterface{
	
	private String cne;
	private String level;
	
	public IntellignetStudent() {
		super();
	}
	
	public IntellignetStudent(String cin,String name,String age,String cne,String level) {
		super(cin,name,age);
		this.cne=cne;
		this.level=level;
	}
	
	public void ShowInformations() {
		System.out.println("CLASSE FILLE");
		System.out.println(super.getName()+"   "+ this.getAge()+"  "+this.cne+"   "+this.level);
	}
	
	@Override
	public void showMetier() {
		System.out.println("STUDENT");
	}

	@Override
	public int getlevelbrain() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void think() {
		// TODO Auto-generated method stub
		
	}

	
}



