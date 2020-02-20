package packlaborategia4;

import java.text.DecimalFormat;

public class Bezeroa {
	// atributuak
	private int idBezeroa;
	private String izenAbizena;
	private String pasaHitza;
	private double saldoa;
	private boolean berezia;
	
	// eraikitzailea
	public Bezeroa(int pId, String pIzenAbizena, String pPasaHitza,
			double pSaldoa, boolean pBerezia) {
		this.idBezeroa=pId;
		this.izenAbizena=pIzenAbizena;
		this.pasaHitza=pPasaHitza;
		this.saldoa=pSaldoa;
		this.berezia=pBerezia;
	}

	public boolean bereziaDa() {
		boolean berezia=false;
		if(berezia){
			berezia=true;
		}
		return berezia;
	}

	public boolean idBerdinaDu(int pIdBezero) {
		boolean berdina = false;
		if(this.idBezeroa==pIdBezero){
			berdina=true;
		}
		return berdina;
	}

	public double saldoaLortu(String pPasaHitza) {
		// Alde batetik, bezeroaren pasahitza eta jasotakoa berdinak diren
		// konprobatzen du. PasaHitza okerra bada 0.0 bueltatuko du
		double saldoa = 0.0;
		if(this.pasaHitza==pPasaHitza){
			System.out.println("bezeroaren izenAbizena, zure saldoa "++" da");
			saldoa=this.saldoa;
		}
		else{
			System.out.println("bezeroaren izenAbizena, pasahitza okerra");
			saldoa = 0.0;
		}
		return saldoa;
	}

	// gainontzeko metodoak
	private boolean pasaHitzaBaieztatu(String pPasaHitza) {
		// gorago komentatu denez boolear bat bueltatuko du, jasotzen duen
		// pasahitza eta bezeroarena kointzidentzien dutenean.
		boolean baieztapena = false;
		if(this.pasaHitza==pPasaHitza){
			baieztapena=true;
		}
		return baieztapena;
	}

	public void saldoaEguneratu(String pPasaHitza, double pDiruKop) {
		// Alde batetik, bezeroaren pasahitza eta jasotakoa berdinak diren
		// konprobatzen du. Gero, parametro bezala duen diru kopurua bezeroaren
		// saldoa baino handiagoa ez izatea baieztatzen du, eta horrela ez
		// balitz, saldoa ez luke ukituko. Edozein kasutan, pantailatik mezu bat
		// bueltatuko du burutu den eragiketa ondo ala txartu bukatu den
		// adierazteko. Ondo burutu bada,zure saldo berria XXX da
		// pantailaratuz, eta gaizki burutu bada, saldoa ezin izan da aldatu
		// inprimatuko luke.
		// double dirua = pDiruKop;
		if(pasaHitzaBaieztatu(String pPasaHitza)){
			
		}
		...
		DecimalFormat df = new DecimalFormat("######.00");
		System.out.println(df.format(645.34567));
		...
		
	}

}
