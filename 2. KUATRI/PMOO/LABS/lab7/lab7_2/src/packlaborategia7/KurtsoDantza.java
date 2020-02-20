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
		Ikaslea ikas1 = null;
		Ikaslea ikas2 = null;
		ikas1=listaik.bilatuIkasleaNANez(pNAN1);
		ikas2=listaik.bilatuIkasleaNANez(pNAN2);
		Bikotea bik=new Bikotea(ikas1,ikas2);
		if(bik.getMutila()==null || bik.getNeska()==null){
			System.out.println("bikotea ez da atzigarria");
		}
		else{
		listabik.gehituBikoteaModuOrdenatuan(bik);
		}
	}

	public void gehituIkaslea(String pNAN, String pIzena, String pAbizena, int pAdina,  char pSexua){
		if (pSexua=='n' || pSexua== 'N'){
			Neska nesk = new Neska(pNAN, pIzena, pAbizena, pAdina);
			
			ListaIkasleakKurtso lista1 = ListaIkasleakKurtso.getListaIkasleakKurtso();
			
			lista1.gehituIkasleaKurtsoan(nesk);
			
		}
		else if(pSexua=='m' || pSexua== 'M'){
			Mutila mut = new Mutila(pNAN, pIzena, pAbizena, pAdina);
			
			ListaIkasleakKurtso lista1 = ListaIkasleakKurtso.getListaIkasleakKurtso();
			//badago?
			lista1.gehituIkasleaKurtsoan(mut);
			
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
	  nireKurtsoDantza = null;
	  ListaBikoteak lbik = ListaBikoteak.getListaBikoteak();
	  lbik.erreseteatu();
	  ListaIkasleakKurtso likas = ListaIkasleakKurtso.getListaIkasleakKurtso(); 
	  likas.erreseteatu();
	 
	
	  
  }
	
  public void ajustatuBikoteakPreferentzienArabera(){
	  ListaBikoteak lbik = ListaBikoteak.getListaBikoteak();
	  lbik.reajustatuBikoteak();
  }
  
}
