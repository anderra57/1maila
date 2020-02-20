
def bektore_ordenatuan_dago(x,bek):
  

def nagusia():
    bektore1= [30, 31, 255, 270, 281, 290, 630, 700, 900, 960] 
    print("1. kasua: balioa erdian dago")
    print(" esta_en_vector_ordenado(290, (30, 31, 255, 270, 281, 290, 630, 700, 900, 960))")
    print(" True izan behar da, eta emaitza da: ")
    ema=bektore_ordenatuan_dago(290,bektore1)
    print(ema)
    print("")

    bektore1=  [30, 31, 255, 270, 281, 290, 630, 700, 900, 960]
    print("2. kasua: balioa bukaeran dago")
    print(" esta_en_vector_ordenado(960, (30, 31, 255, 270, 281, 290, 630, 700, 900, 960))"
    print(" True izan behar da, eta emaitza da: ")
    ema=bektore_ordenatuan_dago(960,bektore1)
    print(ema)
    print("")

    bektore1=  [30, 31, 255, 270, 281, 290, 630, 700, 900, 960]
    print("3. kasua: balioa ez dago")
    print(" bektore_ordenatuan_dago(45, (30, 31, 255, 270, 281, 290, 630, 700, 900, 960))")
    print(" False izan behar da, eta emaitza da: ")
    ema=bektore_ordenatuan_dago(45,bektore1)
    print(ema)
    print("")
    
nagusia()
