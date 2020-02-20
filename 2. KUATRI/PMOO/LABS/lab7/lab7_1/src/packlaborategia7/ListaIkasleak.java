package packlaborategia7;
import java.util.*;

/**
 * @author  aitziber
 */
public class ListaIkasleak
{
	/**
	 * @uml.property  name="lista"
	 */
	private ArrayList<Ikaslea> lista;

	public ListaIkasleak()
	{
		this.lista = new ArrayList<Ikaslea>(); 
	}

	/**
	 * @return
	 * @uml.property  name="lista"
	 */
	private Iterator<Ikaslea> getIteradorea(){
		return this.lista.iterator();
	}
	  	  
	public void gehituIkaslea(Ikaslea pIkaslea)
	{
		this.lista.add(pIkaslea);
	}	

	public void kenduIkaslea(Ikaslea pIkaslea)
	{
		this.lista.remove(pIkaslea);
	}
	 
	public boolean badago(Ikaslea pIkaslea)
	{
		boolean badago = false;
		Iterator<Ikaslea> itr = this.getIteradorea();
		while (itr.hasNext() && !badago){
			Ikaslea ikasle = itr.next();
			if(ikasle==pIkaslea){
				badago = true;
			}
		}
		return badago;
	}

        public int getTamaina()
	{
		return this.lista.size();
	}

	public Ikaslea getIkasleaPos(int pPos){
		int indizea = 0;
		boolean aurkitua = false;
		Ikaslea ikasleBat = null;
		Iterator<Ikaslea> itr = this.getIteradorea();
		while(itr.hasNext() && !aurkitua){
			ikasleBat = itr.next();
			if(indizea < pPos){
				indizea=indizea+1;
			}
			else{
				aurkitua = true;
			}
		}
		if(!aurkitua){
			return null;
		}
		else{
			return ikasleBat;
		}
		
	}
}
