package org.pmoo;

public class Pertsona {
	//atributuak
	private String izena;
	private int adina;
	private int idPertsona;
	private char sexua;
	private String nazionalitatea;
	private String odolMota;
	//eraikitzaileak
	public Pertsona(String pIzena, int pAdina, int pId, char pSexua, String pNazionalitatea, String pOdolMota){
		this.izena=pIzena;
		this.adina=pAdina;
		this.idPertsona=pId;
		this.sexua=pSexua;
		this.nazionalitatea=pNazionalitatea;
		this.odolMota=pOdolMota;
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
	public boolean odolaEmanDiezaioke(Pertsona pBestePertsona) {
		boolean erantzuna=false;
		if(pBestePertsona.odolMota=="AB+"){
			erantzuna=true;}
		if(pBestePertsona.odolMota=="AB-"){
			if(this.odolMota=="O-"){
				erantzuna=true;}
			else if(this.odolMota=="B-"){
				erantzuna=true;}
			else if(this.odolMota=="A-"){
				erantzuna=true;}
			else if (this.odolMota=="AB-"){
				erantzuna=true;}
		}
		if(pBestePertsona.odolMota=="A+"){
			if(this.odolMota=="O-"){
				erantzuna=true;}
			else if(this.odolMota=="B-"){
				erantzuna=true;}
			else if(this.odolMota=="A-"){
				erantzuna=true;}
			else if (this.odolMota=="AB-"){
				erantzuna=true;}
		}
		if(pBestePertsona.odolMota=="A-"){
			if(this.odolMota=="O-"){
				erantzuna=true;}
			else if(this.odolMota=="A-"){
				erantzuna=true;}
		}
		if(pBestePertsona.odolMota=="B+"){
			if(this.odolMota=="O-"){
				erantzuna=true;}
			else if(this.odolMota=="O+"){
				erantzuna=true;}
			else if(this.odolMota=="B-"){
				erantzuna=true;}
			else if (this.odolMota=="B+"){
				erantzuna=true;}
		}
		if(pBestePertsona.odolMota=="B-"){
			if(this.odolMota=="O-"){
				erantzuna=true;}
			else if(this.odolMota=="B-"){
				erantzuna=true;}
		}
		if(pBestePertsona.odolMota=="O+"){
			if(this.odolMota=="O-"){
				erantzuna=true;}
			else if(this.odolMota=="O+"){
				erantzuna=true;}
		}
		if((pBestePertsona.odolMota=="O-")&&(this.odolMota=="O-")){
			erantzuna=true;
		}
		return erantzuna;	
	}
	public char getIzenarenIniziala() {
		char iniziala=this.izena.charAt(0);
		return iniziala;
	}
	/*public char getAbizenarenIniziala() {
		char iniziala=this.abizena.charAt(0);
		return iniziala;
	}*/
}
