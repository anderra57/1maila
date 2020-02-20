package packproiektua;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Nagusia {
	
	private char[][] hasmatrix= new char[20][20];
	
	
    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException{
/*
 * 
 * 		JOKOAREN BALIOAK HASIERATU
 *     	
 */
    	
    	int preX;
    	int preY;
    	ListaAkzioa listaAkz = new ListaAkzioa();
    	Saloia saloia = Saloia.getNireSaloia();
    	Hilerria hilerria = Hilerria.getNireHilerria();
    	Banketxea banketxea = Banketxea.getNireBanketxea();
    	saloia.jokoaHasieratu();
    	Protagonista p = Protagonista.getNireProtagonista(); 
/*
 * 
 * 		SALOIA
 * 
 */		//SALOIKO BALIOAK HASIERATU
    	
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
    	Teklatua.getNireTeklatua().emanEnter();    	
/*
 * 
 * 		HILERRIA
 *     	
 */
    	
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
