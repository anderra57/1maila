package packlaborategia7;
import java.util.*;

/**
 * @author  aitziber
 */
public class ListaBikoteak
{
	//eraikitzailea eta dena Singleton patroia aplikatuz
	private ArrayList<Bikotea> lista;
	private static ListaBikoteak nireListaBikoteak = null;
	
	private ListaBikoteak(){
		this.lista = new ArrayList<Bikotea>();
	}
	
		
	public static ListaBikoteak getListaBikoteak(){
		if(nireListaBikoteak == null){
			nireListaBikoteak = new ListaBikoteak();
		}
		return nireListaBikoteak;
	}		

		private void setListaBikoteak(ArrayList<Bikotea> pLista) {
			this.lista = pLista;
			
		}
		
		private Iterator<Bikotea> getIteradorea(){
			return this.lista.iterator();
		}
		
		private int bilatuTxertatzekoPos(int pAdina){
			int posizioa=0;
            Iterator<Bikotea> itr = this.getIteradorea();
            boolean aurkitua = false;
            Bikotea bikot=null;
            while (itr.hasNext() && !aurkitua){
                bikot=itr.next();
                if (bikot.getNeska().getAdina()>=pAdina){
                    aurkitua=true;
                }
                else{
                	posizioa=posizioa+1;
                }
            }
            return posizioa;
        }


		// aurre: bikoteen zerrenda, neskaren adinaren arabera ordenatuta dago
		// post: bikote bat gehitu da neskaren adinaren arabera txartatuz
		public void gehituBikoteaModuOrdenatuan(Bikotea pBikotea){
			Iterator<Bikotea> itr = this.getIteradorea();
			Bikotea bikot = null;
			int pos = 0;
			while(pos < this.bilatuTxertatzekoPos(pBikotea.getNeska().getAdina())){
				bikot = itr.next();
				pos = pos+1;
			}
				this.lista.add(pBikotea);
			}
			// bilatu txeratzeko posizioa
		//TODO
			// txertatu
		//TODO
			
		

		

		public Ikaslea lortuHonenBikotea(Ikaslea pIkaslea){
			Iterator<Bikotea> itr = this.getIteradorea();
			boolean topatua = false;
			Ikaslea ikasle = null;
			Bikotea bikot = null;
			while(itr.hasNext() && !topatua){
				bikot = itr.next();
				if(bikot.badago(pIkaslea) && pIkaslea instanceof Neska){
					ikasle = bikot.getMutila();
					topatua = true;
				}
				else if(bikot.badago(pIkaslea) && pIkaslea instanceof Mutila){
					ikasle = bikot.getNeska();
					topatua = true;
				}
			}
			if(!topatua){
				System.out.println("Ikasle horrek ez du bikoterik");
			}
			return ikasle;
			
			
		   //TODO
		}
		
		public void reajustatuBikoteak()
		{
		boolean posibleDa=true;
		ArrayList<Bikotea> bikoteakAux=new ArrayList<Bikotea>();
		ListaIkasleak mutilAtzigarriak= this.sortuBakarrikMutilenLista();
		Iterator<Bikotea> it = ListaBikoteak.getListaBikoteak().getIteradorea();
		
		while (it.hasNext() && posibleDa){
			Bikotea bikoteBat = it.next();
			Neska unekoN = bikoteBat.getNeska();
			Mutila unekoM = unekoN.enparejatu(mutilAtzigarriak);
		
		if (unekoM != null){
			Bikotea p1 = new Bikotea(unekoN, unekoM);
			bikoteakAux.add(p1);
			mutilAtzigarriak.kenduIkaslea(unekoM);
		}
		else{
			posibleDa = false;
		}}
		if (posibleDa){
			this.setListaBikoteak(bikoteakAux);
		}
		else{
			System.out.println("Ezin izan da bikote berriak sortu");
		}}

		private ListaIkasleak sortuBakarrikMutilenLista(){
			Iterator<Bikotea> itr = ListaBikoteak.getListaBikoteak().getIteradorea();
			ListaIkasleak emaitza = new ListaIkasleak();
			Bikotea bikot = null;
			Mutila mutila1 = null;
			while(itr.hasNext()){
				bikot = itr.next();
				mutila1 = bikot.getMutila();
				emaitza.gehituIkaslea(mutila1);
			}
			return emaitza;
		}

		public void erreseteatu(){
			this.lista.clear();	
		}
}

