package packlaborategia7;

/**
 * @author  aitziber
 */
public class Bikotea
{
 
private Neska neska;

private Mutila mutil;
	
  public Bikotea(Ikaslea pIkaslea1, Ikaslea pIkaslea2)
  {
	 // partaideen ordena edozien izan daiteke
	  
	  if ((pIkaslea1 instanceof Mutila && pIkaslea2 instanceof Neska) ||(pIkaslea2 instanceof Mutila && pIkaslea1 instanceof Neska))
	  {
		  if(pIkaslea1 instanceof Mutila && pIkaslea2 instanceof Neska){
			  this.mutil = (Mutila)pIkaslea1;
		  	  this.neska = (Neska)pIkaslea2;
	      }
	      else{
		      this.neska = (Neska)pIkaslea1;
		      this.mutil = (Mutila)pIkaslea2;
		     
	      }
        }
		else
		  {
		  //TODO
		  System.out.println("Ezin da bikotea sortu");
		}
  }

  /**
 * @return
 * @uml.property  name="neska"
 */
public Neska getNeska()
  {
	return neska;
}

  public Mutila getMutila()
  {
	return mutil;
  }

public boolean badago(Ikaslea pIkaslea){
	boolean emaitza = false;
	if(pIkaslea instanceof Mutila && this.mutil == pIkaslea){
		emaitza = true;
	}
	else if(pIkaslea instanceof Neska && this.neska == pIkaslea){
		emaitza = true;
	}
    return emaitza;
}


}
