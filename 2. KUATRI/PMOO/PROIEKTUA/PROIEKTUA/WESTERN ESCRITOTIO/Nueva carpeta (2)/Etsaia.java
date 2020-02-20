package packproiektua;

public class Etsaia extends Pertsonaia{
	
	private static int atq=5;

	public Etsaia(String pIzena,int pX,int pY){
		super(pIzena);
		this.pv = 100;
		this.izena=pIzena;
		this.x=pX;
		this.y=pY;
	}
	public int getPv(){
		return this.pv;
	}
	
	public void eraso(){
		Protagonista p = Protagonista.getNireProtagonista();
		//En este metodo, lo qeu haria seria, si nuestro personaje esta cubierto, el etsaia nos va a quitar 0 de vida.
		//Si nuestro personaje no esta cubierto, que nos quite (5 o 10) de vida
		if(p.estalita()){
			//Ez egin ezer
		}
		else{
			Dadoa d=new Dadoa(12);
			d.bota();
			int ga=d.getGoikoAldea();
			if(ga==1 || ga==2 || ga==3){
				p.setPv(p.getPv()-this.atq*1);
			}
			else if(ga==4 || ga==5 || ga==6){
				p.setPv(p.getPv()-this.atq*2);
			}
			else if(ga==7 || ga==8){
				p.setPv(p.getPv()-this.atq*3);
			}
			else if(ga==9){
				p.setPv(p.getPv()-this.atq*4);
			}
			else if(ga==11){
				p.setPv(p.getPv()-this.atq*5);
			}
			else if(ga==12){
				p.setPv(p.getPv()-this.atq*6);
			}
		}
	}
	public boolean hilda(){
		boolean hilda = false;
		if(this.pv <=0){
			hilda = true;
			Banketxea.getNireBanketxea().etsaiaHildaMatrizean(x, y);
		}
		return hilda;
	}
	public String getIzena(){
		return this.izena;
	}
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	public void setBizitza(int pV){
		this.pv=pV;
	}

	
}
