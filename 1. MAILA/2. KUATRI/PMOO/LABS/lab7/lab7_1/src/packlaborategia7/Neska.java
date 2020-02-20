package packlaborategia7;

public class Neska extends Ikaslea
{
	public Neska(String pNAN, String pIzena, String pAbizena, int pAdina)
	{
		super(pNAN,pIzena,pAbizena,pAdina);
	}
	
	public void gehituPreferentzia(Ikaslea pIkaslea){
		if(!this.getListaPreferentziak().badago(pIkaslea)){
			this.getListaPreferentziak().gehituIkaslea(pIkaslea);
		}
	}

	public Mutila enparejatu(ListaIkasleak pMutilAtzigarriak){
		Mutila ikasleBat = null;
	
			return (Mutila)ikasleBat;
	}

}
