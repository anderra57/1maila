package packproiektua;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;


public class Mugitu extends Akzioa{
	
	public Mugitu(){
		super("Mugitu",4);
	}
	
	public void mugitu(){
		try{
			ListaAkzioa l = new ListaAkzioa();
			l.setMugitu(true);
			l.setMugitu1(true);
			int lag=noranzkoaLortu();
			Protagonista p=Protagonista.getNireProtagonista();
			Banketxea banketxea = Banketxea.getNireBanketxea();
			int x=p.getX();
			int y=p.getY();
			if(lag==1){
				if(y+1<=18){
					if(y==17) {
						System.out.println("Sartu duzun balioa ez da egokia...");
						p.posizioazAldatu(x,y);
						System.out.println();
						System.out.println("Berriro galdetuko dizut, norantz nahi duzu mugitu?");
						System.out.println("> W < gorantz joateko");
						System.out.println("> A < ezkerrerantz joateko");
						System.out.println("> S < beherentzat joateko");
						System.out.println("> D < eskuineranz joateko");
						this.mugitu();
					}
					else if((banketxea.matrizekoBalioa(x, y+1)=='%')||(banketxea.matrizekoBalioa(x, y+1)=='@')||(banketxea.matrizekoBalioa(x, y+1)=='X')){
						System.out.println("Ezin zara hortik pasa...");
						p.posizioazAldatu(x,y);
						System.out.println();
						System.out.println("Berriro galdetuko dizut, norantz nahi duzu mugitu?");
						System.out.println("> W < gorantz joateko");
						System.out.println("> A < ezkerrerantz joateko");
						System.out.println("> S < beherentzat joateko");
						System.out.println("> D < eskuineranz joateko");
						this.mugitu();
					}
					else if((banketxea.matrizekoBalioa(x, y+1)=='A')||(banketxea.matrizekoBalioa(x, y+1)=='B')||
							(banketxea.matrizekoBalioa(x, y+1)=='C')||(banketxea.matrizekoBalioa(x, y+1)=='D')||
							(banketxea.matrizekoBalioa(x, y+1)=='E')||(banketxea.matrizekoBalioa(x, y+1)=='F')||
							(banketxea.matrizekoBalioa(x, y+1)=='G')){
						System.out.println("Ezin zara etsai baten gainean kokatu...");
						p.posizioazAldatu(x,y);
						System.out.println();
						System.out.println("Berriro galdetuko dizut, norantz nahi duzu mugitu?");
						System.out.println("> W < gorantz joateko");
						System.out.println("> A < ezkerrerantz joateko");
						System.out.println("> S < beherentzat joateko");
						System.out.println("> D < eskuineranz joateko");
						this.mugitu();
					}
					else{
					p.posizioazAldatu(x,y+1);
					}
				}
			}
			else{
				if(lag==2){
					if(y-1>=1){
						if(y==2) {
							System.out.println("Sartu duzun balioa ez da egokia...");
							p.posizioazAldatu(x,y);
							System.out.println();
							System.out.println("Berriro galdetuko dizut, norantz nahi duzu mugitu?");
							System.out.println("> W < gorantz joateko");
							System.out.println("> A < ezkerrerantz joateko");
							System.out.println("> S < beherentzat joateko");
							System.out.println("> D < eskuineranz joateko");
							this.mugitu();
						}
						else if((banketxea.matrizekoBalioa(x, y+1)=='%')||(banketxea.matrizekoBalioa(x, y+1)=='@')||(banketxea.matrizekoBalioa(x, y+1)=='X')){
							System.out.println("Ezin zara hortik pasa...");
							p.posizioazAldatu(x,y);
							System.out.println();
							System.out.println("Berriro galdetuko dizut, norantz nahi duzu mugitu?");
							System.out.println("> W < gorantz joateko");
							System.out.println("> A < ezkerrerantz joateko");
							System.out.println("> S < beherentzat joateko");
							System.out.println("> D < eskuineranz joateko");
							this.mugitu();
						}
						else if((banketxea.matrizekoBalioa(x, y-1)=='A')||(banketxea.matrizekoBalioa(x, y-1)=='B')||
								(banketxea.matrizekoBalioa(x, y-1)=='C')||(banketxea.matrizekoBalioa(x, y-1)=='D')||
								(banketxea.matrizekoBalioa(x, y-1)=='E')||(banketxea.matrizekoBalioa(x, y-1)=='F')||
								(banketxea.matrizekoBalioa(x, y-1)=='G')){
							System.out.println("Ezin zara etsai baten gainean kokatu...");
							p.posizioazAldatu(x,y);
							System.out.println();
							System.out.println("Berriro galdetuko dizut, norantz nahi duzu mugitu?");
							System.out.println("> W < gorantz joateko");
							System.out.println("> A < ezkerrerantz joateko");
							System.out.println("> S < beherentzat joateko");
							System.out.println("> D < eskuineranz joateko");
							this.mugitu();
						}
						else{
						p.posizioazAldatu(x,y-1);
						}
					}
				}
				else{
					if(lag==3){
						if(x-1>=1){
							if(x==2) {
								System.out.println("Sartu duzun balioa ez da egokia...");
								p.posizioazAldatu(x,y);
								System.out.println();
								System.out.println("Berriro galdetuko dizut, norantz nahi duzu mugitu?");
								System.out.println("> W < gorantz joateko");
								System.out.println("> A < ezkerrerantz joateko");
								System.out.println("> S < beherentzat joateko");
								System.out.println("> D < eskuineranz joateko");
								this.mugitu();
							}
							else if((banketxea.matrizekoBalioa(x, y+1)=='%')||(banketxea.matrizekoBalioa(x, y+1)=='@')||(banketxea.matrizekoBalioa(x, y+1)=='X')){
								System.out.println("Ezin zara hortik pasa...");
								p.posizioazAldatu(x,y);
								System.out.println();
								System.out.println("Berriro galdetuko dizut, norantz nahi duzu mugitu?");
								System.out.println("> W < gorantz joateko");
								System.out.println("> A < ezkerrerantz joateko");
								System.out.println("> S < beherentzat joateko");
								System.out.println("> D < eskuineranz joateko");
								this.mugitu();
							}
							else if((banketxea.matrizekoBalioa(x-1, y)=='A')||(banketxea.matrizekoBalioa(x-1, y)=='B')||
									(banketxea.matrizekoBalioa(x-1, y)=='C')||(banketxea.matrizekoBalioa(x-1, y)=='D')||
									(banketxea.matrizekoBalioa(x-1, y)=='E')||(banketxea.matrizekoBalioa(x-1, y)=='F')||
									(banketxea.matrizekoBalioa(x-1, y)=='G')){
								System.out.println("Ezin zara etsai baten gainean kokatu...");
								p.posizioazAldatu(x,y);
								System.out.println();
								System.out.println("Berriro galdetuko dizut, norantz nahi duzu mugitu?");
								System.out.println("> W < gorantz joateko");
								System.out.println("> A < ezkerrerantz joateko");
								System.out.println("> S < beherentzat joateko");
								System.out.println("> D < eskuineranz joateko");
								this.mugitu();
							}
							else{
							p.posizioazAldatu(x-1,y);
							}
						}
					}
					else{
						if(x+1<=18){
							if(x==17) {
								System.out.println("Sartu duzun balioa ez da egokia...");
								p.posizioazAldatu(x,y);
								System.out.println();
								System.out.println("Berriro galdetuko dizut, norantz nahi duzu mugitu?");
								System.out.println("> W < gorantz joateko");
								System.out.println("> A < ezkerrerantz joateko");
								System.out.println("> S < beherentzat joateko");
								System.out.println("> D < eskuineranz joateko");
								this.mugitu();
							}
							else if((banketxea.matrizekoBalioa(x, y+1)=='%')||(banketxea.matrizekoBalioa(x, y+1)=='@')||(banketxea.matrizekoBalioa(x, y+1)=='X')){
								System.out.println("Ezin zara hortik pasa...");
								p.posizioazAldatu(x,y);
								System.out.println();
								System.out.println("Berriro galdetuko dizut, norantz nahi duzu mugitu?");
								System.out.println("> W < gorantz joateko");
								System.out.println("> A < ezkerrerantz joateko");
								System.out.println("> S < beherentzat joateko");
								System.out.println("> D < eskuineranz joateko");
								this.mugitu();
							}
							else if((banketxea.matrizekoBalioa(x+1, y)=='A')||(banketxea.matrizekoBalioa(x+1, y)=='B')||
									(banketxea.matrizekoBalioa(x+1, y)=='C')||(banketxea.matrizekoBalioa(x+1, y)=='D')||
									(banketxea.matrizekoBalioa(x+1, y)=='E')||(banketxea.matrizekoBalioa(x+1, y)=='F')||
									(banketxea.matrizekoBalioa(x+1, y)=='G')){
								System.out.println("Ezin zara etsai baten gainean kokatu...");
								p.posizioazAldatu(x,y);
								System.out.println();
								System.out.println("Berriro galdetuko dizut, norantz nahi duzu mugitu?");
								System.out.println("> W < gorantz joateko");
								System.out.println("> A < ezkerrerantz joateko");
								System.out.println("> S < beherentzat joateko");
								System.out.println("> D < eskuineranz joateko");
								this.mugitu();
							}
							else{
							p.posizioazAldatu(x+1,y);
							}
						}
					}
				}
			}
		}
		catch(BalioEzEgokia lag){
			System.out.println("Sartu duzun balioa ez da egokia...");
		}
	}
	
	private int noranzkoaLortu() throws BalioEzEgokia{
		char lag=Teklatua.getNireTeklatua().irakurriChar();
		int emaitza=0;
		if((lag=='D')||(lag=='d')){
			emaitza=1;
		}
		else{
			if((lag=='A')||(lag=='a')){
				emaitza=2;
			}
			else{
				if((lag=='W')||(lag=='w')){
					emaitza=3;
				}
				else{
					if((lag=='S')||(lag=='s')){
						emaitza=4;
					}
					else {
						throw new BalioEzEgokia();
					}
				}
			}
		}
		return emaitza;
	}
}
