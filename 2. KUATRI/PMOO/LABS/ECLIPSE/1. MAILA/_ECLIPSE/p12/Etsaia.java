package packproiektua;

public class Etsaia {
	
	private int pv;
	private int x;
	private int y;
	private static int atq=5;
	private Banketxea banketxea1;
	private String izena;

	public Etsaia(String pIzena,int pX,int pY){
		this.pv = 100;
		this.izena=pIzena;
		this.x=pX;
		this.y=pY;
	}
	
	public void eraso(){
		int emaitza = Protagonista.getNireProtagonista().getPv();
		//En este metodo, lo qeu haria seria, si nuestro personaje esta cubierto, el etsaia nos va a quitar 0 de vida.
		//Si nuestro personaje no esta cubierto, que nos quite (5 o 10) de vida
		if(Protagonista.getNireProtagonista().estalita()){
			emaitza = Protagonista.getNireProtagonista().getPv();
			Protagonista.getNireProtagonista().setPv(emaitza);
		}
		else{
			emaitza = Protagonista.getNireProtagonista().getPv() - atq;
			Protagonista.getNireProtagonista().setPv(emaitza);
		}
	}
	public boolean hilda(){
		boolean bizirikDago = false;
		if(this.pv <=0){
			bizirikDago = true;
		}
		return bizirikDago;
	}
	public String getIzena(){
		return this.izena;
	}

	
}
