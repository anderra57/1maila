package packlaborategia3;

//import packlaborategia3;

public class Zatikia implements IZatikia
{       //atributuak
	private int zenbakitzailea;
	private int izendatzailea;
	
	public Zatikia(int pZenb, int pIzen)
	{
		if (pIzen!=0){
			this.zenbakitzailea=pZenb;
			this.izendatzailea=pIzen;
		}
		else
		{
			System.out.println("Ezin daiteke izendatzailearen balioa 0 izan dezakeen zatikirik sortu ...");
		}
	}
		
	// metodo hau ezkutatzea komeni da, pribatua egitea!
	private int zkh()
	{
	int zkh=1;
	int i=1;
		while(i<=this.izendatzailea || i<=this.zenbakitzailea){
			if(this.zenbakitzailea%i==0 && this.izendatzailea%i==0){
				zkh=i;
			}
			i++;
		}
	return zkh;		
	}
	
	public void sinplifikatu()
	{
		int zkh=this.zkh();
		this.zenbakitzailea=this.zenbakitzailea/zkh;
		this.izendatzailea=this.izendatzailea/zkh;
		if (this.izendatzailea<0){
			this.izendatzailea=Math.abs(this.izendatzailea);
			this.zenbakitzailea=-(this.zenbakitzailea);
		}
	}
		
	public Zatikia gehitu(Zatikia pZat2)
	{
		pZat2.sinplifikatu();
		int emaitzaIzendatzailea=this.izendatzailea*pZat2.izendatzailea;
		int emaitzaZenbakitzailea=(this.zenbakitzailea*pZat2.izendatzailea)+(pZat2.zenbakitzailea*this.izendatzailea);
		Zatikia emaitza= new Zatikia(emaitzaZenbakitzailea,emaitzaIzendatzailea);
		emaitza.sinplifikatu();
		return emaitza;
	}
	
	
	public Zatikia kendu(Zatikia pZat2)
	{
		pZat2.sinplifikatu();
		int emaitzaIzendatzailea=this.izendatzailea*pZat2.izendatzailea;
		int emaitzaZenbakitzailea=(this.zenbakitzailea*pZat2.izendatzailea)-(pZat2.zenbakitzailea*this.izendatzailea);
		Zatikia emaitza= new Zatikia(emaitzaZenbakitzailea,emaitzaIzendatzailea);
		emaitza.sinplifikatu();
		return emaitza;
	}
	
	public Zatikia biderkatu(Zatikia pZat2)
	{
		int emaitzaIzendatzailea=this.izendatzailea*pZat2.izendatzailea;
		int emaitzaZenbakitzailea=this.zenbakitzailea*pZat2.zenbakitzailea;
		Zatikia emaitza= new Zatikia(emaitzaZenbakitzailea,emaitzaIzendatzailea);
		emaitza.sinplifikatu();
		return emaitza;
	}
	
	public Zatikia zatitu(Zatikia pZat2){
		int emaitzaZenbakitzailea=this.zenbakitzailea*pZat2.izendatzailea;
		int emaitzaIzendatzailea=this.izendatzailea*pZat2.zenbakitzailea;
		Zatikia emaitza= new Zatikia(emaitzaZenbakitzailea,emaitzaIzendatzailea);
		emaitza.sinplifikatu();
		return emaitza;
	}
	
	 
	 
	public boolean berdinaDa(Zatikia pZat2)
	{
		boolean berdina=false;
		this.sinplifikatu();
		pZat2.sinplifikatu();
		if (this.zenbakitzailea==pZat2.zenbakitzailea && this.izendatzailea==pZat2.izendatzailea){
			berdina=true;
		}
		return berdina;
	}
			
	public boolean handiagoaDa(Zatikia pZat2)
	{
		boolean handiagoa=false;
		this.sinplifikatu();
		pZat2.sinplifikatu();
		if (this.zenbakitzailea*pZat2.izendatzailea>pZat2.zenbakitzailea*this.izendatzailea){
			handiagoa=true;
		}
		else if (this.zenbakitzailea>0 && pZat2.izendatzailea==0){
			handiagoa=true;
		}
		return handiagoa;
	}
	
	
	public boolean txikiagoaDa(Zatikia pZat2)
	{
		boolean txikiagoa=false;
		this.sinplifikatu();
		pZat2.sinplifikatu();
		if (this.zenbakitzailea*pZat2.izendatzailea<pZat2.zenbakitzailea*this.izendatzailea){
			txikiagoa=true;
		}
		else if (this.zenbakitzailea<0 && pZat2.izendatzailea==0){
			txikiagoa=true;
		}
		return txikiagoa;
	}
	
	
    public boolean izendatzaileBerdinaDu(Zatikia pZat){
    	boolean emaitza=false;
		if (this.izendatzailea==pZat.izendatzailea){emaitza=true;}
		return emaitza;
	}	
    public boolean zenbakitzaileBerdinaDu(Zatikia pZat){
    	boolean emaitza=false;
		if (this.zenbakitzailea==pZat.zenbakitzailea){emaitza=true;}
		return emaitza;
	}	
    
    public int getZenbakitzailea(){
    	return this.zenbakitzailea;
    }
    
    public int getIzendatzailea(){
    	return this.izendatzailea;
    }
}
