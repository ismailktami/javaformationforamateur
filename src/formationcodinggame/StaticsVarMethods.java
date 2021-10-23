package formationcodinggame;

class StaticsVarMethods {
	public static String var1="ASMAESTATIC VALUE";
	
	private String nonstaticvar;
	private String nonstaticvatr2;
	
	public StaticsVarMethods(String a,String b) {
			this.nonstaticvar=a;
			this.nonstaticvatr2=b;
	}

	public String getNonstaticvar() {
		return nonstaticvar;
	}
	public String getNonstaticvatr2() {
		return nonstaticvatr2;
	}
	public void setNonstaticvatr2(String nonstaticvatr2) {
		this.nonstaticvatr2 = nonstaticvatr2;
	}
	public void setNonstaticvar(String nonstaticvar) {
		this.nonstaticvar = nonstaticvar;
	}
	
	public static void setVar1(String var1) {
		StaticsVarMethods.var1 = var1;
		
	}
	public static String getVar1() {
		return var1;
	}


	public static void hahah() {
		System.out.println("hahahah");
	}
}

 