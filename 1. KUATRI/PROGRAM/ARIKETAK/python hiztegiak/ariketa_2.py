def ariketa_2 ():

    hizkiak = {'a':2, 'b':22,'c':222, 'd': 3 , 'e': 33 , 'f':333 , 'g': 4, 'h':44 , 'i': 444}
    hiz= input('Sartu hizkia:  ')

    
    while hiz !='' :    #False produktua string hutsa denean
        if hiz in hizkiak :
            print(str(hizkiak[hiz])+ ' zenbakia sartu beharko duzu')
        else :
            print('hori ez da hizki bat')
        
        hiz= input('Sartu hizkia:  ')
          
    
    
ariketa_2()