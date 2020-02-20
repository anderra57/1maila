package packlaborategia5;

import java.util.ArrayList;

public class Katalogoa
{
	// atributuak
	
	private static Katalogoa nireKatalogoa;
	private ListaLiburuak lista;
	
	// eraikitzailea
	
	private Katalogoa(){
		this.lista = new ListaLiburuak();
	}

 	// otros métodos
 	
	public static Katalogoa getKatalogoa() 	{
		if(nireKatalogoa==null){
			nireKatalogoa=new Katalogoa();
		}
		return nireKatalogoa;
	}
	
 	public int liburuKopuru(){
 		return this.lista.listarenTamaina();
 	}
 	 	
	public Liburua bilatuLiburuaIdz(int pIdLiburua){
 	 	Liburua libu = null;
 	 	if(this.lista.bilatuLiburuaIdz(pIdLiburua) != null){
 	 		libu = this.lista.bilatuLiburuaIdz(pIdLiburua);
 	 	}
 	 	return libu;
	}
	
 	public void mailegatuLiburua(int pIdLiburua, int pIdErabiltzailea)	{
		ListaErabiltzaileak lista=ListaErabiltzaileak.getListaErabiltzaileak();
 		Liburua lib = this.bilatuLiburuaIdz(pIdLiburua);
		Erabiltzailea erabId= lista.bilatuErabiltzaileaIdz(pIdErabiltzailea);
		Erabiltzailea erabLiburudun= lista.norkDaukaMaileguan(lib);
		if(!erabId.mailegatzekoMaximoaGainditua()&& erabId==erabLiburudun){
			erabId.gehituLiburua(lib);
		}
		else{
			System.out.println("Arazoa egon da. Saiatu berriro.");
		}
	}

 	public void itzuliLiburua(int pIdLiburua){
 		Liburua lib = this.bilatuLiburuaIdz(pIdLiburua);
 		ListaErabiltzaileak lista=ListaErabiltzaileak.getListaErabiltzaileak();
 		Erabiltzailea erabLiburudun= lista.norkDaukaMaileguan(lib);
 		if (erabLiburudun!=null){
 			erabLiburudun.kenduLiburua(lib);
 		}
	}
 	
 	public void katalogatuLiburua(Liburua pLiburua)	{		
 		this.lista.gehituLiburua(pLiburua);
 	}

 	public void deskatalogatuLiburua(int pIdLiburua){
 		this.lista.kenduLiburua(this.bilatuLiburuaIdz(pIdLiburua));
 	}

 	public void inprimatu() 	{
 		this.lista.inprimatu();
 	}

 	public void erreseteatu()	{
 		Katalogoa.nireKatalogoa=null;
 	}
 	
}	
