package packproiektua;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.io.*;

public class Nagusia {
	
	private char[][] hasmatrix= new char[20][20];
	
	
    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException{
    	
    	InputStream stream = Nagusia.class.getResourceAsStream("/S.txt"); //solo pprintea
    	InputStream streams = Nagusia.class.getResourceAsStream("S.txt");
    	System.out.println("Primer print");
        System.out.println(stream != null);
        System.out.println(streams != null);
        
        
        stream = Nagusia.class.getClassLoader().getResourceAsStream("/Hasiera_mx.txt");
        streams = Nagusia.class.getClassLoader().getResourceAsStream("/fitxategiak/Hasiera_mx.txt");
        System.out.println("Segundo print");
        System.out.println(stream != null);
        System.out.println(streams != null);
        

        stream = Nagusia.class.getClassLoader().getResourceAsStream("/Aurkezpena.txt");
        stream = Nagusia.class.getClassLoader().getResourceAsStream("Hasiera_mx8.txt");
        System.out.println("tercer print");
        System.out.println(stream != null);
        
        streams = Nagusia.class.getClassLoader().getResourceAsStream("/Aurkezpena.txt");
        System.out.println("aurk print");
        System.out.println(stream != null);
        System.out.println(streams != null);
        
        Saloia saloia = Saloia.getNireSaloia();
        saloia.jokoaHasieratu();
    	
    	
    	
/*
 * 
 * 		JOKOAREN BALIOAK HASIERATU
 *     	
 */
    	/*
    	int preX;
    	int preY;
    	ListaAkzioa listaAkz = new ListaAkzioa();
    	Saloia saloia = Saloia.getNireSaloia();
    	Hilerria hilerria = Hilerria.getNireHilerria();
    	Banketxea banketxea = Banketxea.getNireBanketxea();
    	saloia.jokoaHasieratu();
    	Protagonista p = Protagonista.getNireProtagonista(); */
/*
 * 
 * 		SALOIA
 * 
 */		//SALOIKO BALIOAK HASIERATU
    	/*
    	saloia.eszenatokiaHasieratu();
    	p.hasierakoPosizioa(1);
    	ListaAkzioa listaAkzS=listaAkz.listaAkzioakSortu(1);
    	
    	//SALOIA EGOERA    
    	while(!listaAkz.bukatutaSaloia()){
    	saloia.eszenatokiaInprimatu();
    	preX=p.getX();
    	preY=p.getY();
    	listaAkzS.akzioaAukeratuEtaBurutu(1);
    	Teklatua.getNireTeklatua().emanEnter();
    	saloia.deletePertsonaiaMatrizetik(preX, preY);
    	saloia.setPertsonaiaMatrizean();
    	}
    	
    	//EGOERAZ ALDATU
    	saloia.eszenatokiaBukatu();
    	Teklatua.getNireTeklatua().emanEnter();    	*/
/*
 * 
 * 		HILERRIA
 *     	
 */
    	/*
    	hilerria.eszenatokiaHasieratu();
    	p.hasierakoPosizioa(2);
    	ListaAkzioa listaAkzH=listaAkz.listaAkzioakSortu(2);
    	
        
    	while(!listaAkz.bukatutaHilerria()){
    	hilerria.eszenatokiaInprimatu();
    	preX=p.getX();
    	preY=p.getY();
    	listaAkzH.akzioaAukeratuEtaBurutu(2);
    	Teklatua.getNireTeklatua().emanEnter();
    	hilerria.deletePertsonaiaMatrizetik(preX, preY);
    	hilerria.setPertsonaiaMatrizean();
    	}
    	
    	hilerria.eszenatokiaBukatu();
    	Teklatua.getNireTeklatua().emanEnter();
    	
   	*/
/*
    	ListaEtsaiak listae = new ListaEtsaiak();
    	
    	banketxea.eszenatokiaHasieratu();
    	p.hasierakoPosizioa(3);
    	ListaAkzioa listaAkzB=listaAkz.listaAkzioakSortu(3);
    	
        
    	while(!listaAkz.bukatutaBanketxea()){
    		banketxea.eszenatokiaInprimatu();
    		preX=p.getX();
    		preY=p.getY();
    		listaAkzB.akzioaAukeratuEtaBurutu(3);
    		Teklatua.getNireTeklatua().emanEnter();
    		banketxea.deletePertsonaiaMatrizetik(preX, preY);
    		banketxea.setPertsonaiaMatrizean();
    	}
    	
    	banketxea.eszenatokiaBukatuOndo();
    	Teklatua.getNireTeklatua().emanEnter();
    */
    	
    }

}
