package packproiektua;

public class Kapela extends Objetua{
	
	
	public Kapela(){
		super("Kapela");
		
	}
	
	public void objektuaErabili(){
		Protagonista p=Protagonista.getNireProtagonista();
		p.setPv(p.getPv()+50);
	}
	
}