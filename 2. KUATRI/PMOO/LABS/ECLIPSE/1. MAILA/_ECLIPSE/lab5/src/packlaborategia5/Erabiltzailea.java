package packlaborategia5;

public class Erabiltzailea{
	//atributuak
	private int idErabiltzailea;
	private String izenOsoa;
	private int maxLiburuak;
	private ListaLiburuak liburuMailegatuak;
	
	//eraikitzailea
	
	public Erabiltzailea(String pIzenOsoa, int pIdErabiltzaile){
		this.idErabiltzailea=pIdErabiltzaile;
		this.izenOsoa=pIzenOsoa;
		this.maxLiburuak=3;
		this.liburuMailegatuak=new ListaLiburuak();
	}
	
	// beste metodoak
	
	public boolean idHauDu(int pId){
		boolean hauDu = false;
		if(this.idErabiltzailea == pId){
			hauDu=true;
		}
		return hauDu;
	}
	
	
	public boolean idBerdinaDute(Erabiltzailea pErabiltzailea){
		boolean berdinaDa=false;
		if(this.idErabiltzailea == pErabiltzailea.idErabiltzailea){
			berdinaDa=true;
		}
		return berdinaDa;
	}
	
	public boolean mailegatzekoMaximoaGainditua(){
		boolean gainditu = false;
		if(this.liburuMailegatuak.listarenTamaina() > this.maxLiburuak){
			gainditu = true;
		}
		return gainditu;
	}
	
	public void gehituLiburua(Liburua pLiburua){
		this.liburuMailegatuak.gehituLiburua(pLiburua);
	}
	
	public void kenduLiburua(Liburua pLiburua){
		this.liburuMailegatuak.kenduLiburua(pLiburua);
	}
	
	public boolean maileguanDu(Liburua pLiburua){
		return this.liburuMailegatuak.badago(pLiburua);
	}
	
	public void inprimatu(){
	
		if(this.liburuMailegatuak.listarenTamaina() > 0){
			System.out.println("Erabiltzailearen id-a: "+ this.idErabiltzailea+ " ||  Erabiltzailearen izena: "+ this.izenOsoa);
			this.liburuMailegatuak.inprimatu();
		}
		else{
			System.out.println("Erabiltzailearen id-a: "+ this.idErabiltzailea+ " ||  Erabiltzailearen izena: "+ this.izenOsoa+ "Ez dituzu libururik mailegatuta");
		}	
	}
	public int getId(){
		return this.idErabiltzailea;
	}
}
