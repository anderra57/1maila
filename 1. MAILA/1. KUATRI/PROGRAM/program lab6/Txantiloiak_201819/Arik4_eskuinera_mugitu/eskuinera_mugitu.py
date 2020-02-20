def bektorea_idatzi(B):
#Sarrera: osokoen array bat
#Aurre:-
#Irteera: pantailatik arrayaren elementuak erakusten dira
#Post:
    for i in ...
       


def eskuinera_mugitu(B):
#Sarrera: osokoen array bat
#Aurre:-
#Irteera: osokoen array bat
#Post: irteerako arrayak sarrerako arrayaren elementuak ditu, baina poszio bat eskuinera mugituta

   

def nagusia(): 
    #hasieratu
    bektorea1=[1,2,3,4,5,6,7,8,9,10]
 
    print("10 elementutako bektore bat: \n [1,2,3,4,5,6,7,8,9,10]")
    print(" Hasierako elementuak honakoak dira: ")
    bektorea_idatzi(bektorea1)

    print(" elementuak mugitzean, emaitza honakoa da: ")
    bektorea1 = eskuinera_mugitu(bektorea1)
    bektorea_idatzi(bektorea1)
    
    
nagusia()
