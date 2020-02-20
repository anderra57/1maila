package packlaborategia3;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Data implements IData{
	
	//atributuak
	private int eguna;
	private int hilabetea;
	private int urtea;
	
	
	//eraikitzaileak
	public Data(int pUrtea, int pHilabetea, int pEguna){
		this.eguna = pEguna;
		this.hilabetea = pHilabetea;
		this.urtea = pUrtea;
		
		if (!this.dataZuzenaDa()){
			Calendar c = new GregorianCalendar();
			this.eguna = c.get(Calendar.DATE);
			this.hilabetea = c.get(Calendar.MONTH)+1;
			this.urtea = c.get(Calendar.YEAR);			
		}
		
	}
		
	//beste metodoak

	@Override
	public String toString(){
		String strUrtea = String.format("%04d", this.urtea); 
		String strHilabetea = String.format("%02d", this.hilabetea);
		String strEguna = String.format("%02d", this.eguna);
		
		return strUrtea + "/" + strHilabetea + "/" + strEguna;
	}
	
	
	private boolean dataZuzenaDa(){
		boolean egokia=true;
		if(this.hilabetea<1 || this.hilabetea>12){egokia=false;} 
		if(this.eguna<1 || this.eguna>this.azkenEguna(this.hilabetea)){egokia=false;}
		
		//objektuaren data egokia den ala ez itzultzen du.
		

		//TODO
		return egokia;
	}
	private boolean bisustua (){
		boolean bisustua=false;
		if (((this.urtea % 4==0) && (this.urtea % 100 !=0)) || (this.urtea % 400 ==0)){
			bisustua=true;
		}
		return bisustua;
	}

	@Override
	public void dataGehitu() {
		if (this.eguna==azkenEguna(this.hilabetea)){
			this.eguna=1;
			if (this.hilabetea==12){
				this.hilabetea=1;
				this.urtea=this.urtea+1;
			}
			else {
				this.hilabetea=this.hilabetea+1;
			}
		}
		else{
			this.eguna=this.eguna+1;
		}
	}
	
	@Override
	public void dataKendu() {
		if (this.eguna==1){
			
			if (this.hilabetea==1){
				this.hilabetea=12;
				this.urtea=this.urtea-1;
				this.eguna=31;
			}
			else {
				this.hilabetea=this.hilabetea-1;
				this.eguna=azkenEguna(this.hilabetea);
			}
			
		}
		else{
			this.eguna=this.eguna-1;
		}
	}
	/*
	private int azkenEguna(int pHilabetea){
		//metodo honek hilaabete bakoitzaren azken egun posiblea bueltatzen du, horrela lana murrizteko bestelako metodoetan.
		
		int azkenEguna=0;
		if(pHilabetea==1 || pHilabetea==3 || pHilabetea==5 || pHilabetea==7 || pHilabetea==8 || pHilabetea==10 || pHilabetea==12){
			azkenEguna=31;
		}
		else if(pHilabetea==4 || pHilabetea==6 || pHilabetea==9 || pHilabetea==11){
			azkenEguna=30;
		}
		else if(pHilabetea==2 && bisustua()){
			azkenEguna=29;
		}
		else if(pHilabetea==2 && !bisustua()){
			azkenEguna=28;
		}
			
		return azkenEguna;
	} */
	
	private int azkenEguna(int pHilabetea){
		//metodo honek hilaabete bakoitzaren azken egun posiblea bueltatzen du, horrela lana murrizteko bestelako metodoetan.
		
		int azkenEguna=0;
		
		if(pHilabetea==1){
			azkenEguna=31;
		}	
		else if(pHilabetea==3){
			azkenEguna=31;
		}
		else if(pHilabetea==5){
			azkenEguna=31;
		}
		else if(pHilabetea==7){
			azkenEguna=31;
		}
		else if(pHilabetea==8){
			azkenEguna=31;
		}
		else if(pHilabetea==10){
			azkenEguna=31;
		}
		else if(pHilabetea==12){
			azkenEguna=31;
		}
		
		
		
		else if(pHilabetea==4 || pHilabetea==6 || pHilabetea==9 || pHilabetea==11){
			azkenEguna=30;
		}
		else if(pHilabetea==2 && bisustua()){
			azkenEguna=29;
		}
		else if(pHilabetea==2 && !bisustua()){
			azkenEguna=28;
		}
			
		return azkenEguna;
	}
}
