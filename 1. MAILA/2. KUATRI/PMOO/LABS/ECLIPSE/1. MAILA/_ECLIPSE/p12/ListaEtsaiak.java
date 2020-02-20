package packproiektua;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ListaEtsaiak {
	
	private ArrayList<Etsaia> lista;
	
	public ListaEtsaiak(){
		this.lista = new ArrayList<Etsaia>();
	}
	private Iterator<Etsaia> getIteradorea(){
		return this.lista.iterator();
	}
	private void etsaiaGehitu(Etsaia pEtsaia){
		this.lista.add(pEtsaia);
	}
	
	public void etsaiakInprimatu(){
		Iterator<Etsaia> itr=this.getIteradorea();
		Etsaia e=null;
		while(itr.hasNext()){
			e=itr.next();
			System.out.println(e.getIzena() + " etsaia");
			
		}
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
				}
				else if(etskont==2){
					Etsaia eB = new Etsaia("B",rx,ry);
					this.etsaiaGehitu(eB);
				}
				else if(etskont==3){
					Etsaia eC = new Etsaia("C",rx,ry);
					this.etsaiaGehitu(eC);
				}
				else if(etskont==4){
					Etsaia eD = new Etsaia("D",rx,ry);
					this.etsaiaGehitu(eD);
				}
				else if(etskont==5){
					Etsaia eE = new Etsaia("E",rx,ry);
					this.etsaiaGehitu(eE);
				}
				else if(etskont==6){
					Etsaia eF = new Etsaia("F",rx,ry);
					this.etsaiaGehitu(eF);
				}
				else if(etskont==7){
					Etsaia eG = new Etsaia("G",rx,ry);
					this.etsaiaGehitu(eG);
				}
				
				banketxe.setEtsaiakMatrizean(rx, ry);
				etskont=etskont+1;		
			}
			
		}
	}
}
