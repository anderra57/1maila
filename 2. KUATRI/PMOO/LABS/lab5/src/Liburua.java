package packlabo5;

public class Liburua
{
	
	// atributuak
	private String titulua;
	private String idazlea;
	private int idLiburua;

	// eraikitzailea
	public Liburua(String pTitulua, String pIdazlea, int pIdLiburua){
		this.titulua=pTitulua;
		this.idazlea=pIdazlea;
		this.idLiburua=pIdLiburua;
	
	} 
	
	// beste metodoak
	
	public boolean idHauDu(int pIdLiburua){
		boolean berdina=false;
		if(this.idLiburua==pIdLiburua){
			berdina=true;
		}
		return berdina;
	}
	
	public boolean idBerdinaDute (Liburua pLiburua){
		boolean berdin = false;
		if(this.idLiburua==pLiburua.idLiburua){
			berdin=true;
		}
		return berdin;
	}
	
	public void inprimatu() {
		System.out.println("Liburuaren titulua: "+this.titulua+ "Liburuaren idazlea: "+this.idazlea+ "Liburuaren id-a "+this.idLiburua);
	}
	
}
