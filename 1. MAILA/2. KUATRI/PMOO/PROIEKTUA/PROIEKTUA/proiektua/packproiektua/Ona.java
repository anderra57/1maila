package packproiektua;

public class Ona extends Pertsonaia{
	private int fue;
	private int des;
	private int con;
	private int intel;
	private int sab;
	private int car;
	private ListaAkzioak lista;
	private Inbentarioa lista1;
	
	public Ona(int pFue, int pDes, int pCon, int pIntel, int pSab, int pCar,int pAtq, int pDef, int pPv, String pArma, String pIzena,ListaAkzioak pLista,Inbentarioa pLista1){
		super(pAtq,pDef,pPv,pArma,pIzena);
		this.fue=pFue;
		this.des=pDes;
		this.con=pCon;
		this.intel=pIntel;
		this.sab=pSab;
		this.car=pCar;
		this.lista=new ListaAkzioak();
		this.lista1=new Inbentarioa();
	}
	public void pertsonaiaEguneratu(Akzioa pAkzioa){
		
	}
	public void objetuaErabili(int pObjIz){
		
	}
}
