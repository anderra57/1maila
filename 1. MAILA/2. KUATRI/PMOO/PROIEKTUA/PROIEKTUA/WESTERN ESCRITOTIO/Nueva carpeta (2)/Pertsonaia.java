package packproiektua;

public class Pertsonaia {
	protected int x;
	protected int y;
	protected int pv;
	protected String izena;
	
	public Pertsonaia(String pIzena){
		this.pv=100;
		this.izena=pIzena;
	}
	public void pertsonaiaEguneratu(Akzioa pAkzioa){
		
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public void setKordenatuak(int pX,int pY){
		this.x=pX;
		this.y=pY;
	}
	/*public Pertsonaia hasieratuPertsonaia(){
	}*/
	
}
