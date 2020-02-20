def digitu_bakoitiak_kontatu ():
    zenb=int(input('Sartu osoko zenbaki bat: '))
    bak=0
    while(zenb>0):
        if (zenb%2!=0):
            bak=bak+1
        zenb=(zenb/10)
    print("Zuk sartutako zenbakiak ")
    print(bak)
    print(" digitu bakoiti ditu.")
digitu_bakoitiak_kontatu ()