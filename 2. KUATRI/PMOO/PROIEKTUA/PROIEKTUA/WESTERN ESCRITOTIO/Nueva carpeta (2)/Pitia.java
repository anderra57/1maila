package packproiektua;

public class Pitia extends Objetua{

	public Pitia(){
		super("Pitia");
	}
	
	public void objektuaErabili(){
		Protagonista p=Protagonista.getNireProtagonista();
		p.setPv(p.getPv()+10);
		
	}
	
}
