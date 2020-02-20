package packproiektua;

public class Protagonista {
	private Ona atributuak;
	private Protagonista nireProtagonista = null;
	
	private Protagonista(Ona pAtributuak){
		this.atributuak=pAtributuak;
	}
	public Protagonista nireProtagonista(){
		if(nireProtagonista == null){
			nireProtagonista = new Protagonista(Ona pAtributuak);
		}
		return nireProtagonista;
	}
	public void objetuaErabili(int pObjIz){
		
	}
	
}
