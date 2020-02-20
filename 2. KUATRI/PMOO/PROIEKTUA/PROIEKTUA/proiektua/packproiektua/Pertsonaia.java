package packproiektua;

public abstract class Pertsonaia {
	private int atq;
	private int def;
	private int pv;
	private String arma;
	private String izena;
	
	public Pertsonaia(int pAtq, int pDef, int pPv, String pArma, String pIzena){
		this.atq=pAtq;
		this.def=pDef;
		this.pv=pPv;
		this.arma=pArma;
		this.izena=pIzena;
	}
	public void pertsonaiaEguneratu(Akzioa pAkzioa){
		
	}
	public boolean pertsonaiaBerdina(Pertsonaia pPertsonaia){
		
	}
}
