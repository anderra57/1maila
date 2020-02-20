package packproiektua;

public abstract class Objetua {
	private String izena;
	
	public Objetua(String pIzena){
		this.izena=pIzena;
	}

	
	public boolean izenBerdina(String pObjIz){
		boolean berdina = false;
		if(this.izena == pObjIz){
			berdina = true;
		}
		return berdina;
	}
		
}

