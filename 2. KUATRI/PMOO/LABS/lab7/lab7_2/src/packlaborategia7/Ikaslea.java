package packlaborategia7;



/**
 * @author  aitziber
 */
public abstract class Ikaslea
//Galdetu zuen buruei zergaitik den abstraktua

{
  private String nan;

private String izena;

private String abizena;

private int adina;

private ListaIkasleak listaPreferentziak;
    
  public Ikaslea(String pNAN, String pIzena, String pAbizena, int pAdina)
  {
	  this.nan=pNAN;
	  this.izena=pIzena;
	  this.abizena=pAbizena;
	  this.adina=pAdina;
	  this.listaPreferentziak = new ListaIkasleak();
  }

 
  protected ListaIkasleak getListaPreferentziak(){
	return this.listaPreferentziak;
  }


public String getIzena()
  {
	return this.izena;
}


public String getAbizena()
  {
	return this.abizena;
}

 
public int getAdina()
  {
	return this.adina;
}

  public String getNAN()
  {
	return this.nan;
  }
  
  //metodoaren burua behar da nahiz eta ez inplementatu
  public abstract void gehituPreferentzia(Ikaslea pIkaslea);


}
