def bitarretik_hamartarrera ():
    zenb=int(input('Sartu zenbaki bitar bat: '))
    em=0
    exp=0
    while(zenb>0):
        if(zenb%2!=0):
            em=em + 2**(exp)
        exp += 1
        zenb=(zenb//10)
    print("Zenbakia hamartarrez honakoa da:")
    print(em)
bitarretik_hamartarrera ()
