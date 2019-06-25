# Brain-jobs
Java project for the distributed systems course @unimib 2018/2019

## Implementazione

### brainjobs-backend
Gestione delle API con jersey.

Endpoint:

* Tutti i job di un utente
```
[GET] localhost:8080/brainjobs-backend/api/v1/users/{user-id}/jobs
```

* Aggiungere un job all'utente specificato
```
[POST] localhost:8080/brainjobs-backend/api/v1/users/{user-id}/jobs
```
* Mostrare uno specifico job
```
[GET] localhost:8080/brainjobs-backend/api/v1/users/{user-id}/jobs/{job-id}
```

Esempi dei file json per l'invio di richieste e le risposte del server sono presenti nella cartella ``` /examples ```

### brainjobs-frontend
Gestione della dashboard con ajax.

Attraverso la dashboard è possibile visualizzare tutti i job di un utente, visualizzare i dettagli di uno specifico job e inserire un nuovo job.

L'interfaccia è responsive, sviluppata grazie a Bootstrap.

### brain-gateway
WIP
Ponte tra backend e frontend.

## Deployment
Tutti i progetti sono eseguiti dallo stesso server Tomcat v8.5

## Strumenti utilizzati
[Postman](https://www.getpostman.com/) per testare le API durante lo sviluppo backend.

[Bootstrap](https://getbootstrap.com/) per la parte grafica del frontend.

[jQuery Serialize Object](https://github.com/macek/jquery-serialize-object) per serializzare il form da inviare.

[Tomcat](http://tomcat.apache.org/) per il server.


## Note
Tutti e 3 i progetti vengono eseguiti dallo stesso server Tomcat.

La soluzione migliore sarebbe stata usare un server per ogni componente (due server Tomcat per backend e gateway, un server http per il frontend che sarebbe dovuto essere un progetto statico).

Viene tutto eseguito dallo stesso server per evitare problemi di Cross-Origin Resource Sharing che non avremmo fatto in tempo a risolvere prima della consegna.
