package pmoo;

public class Kotxe {
	//atributuak
	
	private String matrikula;
	private String markaModeloa;
	private Pertsona jabea;

	//eraikitzaileak
	
	public Kotxe(String pMatrikula, String pMarkaModeloa){
		this.matrikula=pMatrikula;
		this.markaModeloa=pMarkaModeloa;
		this.jabea=null;
	}

	//gainontzeko metodoak
	

	public void aldatuJabea(Pertsona pJabea){
		this.jabea=pJabea;
	}
	
	public boolean jabeaAlDa(Pertsona pJabePosiblea){
		boolean erantzuna=false;
		if (this.jabea==pJabePosiblea){
			erantzuna=true;
		}
		return erantzuna;
	}
	
	public Pertsona getJabea(){
		return jabea;
	}
	
}
