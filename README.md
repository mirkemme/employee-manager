# Gestione Dipendenti - Back-end

### Descrizione del Programma
Questo progetto è un'applicazione backend per la gestione dei dipendenti. Consente di creare, modificare ed eliminare utenti attraverso l'uso di chiamate API.

### Tecnologie Utilizzate
- Spring Boot
- Lombok
- Swagger
- MySQL

### Endpoints
Il seguente elenco illustra gli endpoints disponibili per la gestione dei dipendenti:

/api/v1/employee
- GET /all: Restituisce la lista di tutti i dipendenti.
- GET /{id}: Restituisce un dipendente specifico in base all'ID fornito.
- POST /: Crea un nuovo dipendente con i dati forniti nel corpo della richiesta.
- PUT /{id}: Aggiorna le informazioni di un dipendente esistente in base ai dati nel corpo della richiesta.
- DELETE /{id}: Elimina un dipendente esistente in base all'ID fornito.

### Documentazione API
La documentazione API è generata automaticamente utilizzando Swagger. Puoi accedere alla documentazione API e interagire con gli endpoint tramite il seguente URL:

http://localhost:8080/swagger-ui.html
