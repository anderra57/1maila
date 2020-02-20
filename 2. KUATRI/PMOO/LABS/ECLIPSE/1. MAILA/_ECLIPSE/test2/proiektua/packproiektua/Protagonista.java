package packproiektua;

public class Protagonista extends Pertsonaia{
	private String izena;
	private int pv;
	private int x;
	private int y;
	private int ataq;
	private int def;
	private Inbentarioa listaI;
	/*
	private ListaAkzioa listaA;
	private Inbentarioa listaI;
	private Egoera egoera;
	*/
	private static Protagonista nireProtagonista = null;
	
	private Protagonista(String pIzena){
		super(pIzena);
		/*this.listaA= new ListaAkzioa();*/
		this.listaI= Inbentarioa.getNireInbentarioa();
		this.pv=100;
		this.def=100;
		this.ataq=100;
	}
	
	public static Protagonista hasieratuProtagonista(String pIzena){
		if(nireProtagonista == null){
			nireProtagonista = new Protagonista(pIzena);
		}
		return nireProtagonista;
	}
	
	public static Protagonista getNireProtagonista(){
		return nireProtagonista;
	}
	
	public void pertsonaiaEguneratu(Akzioa pAkzioa){
		
	}
	
	public void objetuaErabili(String pObjIz){
		listaI.objetuaErabili(pObjIz);
	}
	
	public void posizioazAldatu(int pX, int pY){
		this.x=pX;
		this.y=pY;
	}
	
	public int getX(){
		return this.x;
	}

	public int getY(){
		return this.y;
	}
	
	public int getPv(){
		System.out.println(this.izena + ", zure bizitza "+ this.pv +" da");
		return this.pv;
	}
	
	public int getAtaq(){
		return this.ataq;
	}
	
	public int getDef(){
		return this.def;
	}
	
	public void setPv(int pBatuketa){
		this.pv = pBatuketa;
	}

	public void setAtaq(int pAtaq){
		this.ataq = pAtaq;
	}
	
	public void setDef(int pDef){
		this.def = pDef;
	}
	
	public void setIzena(String pIzena){
		this.izena=pIzena;
	}
	
	public String getIzena(){
		return this.izena;
	}

	public void hasierakoPosizioa(int pId){
			int id = pId;
			if(id == 2){
				this.posizioazAldatu(14, 1);
				Hilerria hilerri = Hilerria.getNireHilerria();
				hilerri.setPertsonaiaMatrizean();
			}
			if(id == 1){
				this.posizioazAldatu(18,15);
				Saloia saloia = Saloia.getNireSaloia();
				saloia.setPertsonaiaMatrizean();
			}
			if(id == 3){
				this.posizioazAldatu(11, 11);
				Banketxea banketxe = Banketxea.getNireBanketxea();
				banketxe.setPertsonaiaMatrizean();
			}
	}
	
	public boolean estalita(){
		ListaGordelekuak gorde= ListaGordelekuak.getNireListaGordelekuak();
		boolean bai = false;
		if(gorde.okupatutaDago(x,y)){
			bai = true;
		}
		return bai;
	}
}