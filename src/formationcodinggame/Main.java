package formationcodinggame;

public class Main{
	public static void main(String[] args) {
		StaticsVarMethods s1=new StaticsVarMethods("Asmae", "Ismaiol");
		StaticsVarMethods s2=new StaticsVarMethods("Asmae2", "Ismaiol2");
		StaticsVarMethods s3=new StaticsVarMethods("Asmae3", "Ismaiol3");
		
		System.out.println(s1.getVar1());
		s1.setVar1("ASMAE NEW VALUE");
		System.out.println(s2.getVar1());
		
		
		
		System.out.println(StaticsVarMethods.getVar1());
	}
	
}