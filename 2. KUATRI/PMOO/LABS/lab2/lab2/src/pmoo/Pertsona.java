package pmoo;

public class Pertsona {
	//atributuak
	private String izena;
	private int adina;
	private int idPertsona;
	private String nazionalitatea;
	private String odolTaldea;
	//eraikitzaileak
	public Pertsona(int pId, String pIzena, int pAdina, String pOdolTaldea, String pNazionalitatea){
		this.idPertsona=pId;
		this.izena=pIzena;
		this.adina=pAdina;
		this.odolTaldea=pOdolTaldea;
		this.nazionalitatea=pNazionalitatea;
	}
	
	
	//gainontzeko metodoak
	public boolean idBerdinaDu(Pertsona pBestePertsona) {  // -int pId- edo -Pertsona pBestepertsona- 
		boolean erantzuna=false;
		if(this.idPertsona==pBestePertsona.idPertsona)
			erantzuna=true;
		return erantzuna;
	}
	public boolean gidatuDezake() {
		boolean erantzuna=false;
		if((this.nazionalitatea=="Etiopia") && (this.adina>=14)){
			erantzuna=true;}
		else if((this.nazionalitatea=="Australia") && (this.adina>=14)){
			erantzuna=true;}
		else if((this.nazionalitatea=="Estatu Batuak") && (this.adina>=16)){
			erantzuna=true;}
		else if((this.nazionalitatea=="Erresuma Batua") && (this.adina>=17)){
			erantzuna=true;}
		else if(this.adina>=18){
			erantzuna=true;}
		
		return erantzuna;	
	}
	public boolean emanDiezaiokeOdola(Pertsona pBestePertsona) {
		boolean erantzuna=false;
		if(pBestePertsona.odolTaldea=="AB+"){
			erantzuna=true;}
		if(pBestePertsona.odolTaldea=="AB-"){
			if(this.odolTaldea=="O-"){
				erantzuna=true;}
			else if(this.odolTaldea=="B-"){
				erantzuna=true;}
			else if(this.odolTaldea=="A-"){
				erantzuna=true;}
			else if (this.odolTaldea=="AB-"){
				erantzuna=true;}
		}
		if(pBestePertsona.odolTaldea=="A+"){
			if(this.odolTaldea=="O-"){
				erantzuna=true;}
			else if(this.odolTaldea=="O+"){
				erantzuna=true;}
			else if(this.odolTaldea=="A-"){
				erantzuna=true;}
			else if (this.odolTaldea=="A+"){
				erantzuna=true;}
		}
		if(pBestePertsona.odolTaldea=="A-"){
			if(this.odolTaldea=="O-"){
				erantzuna=true;}
			else if(this.odolTaldea=="A-"){
				erantzuna=true;}
		}
		if(pBestePertsona.odolTaldea=="B+"){
			if(this.odolTaldea=="O-"){
				erantzuna=true;}
			else if(this.odolTaldea=="O+"){
				erantzuna=true;}
			else if(this.odolTaldea=="B-"){
				erantzuna=true;}
			else if (this.odolTaldea=="B+"){
				erantzuna=true;}
		}
		if(pBestePertsona.odolTaldea=="B-"){
			if(this.odolTaldea=="O-"){
				erantzuna=true;}
			else if(this.odolTaldea=="B-"){
				erantzuna=true;}
		}
		if(pBestePertsona.odolTaldea=="O+"){
			if(this.odolTaldea=="O-"){
				erantzuna=true;}
			else if(this.odolTaldea=="O+"){
				erantzuna=true;}
		}
		if((pBestePertsona.odolTaldea=="O-")&&(this.odolTaldea=="O-")){
			erantzuna=true;
		}
		return erantzuna;	
	}
	public char izenarenIniziala() {
		char iniziala=this.izena.charAt(0);
		return iniziala;
	}
	public char abizenarenIniziala() {
		int i = (this.izena.length())-1;
		char ind = 0;
		char iniziala;
		while (ind!=' '){
			ind=this.izena.charAt(i);
			i=i-1;
		}
		iniziala=this.izena.charAt(i+2);
		
		return iniziala;
	}
}
