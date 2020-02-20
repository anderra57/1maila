package packproiektua;

public class Likorea extends Objetua{
	
	public Likorea(){
		super("Likorea");
	
	}
	public void objektuaErabili(){
		Protagonista p=Protagonista.getNireProtagonista();
		p.setPv(p.getPv()+100);
		
	}
}
