# -*- coding: latin-1 -*-
import sys
import codecs
import os
import collections
from os import listdir
from os.path import isfile,join
import re

def escribirOrdenadasPorFrecuenciaPalabra(dictPalabras):
    #l = dictPalabras.items()
    l = sorted(dictPalabras.items(), key=lambda x: x[1],reverse=True)
    #l.sort(key=lambda x: x[1],reverse=True)
    for freqPal in (l):
        freqPalStr=str(freqPal)
        freqPalUTF=freqPalStr.encode('latin-1','ignore')
        print(freqPalUTF.decode('unicode_escape'))

def actualizarFrecPalabra(dictPal,pal):
    #A rellenar el codigo completo de la funcion.
    #El diccionario dictPal almacena palabras y el numero de apariciones de las mismas en los tweets que hemos almacenado. As� pues, actualizarFrecPalabra consistira en dado el diccionario y dada una palabra pal,  incrementar en 1 el numero de apariciones de la palabra. Pre: pal no tiene necesariamente que pertenecer al diccionario. 
    if(pal in dictPal):
        dictPal[pal] += 1
    else:
        dictPal[pal] = 1

    return dictPal


def actualizarFrecPalabraMasFrecuentes(dictPalMasFrec,pal):
    #A rellenar el codigo completo de la funcion.
    #El diccionario dictPalMasFrec almacena palabras m�s frecuentes del castellano seg�n la RAE. As� pues, actualizarFrecPalabra consistira en dado el diccionario y dada una palabra pal,  incrementar e1 el numero de apariciones de la palabra. Pre: El numero de apariciones de las palabras mas frecuentes del castellano almacenadas en el diccionario se ha inicializado a 0 en el programa principal.
    #pal no tiene necesariamente que pertenecer al diccionario de las palabras mas frecuentes. Habra que comprobarlo
    #A RELLENAR EL CODIGO
    if(pal in dictPalMasFrec):
        dictPalMasFrec[pal] += 1
    else:
        None
    
    return dictPalMasFrec


def listarPalabrasMasFrecuentes(mypath):
    #obtener la lista de los nombres de ficheros en el directorio mypath
    soloFicheros = [f for f in listdir(mypath) if isfile(join(mypath, f))]

    #diccionario para almacenar las palabras m�s frecuentes en mis twitters
    dict={}
    palabrasMasFreqCast={"de":0,"la":0, "que":0, "el":0, "en":0, "y":0, "a":0, "los":0, "se":0, "del":0, "las":0, "un":0, "por":0, "con":0, "no":0, "una":0, "su":0, "para":0, "es":0, "al":0, "lo":0, "como":0, "m�s":0,"o":0, "pero":0, "sus":0, "le":0, "ha":0, "me":0, "si":0, "sin":0, "sobre":0, "este":0, "ya":0, "entre":0, "cuando":0, "todo":0, "est�":0,"ser":0, "son":0}

    #recorrer los nombres de ficheros almacenados en la variable soloFicheros
    for f in soloFicheros:
        #abrir para lectura el fichero f y abrirlo bajo la codificacion utf-8
        archi= codecs.open(f,mode='r',encoding='utf-8')
        #archi= codecs.open(f,mode='r',encoding='latin-1')

        #leer una linea
        line = archi.readline()
        #dividir la linea en sus palabras
        palabras=re.sub("[^\w]", " ",  line).split()

        #recorrer las palabras de esa linea
        for palabra in palabras:
            #actualizar las frecuencias almecenadas en el diccionario de mis Tweets
            dict=actualizarFrecPalabra(dict,palabra)

            #actualizar el diccionario de las palabras de la RAE
            palabrasMasFreqCast=actualizarFrecPalabraMasFrecuentes(palabrasMasFreqCast,palabra)

        #cerrar el fichero
        archi.close()

    print("Las Palabras m�s frecuentes en mi diccionario de Twitter son:")
    escribirOrdenadasPorFrecuenciaPalabra(dict)
    print("Las Palabras m�s frecuentes segun la RAE son:")
    escribirOrdenadasPorFrecuenciaPalabra(palabrasMasFreqCast)


nombreDirectorio="DocumentosTwitterXDireccion"
directorio= os.path.join(os.pardir, nombreDirectorio)
if not os.path.isdir(directorio):
    print("No se puede abrir el directorio "+directorio)
else:
    print(directorio)
    os.chdir(directorio)
    listarPalabrasMasFrecuentes(directorio)