package packproiektua;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ListaEtsaiak {
	
	private ArrayList<Etsaia> lista;
	
	public ListaEtsaiak(){
		this.lista = new ArrayList<Etsaia>();
	}
	public Iterator<Etsaia> getIteradorea(){
		return this.lista.iterator();
	}
	
	public int luzera(){
		return this.lista.size();
	}
	
	public void etsaiaGehitu(Etsaia pEtsaia){
		this.lista.add(pEtsaia);
	}
	
	public void eraso(){
		Iterator<Etsaia> itr=this.getIteradorea();
		Etsaia e=itr.next();
		e.eraso();
	}
	
	public Etsaia etsaiaBilatuIzenez(String pIzena) throws BalioEzEgokia{
		
		Iterator<Etsaia> itr=this.getIteradorea();
		Etsaia e=null;
		boolean aurkitua = false;
		String izena=pIzena.toUpperCase();
		while(itr.hasNext() && !aurkitua){
			e=itr.next();
			String etsaiarenIzena=e.getIzena();
			if(etsaiarenIzena.equals(izena)){
				aurkitua = true;
			}
		}
		if(!aurkitua){
			throw new BalioEzEgokia();
		}
		return e;	
	}
	
	public void etsaienBizitzaInprimatu(){
		Iterator<Etsaia> itr=this.getIteradorea();
		Etsaia e=null;
		while(itr.hasNext()){
			e=itr.next();
			if (e.getPv()>0){
				System.out.println(e.getIzena() + " etsaiaren bizitza "+e.getPv() +" da");
			}
			else{
				System.out.println(e.getIzena() + " etsaia hilda dago");
			}
		}
	} 
	
	public Etsaia returnPosizioan(int pPos) throws NotZenbakiEgokia{
		if(pPos>this.lista.size()){
			throw new NotZenbakiEgokia();
		}
		Iterator<Etsaia>itr=this.getIteradorea();
		int lag=pPos;
		Etsaia e=null;
		while(itr.hasNext()&&lag>0){
			e=itr.next();
			lag--;
		}
		return e;
	}
	
	public boolean badago(Etsaia pEtsaia) throws BalioEzEgokia{
		Iterator<Etsaia> itr=this.getIteradorea();
		Etsaia e=null;
		boolean aurkitua = false;
		while(itr.hasNext() && !aurkitua){
			e=itr.next();
			if(e.getIzena().equals(pEtsaia.getIzena())){
				aurkitua = true;
			}
		}
		if(!aurkitua){
			throw new BalioEzEgokia();
		}
		return aurkitua;
		
	}
	
	public void etsaiakInprimatu(){
		
		Iterator<Etsaia> itr=this.getIteradorea();
		Etsaia e=null;
		while(itr.hasNext()){
			e=itr.next();
			if(!e.hilda()){
				System.out.println(e.getIzena() + " etsaia");
			}
		}
	}
	
	public ListaEtsaiak etsaiaHildaBadagoKendu(){
		ListaEtsaiak listaBerria=new ListaEtsaiak();
		Iterator<Etsaia> itr=this.getIteradorea();
		Etsaia e=null;
		while(itr.hasNext()){
			e=itr.next();
			if(!e.hilda()){
				listaBerria.etsaiaGehitu(e);
			}
		}
		return listaBerria;
	}
	
	public void etsaiakHilBETATESTER(){
		
		Iterator<Etsaia> itr=this.getIteradorea();
		Etsaia e=null;
		while(itr.hasNext()){
			e=itr.next();
			e.setBizitza(0);
		}
	}
	
	public boolean etsaiaGuztiakHilda(){
		Iterator<Etsaia> itr=this.getIteradorea();
		Etsaia e=null;
		boolean guztiak = true;
		while(itr.hasNext()){
			e=itr.next();
			if(!e.hilda()){
				guztiak = false;
			}	
		}
		return guztiak;
		
	}
	
	public void etsaiakSortu(){
		int etskont = 1;
		ListaPertsonaiak pertson=ListaPertsonaiak.nireListaPertsonaiak();
		Banketxea banketxe = Banketxea.getNireBanketxea();
		while (etskont<=7){
			Random rnd=new Random();
			int rx=rnd.nextInt(16)+2;
			int ry=rnd.nextInt(16)+2;
			if(!ListaGordelekuak.getNireListaGordelekuak().okupatutaDago(rx,ry) && !pertson.okupatutaDago(rx,ry)){
				if(etskont==1){
					Etsaia eA = new Etsaia("A",rx,ry);
					this.etsaiaGehitu(eA);
					banketxe.setEtsaiakMatrizean(rx, ry, eA.getIzena());
				}
				else if(etskont==2){
					Etsaia eB = new Etsaia("B",rx,ry);
					this.etsaiaGehitu(eB);
					banketxe.setEtsaiakMatrizean(rx, ry, eB.getIzena());
				}
				else if(etskont==3){
					Etsaia eC = new Etsaia("C",rx,ry);
					this.etsaiaGehitu(eC);
					banketxe.setEtsaiakMatrizean(rx, ry, eC.getIzena());
				}
				else if(etskont==4){
					Etsaia eD = new Etsaia("D",rx,ry);
					this.etsaiaGehitu(eD);
					banketxe.setEtsaiakMatrizean(rx, ry, eD.getIzena());
				}
				else if(etskont==5){
					Etsaia eE = new Etsaia("E",rx,ry);
					this.etsaiaGehitu(eE);
					banketxe.setEtsaiakMatrizean(rx, ry, eE.getIzena());
				}
				else if(etskont==6){
					Etsaia eF = new Etsaia("F",rx,ry);
					this.etsaiaGehitu(eF);
					banketxe.setEtsaiakMatrizean(rx, ry, eF.getIzena());
				}
				else if(etskont==7){
					Etsaia eG = new Etsaia("G",rx,ry);
					this.etsaiaGehitu(eG);
					banketxe.setEtsaiakMatrizean(rx, ry, eG.getIzena());
				}
				etskont=etskont+1;		
			}
			
		}
	}
}
