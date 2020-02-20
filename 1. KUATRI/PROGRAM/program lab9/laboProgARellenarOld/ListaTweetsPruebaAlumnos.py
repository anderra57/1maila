#-*- coding: utf-8 -*-
'''
Created on 10/11/2016

@author: Aitzi
'''
import sys
sys.setrecursionlimit(100000)

import tweepy

import os
import re
import unicodedata
from os import listdir
from os.path import isfile, join



### Datos de acceso a Twitter ###

access_token = " "
access_token_secret = " "
consumer_key = " "
consumer_secret = " "

### Autentificacion ###
auth = tweepy.OAuthHandler(consumer_key, consumer_secret)
auth.set_access_token(access_token, access_token_secret)
api = tweepy.API(auth, retry_count=3,retry_delay=5,retry_errors=set([401, 404, 500, 503]), wait_on_rate_limit_notify=True, wait_on_rate_limit = True)

class ListaTweets(list):
#    class ListaTweets(list):
    
    def __init_LT__(self, Lista=None):
            if Lista is None:
                self.Lista = []
            else:
                self.Lista = Lista 
                
    def anadirTweet(self, tweet):
        self.append(tweet)

    def on_data(self, data):
        print (data)
        return True

    def on_error(self, status):
        print (status)
    
    def extraerTweetsDireccion(self):
        # Twitter solo proporciona acceso a los ultimos 3240 tweets
        # Autorizacion para acceder a Twitter - Inicializamos Twitter

        # Descarga Tweets a partir de una lista de elementos a los que seguimos y que conseguimos a trav�s del m�todo (subprograma) api.friends_ids
        #De la documentaci�n de la API
        #Returns a cursored collection of user IDs for every user the specified user is following (otherwise known as their "friends").
        #parametros (nuestro ID o si no queremos usar el ID podemos utilizar el screen_name (alias de twitter)
        
        listaIdUsuario= api.friends_ids(screen_name = 'jasiuni')
        listaDirecciones = []#lista donde almacenar la lista de usuarios a los que seguimos

        for iden in listaIdUsuario:#recorremos la lista de usuarios a los que seguimos
            #api.get_user Returns a User object with information about the specified user
            #por ejemplo. algunos atributos:
            #'id': 132728535, 
            #'followers_count': 80, 
            #'location': 'Seoul Korea', 
            #'description': "Cars, Musics, Games, Electronics, toys, food, etc... I'm just a typical boy!",
            #'friends_count': 133, 
            #'screen_name': 'chuunnngg', 
            #'lang': 'en', 
            #'name': 'Chung', 
            
            usuario = api.get_user(iden)
            print(usuario)
            listaDirecciones.append(usuario.screen_name)#a�adir el nickname del usuario a nuestra la lista

        for dire in listaDirecciones:
            if not dire.startswith('@'): # Si el nombre de usuario no comienza por @ se la anadimos
                searchQuery = '@'+dire # el + sirve para concatenar dos strings
            else:
                searchQuery = dire

            tweetsPerQry = 200 # Maximo de tweets que nos permite descargar la API en cada vuelta del bucle

            # Tenemos que implementar un metodo que busque: Para cada direccion de Twitter que hay en nuestro directorio de twitters descargados el id mas alto,
            # y descarque los tweets a partir de ese ID (sinceID)
            nombreDirectorio="DocumentosTwitterXDireccion"
            directorio= os.path.join(os.pardir, nombreDirectorio)#os.pardir permite obtener el nombre del directorio padre al actual
            
            print(directorio)
            print("\n")
            if not os.path.isdir(directorio): #si no existe lo creamos
                os.mkdir(directorio)

            ultimoId = self.maximoIDdire(directorio) #calculamos el maximo, es decir identificamos el ultimo tweet
            
            sinceId = ultimoId[0]
            sinceId = 0
            max_id = -1

            listaTweets = []

            tweetCount = 0
    
            print ('Descargando Tweets desde '+dire)
            dict={}

            try:
                if (not sinceId):
                    new_tweets = api.user_timeline(screen_name = searchQuery, count = tweetsPerQry, lang='es')
                else:
                    new_tweets = api.user_timeline(screen_name = searchQuery, count = tweetsPerQry,since_id=sinceId, lang='es')
                if not new_tweets:
                    print("No se han encontrado mas tweets")
                else:
                    for tweet in new_tweets:
                        try:
                            if(str(tweet.id) not in dict):
                                print(tweet.text)
                                self.guardarTweetsDireccion(tweet, dire)
                                dict[str(tweet.id)]=True
                        except tweepy.TweepError as e:
                            print("No se puede acceder al Tweet con id "+str(tweet.id))
                            break
                        max_id = new_tweets[-1].id #un indice negativo implica empezar desde el final
                        tweetCount+=1
                        print(tweetCount)
            except:
                break
                

    def maximoIDdire(self,mypath):
        onlyfiles = [f for f in listdir(mypath) if isfile(join(mypath, f))]
        max=0;
        for f in onlyfiles:
            num = re.sub(r"\.txt", '', f, flags=re.MULTILINE)
            if(int(num) > max):
                max=int(num)
        return(".",join(max,"txt"))
   
    def guardarTweetsDireccion(self, tweet, dire):
        # Guarda los tweets descargados por @direccionUsuario llamando a la creacion de archivos de texto.
        identificador = str(tweet.id)
        print(identificador)
        texto = tweet.text
        textoLimpio = self.limpiarTweet(texto)
        try: #Guardar tweets por direccion
            self.descargarEnArchivoPorDire(identificador, textoLimpio)
        except:
            print ("No se han podido almacenar los Tweets")
            
                
    def limpiarTweet(self, tweet):
        # Limpia el texto de tweet. Elimina los emoji, los enlaces a otras páginas y símbolos que pueden dar problemas a la hora de procesar los textos.
        textoLimpio = self.eliminarEmoji(tweet)
        textoLimpio2 = self.eliminarEnlaces(textoLimpio)
        textoLimpio3 = self.eliminarHT(textoLimpio2)
        tex = self.eliminarVirgulilla(textoLimpio3)
        textoLimpio4 = self.separarPuntSus(tex)
        textoLimpio5 = self.eliminarSaltos(textoLimpio4)
        
        return textoLimpio5

                
    # Guardar datos en local                
    def descargarEnArchivoPorDire(self, ident, tweet):
        # Guarda la informacion de los tweets que se han descargado mediante direcciones en archivos en la carpeta  "DocumentosTwitterXDire"
        self.movermeADirectorio('DocumentosTwitterXDireccion')
        self.creartxt(ident)
        self.grabartxt(tweet, ident)
        print ('Se ha guardado el Tweet con id: '+ ident)
    
    def creartxt(self, ident):
        #Crea el archivo de texto que se corresponde con el identificador del tweet para luego grabar el texto en él.
        archi=open(str(ident) + '.txt','wb')  
        archi.close()
        
    def grabartxt(self, tweet, ident):
        # Escribe el texto del tweet en un archivo de texto, el cual es nombrado con el identificador del tweet.
        texto = tweet.encode('utf-8')
        #texto = tweet.encode('latin-1')
        archi=open(str(ident) + '.txt','wb')
        archi.write(texto)
        archi.close()

    
    def movermeADirectorio(self, nombreDirectorio):
        directorio = os.path.join(os.pardir, nombreDirectorio)
        if not os.path.isdir(directorio):
            os.mkdir(directorio)
        os.chdir(directorio)
        
    def eliminarEmoji(self, texto): 
        # Elimina los símbolos emoji escritos en el tweet.
        try:
            # UCS-4
            highpoints = re.compile(u'[\U00010000-\U0010ffff]')
        except re.error:
            # UCS-2
            highpoints = re.compile(u'[\uD800-\uDBFF][\uDC00-\uDFFF]')
            # mytext = u'<some string containing 4-byte chars>'
        mytext = highpoints.sub(u'', texto)
        return mytext
    
    def eliminarEnlaces(self, texto):
        # Elimina los enlaces a páginas web contenidos en el texto del tweet
        cod = re.sub(r"http\S+", '', texto, flags=re.MULTILINE) 
        return cod
    
    def eliminarHT(self, texto):
        # Elimina los caracteres # y @ de la variable texto
        cod = re.sub(r"#", '', texto, flags=re.MULTILINE) 
        cod2 = re.sub(r"@", '', cod, flags=re.MULTILINE)
        return cod2
    
    def eliminarAcentos(self, texto):
        # Elimina las tildes de la variable texto
#        te = unicodedata.normalize('NFD', texto).encode('ascii','ignore')
#        return te
        return ''.join((c for c in unicodedata.normalize('NFKD', unicode(texto)) if not unicodedata.combining(c)))

    
    def eliminarSaltos(self, texto):
        # Elimina saltos de línea, retorno de carro etc. de la variable texto
        t = re.sub(r"(\n+|\t+|\r+)", r" ", texto)
        return t
    
    def eliminarVirgulilla(self, texto):
        t = re.sub(r'\u00c3\u00b1', r'n', texto)
        return t
    
    def eliminarComillas(self, texto):
        tt = texto.decode('utf-8')
        #tt = texto.decode('latin-1')
        tt2 = tt.encode('ascii')
        t = re.sub(r'\u00AB|\u00BB|\u201D|\u2018|\u2019|\u201E|\u201C|\u201A|\u2032|\u2033', r'', tt2)
        return t
    
    #U+00AB, U+00BB, U+201C, U+201D, U+2018, U+2019, U+201E, U+201C

    def separarPuntSus(self, texto):
        # Elimina los puntos suspensivos que se corresponden con la codificación unicode [\u2026]
        highpoints = re.compile(u'[\u2026]')
        mytext = highpoints.sub(u' [\u2026] ', texto)
        return mytext
    
    def separarPuntuacion(self, texto):
        # Separa los signos de puntuación de la lista entre paréntesis con un espacio en blanco a cada lado
        mm = re.sub(r"([(\·\<\>\,\.\-\_\+\*\"\º\ª\%\&\/\(\)\=\?\¿\¡\!\$\{\}\:\;\'\~\\])", r" \1 ", texto) # Es la versión que mejor funciona!!
        return mm
    
    def eliminarPuntuacion(self, linea):
        #mm = re.sub(r"([(\·\�\|\¬\,\.\-\_\+\*\"\º\ª\%\&\/\(\)\=\?\¿\¡\!\$\{\}\:\;\'\~\\])", r" ", linea)
        mm = re.sub(r"([(\,\.\-\_\+\*\"\%\&\/\(\)\=\?\!\$\{\}\:\;\'\~\\])", r" ", linea)
        return mm
    
    def separarNomMed(self, texto, nomMed):
        nomSep = ' '+nomMed+' '
        mytext = re.sub(r'%s', '%s', texto) %(nomMed, nomSep)
        return mytext
    
  
    def ordenarTexto(self, listaConv):
        tex =''

        for i in listaConv:
            tex = tex + str(i[-2]) + '\t' + i[-1] + '\n'

        return tex
    
   
