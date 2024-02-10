# Gestione Clienti - Back-end

### Descrizione del Programma
Questo progetto è un'applicazione backend per la gestione dei clienti. Consente di creare, modificare ed eliminare utenti attraverso l'uso di chiamate API.

### Tecnologie Utilizzate
- Spring Boot
- Lombok
- Swagger
- MySQL

### Endpoints
Il seguente elenco illustra gli endpoints disponibili per la gestione dei clienti:

/api/v1/employee
- GET /all: Restituisce la lista di tutti i clienti.
- GET /{id}: Restituisce un cliente specifico in base all'ID fornito.
- POST /: Crea un nuovo cliente con i dati forniti nel corpo della richiesta.
- PUT /{id}: Aggiorna le informazioni di un cliente esistente in base ai dati nel corpo della richiesta.
- DELETE /{id}: Elimina un cliente esistente in base all'ID fornito.

### Documentazione API
La documentazione API è generata automaticamente utilizzando Swagger. Puoi accedere alla documentazione API e interagire con gli endpoint tramite il seguente URL:

http://localhost:8080/swagger-ui.html