def zerrenda_idatzi(Z):
    print("[ ", end="")
    for i in range(0,len(Z)):
        print(str(Z[i]) + " ", end="")        
    print("]", end="")
    
def kalkulatu_anplitude_max (Zerrenda): 
# aurre:  Zerrendak gutxienez bi elementu izango ditu eta azpizerrenda gorakor batekin hasiko da.
# Post: Emaitza, segmentu luzeenaren luzera izango da. Ez badago segmenturik orduan 0 izango da emaitza

   

def kalkulatu_anplitude_max_proba(): 
   # Programa honek kalkulatu_anplitude_max funtzioari deia egiten dio eta bere portaera egokia den ala ez aztertuko da
    
    Z = [12, 16]
   
    print("Proba 1: bakarrik gorakorra, bi elementukin")
    print("Sarrera honakoa da ", end="")
    zerrenda_idatzi(Z)
    print(". Emaitza 0 izan beharko luke eta zure programak dio: ")
    print(kalkulatu_anplitude_max(Z))
    print()
   
kalkulatu_anplitude_max_proba()

