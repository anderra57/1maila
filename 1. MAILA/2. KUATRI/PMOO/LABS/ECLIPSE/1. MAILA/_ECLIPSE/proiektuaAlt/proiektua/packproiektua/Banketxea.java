package packproiektua;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.ArrayList;

public class Banketxea extends Egoera{
	
	private char[][] matrizea;
	private int idEgoera;
	private ListaGordelekuak listagor;
	private static Banketxea nireBanketxea = null;
	private ListaAkzioa lista;
	private ListaEtsaiak listae;
	
	private Banketxea(String pDeskribapena){
		super(pDeskribapena);
		this.matrizea = new char[20][20];
		this.idEgoera=3;
		this.listagor=ListaGordelekuak.getNireListaGordelekuak();
		this.listae=new ListaEtsaiak();
	}
	public static Banketxea getNireBanketxea(){
		if(nireBanketxea==null){
			nireBanketxea = new Banketxea("Banketxea");
		}
		return nireBanketxea;
	}
	
	public ListaGordelekuak gordelekuakSortu(){
		ListaGordelekuak lista = ListaGordelekuak.getNireListaGordelekuak();
		return lista;
		
	}
	public ListaAkzioa getLista(){
		return this.lista.listaAkzioakSortu(3);
		
	}
	
	public void eszenatokiaHasieratu() throws FileNotFoundException, IOException{
		this.matrizea=FitxeroakIrakurri.mapaIrakurri("./fitxategiak/Banketxea/Banketxea.txt");
		this.pertsonaiakHasieratu();
	}
	
	public void eszenatokiaBukatuOndo() throws FileNotFoundException, IOException{
		this.matrizea=FitxeroakIrakurri.mapaIrakurri("./fitxategiak/Banketxea/Banketxea_Bukatuta_ONDO.txt");
		System.out.println();
		System.out.println();
		for (int i=0;i<20;i++) {
			  for (int j=0;j<20;j++) {
				  System.out.print(this.matrizea[i][j]+" ");
			  }
			  System.out.println();
		}
		System.out.println();
		System.out.println();
	}
	
	public void eszenatokiaInprimatu(){
		System.out.println();
		System.out.println();
		for (int i=0;i<20;i++) {
			  for (int j=0;j<20;j++) {
				  System.out.print(this.matrizea[i][j]+" ");
			  }
			  System.out.println();
		}
		System.out.println();
		System.out.println();
	}
	
	
	public void gordelekuakInprimatu(ListaGordelekuak lista1){
		int x = 0;
		int y = 0;
		Gordelekua gordelekua = null;
		Iterator<Gordelekua> itr = lista1.getIteradorea();
		while(itr.hasNext()){
			gordelekua = itr.next();
			x = gordelekua.getX();
			y = gordelekua.getY();
			matrizea[x][y]='%';
		}
	}
	public void setEtsaiakMatrizean(int rx, int ry){
		matrizea[rx][ry]='@';
	}
	
	public void setPertsonaiaMatrizean(){
		Protagonista p = Protagonista.getNireProtagonista();
		int x= p.getX();
		int y=p.getY();
		matrizea[x][y]='#';
	}
	
	public void deletePertsonaiaMatrizetik(int pX, int pY){
		matrizea[pX][pY]=' ';
	}
	public char matrizekoBalioa(int x, int y){
		return matrizea[x][y];
	}
	
	private void pertsonaiakHasieratu(){
		
        
        
    }
}
