package packlaborategia7;

public class Mutila extends Ikaslea
{

	public Mutila(String pNAN, String pIzena, String pAbizena, int pAdina)
	{
		super(pNAN, pIzena, pAbizena, pAdina);
	}
	
	public boolean onartu(Neska pNeska){
		boolean onartu = false;
		if(this.getListaPreferentziak().badago(pNeska)){
			onartu = true;
		}
		return onartu;
	}
	public void gehituPreferentzia(Ikaslea pIkaslea){
		if(!this.getListaPreferentziak().badago(pIkaslea)){
		this.getListaPreferentziak().gehituIkaslea(pIkaslea);
		}
	}
}
