package packproiektua;

public abstract class Objetua {
	private String izena;
	
	public Objetua(String pIzena){
		this.izena=pIzena;
	}

	
	public String getIzena(){
		return this.izena;
	}
	
	public abstract void objektuaErabili();
}

