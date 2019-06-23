# Brain-jobs
Java project for the distributed systems course @unimib 2018/2019

## Implementazione

### brainjobs-backend
Gestione delle API con jersey.

### brainjobs-frontend
Gestione della dashboard con ajax.

### brain-gateway
WIP
Ponte tra backend e frontend.

## Strumenti utilizzati
[Postman](https://www.getpostman.com/) per testare le API durante lo sviluppo backend.

[Bootstrap](https://getbootstrap.com/) per la parte grafica del frontend.

[jQuery Serialize Object](https://github.com/macek/jquery-serialize-object) per serializzare il form da inviare.


## Note
Tutti e 3 i progetti vengono eseguiti dallo stesso server Tomcat.
La soluzione migliore sarebbe stata usare un server per ogni componente (due server Tomcat per backend e gateway, un server http per il frontend che sarebbe dovuto essere un progetto statico).
Viene tutto eseguito dallo stesso server per evitare problemi di Cross-Origin Resource Sharing che non avremmo fatto in tempo a risolvere prima della consegna.
