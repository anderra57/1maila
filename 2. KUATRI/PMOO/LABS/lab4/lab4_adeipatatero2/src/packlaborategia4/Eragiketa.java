package packlaborategia4;

public class Eragiketa {
	// atributuak
	private int operazioarenId;
	private int idBezero;
	private String pasahitza;
	private double diruKop;
	
	// eraikitzailea
	public Eragiketa(int pId, int pIdBezeroa, String pPasaHitza, double pDiruKop) {
		this.operazioarenId=pId;
		this.idBezero=pIdBezeroa;
		this.pasahitza=pPasaHitza;
		this.diruKop=pDiruKop;
	}

	// gainotzeko metodoak
	public boolean idBerdinaDu(int pId) {
		boolean berdina = false;
		if(this.operazioarenId==pId){
			berdina=true;
		}
		return berdina;
	}

	public void eragiketaBurutu() {
	ListaBezeroak lista=ListaBezeroak.getNireListaBezeroak();
	Bezeroa bezeroa=lista.bilatuBezeroaIdz(this.idBezero);
		
	if(bezeroa.idBerdinaDu(this.idBezero)){
		if(bezeroa.saldoaLortu(pasahitza)<=this.diruKop && bezeroa.bereziaDa()){
			bezeroa.saldoaEguneratu(pasahitza, diruKop);
		}
		else if(bezeroa.saldoaLortu(pasahitza)<=this.diruKop && !bezeroa.bereziaDa()){
			bezeroa.saldoaEguneratu(pasahitza, diruKop*0.001);
		}
		else {
			System.out.println("operazioarenId operazioan, kopurua ez da egokia");
		}
	}
	else{System.out.println("operazioarenId operazioan, bezeroa ez da existitzen");
		
	}
	}
}
