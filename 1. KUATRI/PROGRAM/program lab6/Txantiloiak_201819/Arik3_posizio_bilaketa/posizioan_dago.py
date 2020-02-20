def posizioan_dago(x,bek):
   

def nagusia():
    bektore1 = [1, 3, 5, 17, 9, 11, 131, 15, 170, 19]
    print("1. kasua: balioa erdian dago")
    print(" posizioan_dago(131, (1, 3, 5, 17, 9, 11, 131, 15, 170, 19))")
    print(" 7 izan behar da, eta emaitza da: ")

    ema, posi=posizioan_dago(131,bektore1)
    if (ema==True):
        print("131 zenbakia" +str(posi)+"posizioan dago")
    else:
        print("Zenbakia ez dago")
    print("")

    bektore1 = [1, 3, 5, 17, 9, 11, 131, 15, 170, 19]
    print("2. kasua: balioa bukaeran dago")
    print(" posizioan_dago(19, (1, 3, 5, 17, 9, 11, 131, 15, 170, 19))")
    print(" 10 izan behar da, eta emaitza da: ")
    ema, posi=posizioan_dago(19,bektore1)
    if (ema==True):
        print("19 zenbakia" +str(posi)+"posizioan dago")
    else:
        print("Zenbakia ez dago")
    print("")

    bektore1 = [1, 3, 5, 17, 9, 11, 131, 15, 170, 19]
    print("3. kasua: balioa ez dago")
    print(" posizioan_dago(1912, (1, 3, 5, 17, 9, 11, 131, 15, 170, 19))")
    print(" False izan behar da, eta emaitza da: ")
    ema, posi=posizioan_dago(1912,bektore1)
    if (ema==True):
        print("1912 zenbakia" +str(posi)+"posizioan dago")
    else:
        print("Zenbakia ez dago")
    print("")
    
nagusia()
