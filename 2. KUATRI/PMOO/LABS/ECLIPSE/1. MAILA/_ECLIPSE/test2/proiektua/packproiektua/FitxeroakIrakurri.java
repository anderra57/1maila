package packproiektua;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
//
import java.lang.*;
import java.io.*;

public class FitxeroakIrakurri {
	
	private static FitxeroakIrakurri nireFitxeroakIrakurri = null;
	
	public FitxeroakIrakurri(){
		
	}
	
	private static FitxeroakIrakurri getNireFitxeroakIrakurri(){
		if(nireFitxeroakIrakurri==null){
			nireFitxeroakIrakurri=new FitxeroakIrakurri();
		}
		return nireFitxeroakIrakurri;
	}
	
	public static void fitxeroaErakutsi(String pFitxeroa) throws FileNotFoundException, IOException{
		String katea;
		//FileReader f=new FileReader(pFitxeroa,"UTF-8");
		InputStreamReader f=new InputStreamReader(new FileInputStream("./fitxategiak/" + pFitxeroa), "UTF-8");
		BufferedReader b=new BufferedReader(f);
		b.skip(1);
		while((katea=b.readLine())!=null){
			System.out.println(katea);
		}
		b.close();
	}
	
	public static char[][] mapaIrakurri(String pFitxeroa) throws FileNotFoundException, IOException{
		char[][] matrizea = new char[20][20];
		//FileReader f=new FileReader(pFitxeroa,"UTF-8");
		//InputStream in = this.getClass().getClassLoader().getResourceAsStream("SomeTextFile.txt");
		//InputStream is = new FileInputStream("./fitxategiak/" + pFitxeroa);
		//getResourceAsStream("./fitxategiak/" + pFitxeroa);
		//InputStreamReader f=new InputStreamReader(is, "UTF-8");
		//BufferedReader b=new BufferedReader(f);
		//b.skip(1);
		
		
		InputStream stream = FitxeroakIrakurri.class.getResourceAsStream(pFitxeroa);
		//InputStream stream = FitxeroakIrakurri.class.getClassLoader().getResourceAsStream(pFitxeroa);
		
		System.out.println("mapairakurrin:");
		System.out.println(pFitxeroa);
		System.out.println(stream!=null);
		InputStreamReader f=new InputStreamReader(stream, "UTF-8");
		BufferedReader b=new BufferedReader(f);
		
		
		for (int i=0;i<20;i++) {
			  for (int j=0;j<20;j++) {
				  char c = (char)b.read();
				  matrizea[i][j]=c;
						  
			  }
		}
		b.close();
		return matrizea;
	}
}
