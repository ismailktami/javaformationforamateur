import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import entities.*;

public class Main {
	public static void main(String[] args) {
		Personne p=new IntellignetStudent();
		Personne p2=new Doctor();
//		p.showMetier();
//		p2.showMetier();
//		
//		POLYMORPHISME
		List<Personne> personnes = new ArrayList<>();
		personnes.add(p);
		personnes.add(p2);
		for (Personne personne : personnes) {
			personne.showMetier();
		}
		personnes.forEach(personne->{
			personne.showMetier();
		});
		// Instanciation par interface
		BrainInterface d=new StupidStudent();
		List<Personne> personnes2=new ArrayList<Personne>();
		
	}

}
