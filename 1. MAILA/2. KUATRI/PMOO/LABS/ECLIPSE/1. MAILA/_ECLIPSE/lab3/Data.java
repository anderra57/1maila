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
		
		//objektuaren data egokia den ala ez itzultzen du.
		
		boolean egokia=true;
		//TODO
		return egokia;
	}
	private boolean bisustua (){
		boolean bisustua=false;
		//TODO
		return bisustua;
	}

	@Override
	public void dataGehitu() {
	    //TODO
	}
	
	@Override
	public void dataKendu() {
	    //TODO
	}
	
	private int azkenEguna(int pHilabetea){
		//metodo honek hilaabete bakoitzaren azken egun posiblea bueltatzen du, horrela lana murrizteko bestelako metodoetan.
		
		int azkenEguna;
		//TODO
		return azkenEguna;
	}
}
