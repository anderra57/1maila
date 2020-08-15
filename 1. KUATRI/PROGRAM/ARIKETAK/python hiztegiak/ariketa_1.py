def ariketa_1 ():

    prezioak = {'banana':4, 'sagarra':2,'mandarina': 1.5, 'madaria': 3}
    produktua= input('Sartu produktua:  ')
    ordaintzekoa= 0
    
    while produktua :    #False produktua string hutsa denean
        if produktua in prezioak :
            produk_prez=prezioak[produktua]
        else :
            produk_prez=0
        print(str(produk_prez)+ ' euro')
        produktua= input('Sartu produktua:  ')
          
        ordaintzekoa= ordaintzekoa + produk_prez
        
    print('Ordaindu beharrekoa ' + str(ordaintzekoa) + ' euro')
    
    
ariketa_1()