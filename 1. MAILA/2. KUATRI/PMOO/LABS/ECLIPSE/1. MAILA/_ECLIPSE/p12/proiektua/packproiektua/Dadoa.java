package packproiektua;

import java.util.Random;

public class Dadoa {
    //atributuak
	private int goikoAldea;
    private int aldeKopurua;
    
    //metodo eraikitzaileak
    public Dadoa(int pAldeKopurua){
    	aldeKopurua=pAldeKopurua;
    }
    
    //getters && setters
   
    public void setGoikoAldea(int pGoikoAldea){
    	this.goikoAldea=pGoikoAldea;
    }
    
    public int getGoikoAldea(){
    	return this.goikoAldea;
    }
    
    public int getAldeKopurua(){
    	return this.aldeKopurua;
    }
    
   
    public void bota(){
    	Random zenbakiRandomak=new Random();
    	int egungoBalioa;
    	egungoBalioa=zenbakiRandomak.nextInt(this.getAldeKopurua());
    	this.setGoikoAldea(egungoBalioa);   	
    }   

}
