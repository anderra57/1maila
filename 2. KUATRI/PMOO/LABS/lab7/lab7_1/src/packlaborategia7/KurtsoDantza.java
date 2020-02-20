package packlaborategia7;

/**
 * @author  aitziber
 */
public class KurtsoDantza{
	
	private static KurtsoDantza nireKurtsoDantza = null;

	/**
	 Singleton patroia aplikatu eraikitzailea, instantzia bakarraren get-a eta instantzia gordetzeko atributua ezarriz
	 */
	private KurtsoDantza(){
		
	}
	
	public static KurtsoDantza getKurtsoDantza(){
		if(nireKurtsoDantza == null){
			nireKurtsoDantza = new KurtsoDantza();
		}
		return nireKurtsoDantza;
	}
	

	public void inskribatuBikotea(String pNAN1, String pNAN2){
		//this.inskribatuBikotea(pNAN1, pNAN2);
		ListaIkasleakKurtso listaik=ListaIkasleakKurtso.getListaIkasleakKurtso();
		ListaBikoteak listabik=ListaBikoteak.getListaBikoteak();
		Ikaslea ikas1=listaik.bilatuIkasleaNANez(pNAN1);
		Ikaslea ikas2=listaik.bilatuIkasleaNANez(pNAN2);
		Bikotea bik=new Bikotea(ikas1,ikas2);
		listabik.gehituBikoteaModuOrdenatuan(bik);
	}

	public void gehituIkaslea(String pNAN, String pIzena, String pAbizena, int pAdina,  char pSexua){
		if (pSexua=='n'){
			Neska nesk=new Neska(pNAN, pIzena, pAbizena, pAdina);
			ListaIkasleakKurtso lista=ListaIkasleakKurtso.getListaIkasleakKurtso();
			//badago?
			lista.gehituIkasleaKurtsoan(nesk);
		}
		else if(pSexua=='m'){
			Mutila mut=new Mutila(pNAN, pIzena, pAbizena, pAdina);
			ListaIkasleakKurtso lista=ListaIkasleakKurtso.getListaIkasleakKurtso();
			//badago?
			lista.gehituIkasleaKurtsoan(mut);
		}
	}
  
  public void gehituPreferentzia(String pIdNor, String pIdBerePreferentzia){
	  //this.gehituPreferentzia(pIdNor, pIdBerePreferentzia);
	  ListaIkasleakKurtso lista=ListaIkasleakKurtso.getListaIkasleakKurtso();
	  Ikaslea ikas1=lista.bilatuIkasleaNANez(pIdNor);
	  Ikaslea ikas2=lista.bilatuIkasleaNANez(pIdBerePreferentzia);
	  ikas1.gehituPreferentzia(ikas2);
  }
  
  public void hasieratuKurtsoa(){
	  //this.hasieratuKurtsoa();
	  this.nireKurtsoDantza =null;
  }
	
  public void ajustatuBikoteakPreferentzienArabera(){
	  this.ajustatuBikoteakPreferentzienArabera();
  }
  
}
