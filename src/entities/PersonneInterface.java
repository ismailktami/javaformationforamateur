package entities;

interface PersonneInterface {
	void ShowInformations();
}

class aa{
	public static void main(String[] args) {
		
			PersonneInterface p = new PersonneInterface() {
				@Override
				public void ShowInformations() {
					System.out.println("jdhshdh");
					
				}
			};
			
			p.ShowInformations();
			
			
		
	}
}


