# Progetto: Spring BootFacebook Application

L'applicazione SpringBootFacebook permette all'utente di una pagina Facebook di fare delle richieste tramite software di API development POSTMAN, il quale fornisce i risultati in formato JSON. Lo sviluppo dell'applicazione è stato possibile grazie al sito open-source FACEBOOK FOR DEVELOPERS, una pagina web che permette agli sviluppatori e alle aziende di conoscere più in dettaglio i dati delle proprie pagine,tramite il token di accesso autorizzato. Il codice è stato sviluppato mediante l'IDE di ECLIPSE in linguaggio JAVA. Nel progetto è presente la Web Application Spring Boot che all'avvio dell'applicazione permette di utilizzare POSTMAN per effettuare alcune richieste(con GET). 

L'applicazione è in grado di:
 * elencare i post pubblicati sulla pagina ed esprime la presenza dell' immagine (GET);
 * elencare metadata dei post (GET);
 * calcolare il numero totale di post (GET);
 * ottenere delle statistiche sui pixel e bytes delle foto presenti nei post in formato JSON (GET).
 
 ## Diagramma Casi D'uso
 ![Logo](https://github.com/valeriacalvarese/Progetto-Programmazione-ad-oggetti/blob/master/UML.ApplicazioneFacebook/NewModel%20Use%20Case%20Diagram.jpg)

## Avvio Applicazione
Per poter iniziare bisogna registrare un proprio account Facebook su Facebook for Developers ed è necessario generare il token di accesso autorizzato per le pagine. (https://developers.facebook.com/docs/pages/publishing).

In seguito, dopo aver scaricato i software necessari per l'utilizzo (Eclipse, Postman...), bisogna entrare su Eclipse e clonare questo repository GitHub, nel seguente modo:
 * clone a repository;
 * URL:https://github.com/valeriacalvarese/Progetto-Programmazione-ad-oggetti;
 * finish. 

Una volta clonata la repository nella propria IDE, è necessario sostituire i link già presenti nella classe SpringBootFacebookApplication nel seguente modo:
 * riga 28: https://graph.facebook.com/v7.0/{Id_Pagina}/feed?access_token={codice};
 * riga 30: https://graph.facebook.com/v7.0/{Id_PAgina}/feed?fields=full_picture&access_token={codice}.

Dopo aver cliccare su run as Spring Boot App sarà possibile, attraverso Postman, inserire le diverse richieste di GET all'url http://localhost:8080.

## Utilizzo delle richieste possibili

Tipo | Percorso | Descrizione
---- | ----- | -----
GET | /post | Richiesta elenco post della pagina e presenza della foto nel post
GET | /tot | Richiesta totale numero post nella pagina
GET | /metadati | Richiesta elenco Metadati
GET | /maxbytes | Richiesta statistica massimo dei bytes utilizzati da una foto
GET | /minbytes | Richiesta statistica minimo dei bytes utilizzati da una foto
GET | /maxpixel | Richiesta statistica massimo dei pixel utilizzati da una foto
GET | /minpixel | Richiesta statistica minimo dei pixel utilizzati da una foto
GET | /AverageBytes | Richiesta media dei bytes delle foto
GET | /AveragePixel | Richiesta media dei pixel delle foto

## Diagramma delle classi 
 ### Package
 ![Logo](https://github.com/valeriacalvarese/Progetto-Programmazione-ad-oggetti/blob/master/UML.ApplicazioneFacebook/Package%20Class%20Diagram.jpg)
 
 ### App:SpringBootFacebook
 ![Logo](https://github.com/valeriacalvarese/Progetto-Programmazione-ad-oggetti/blob/master/UML.ApplicazioneFacebook/hv.oop.SpringBootApplication%20Class%20Diagram.jpg)

### Model
![Logo](https://github.com/valeriacalvarese/Progetto-Programmazione-ad-oggetti/blob/master/UML.ApplicazioneFacebook/ModelClass%20Diagram.jpg)

### Util
![Logo](https://github.com/valeriacalvarese/Progetto-Programmazione-ad-oggetti/blob/master/UML.ApplicazioneFacebook/Util%20Class%20Diagram.jpg)

### Service
![Logo](https://github.com/valeriacalvarese/Progetto-Programmazione-ad-oggetti/blob/master/UML.ApplicazioneFacebook/Service%20Class%20Diagram.jpg)

## Software utilizzati
* [Eclipse](https://www.eclipse.org/downloads/) - Ambiente di sviluppo
* [UML Designer](http://www.umldesigner.org/) - software per la realizzazione dei diagrammi UML
* [Maven](https://maven.apache.org/) - software di gestione di progetti e librerie
* [Spring Boot](https://spring.io/projects/spring-boot) - framework per sviluppo di applicazioni in Java
* [Postman](https://www.postman.com/) - ambiente di sviluppo API per effettuare richieste


## Autore
[Calvarese Valeria](https://github.com/valeriacalvarese)





