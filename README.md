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

#### note
Tutti e 3 i progetti vengono eseguiti dallo stesso server Tomcat. 
La soluzione migliore sarebbe stata usare un server per ogni componente (due server Tomcat per backend e gateway, un server http per il frontend che sarebbe dovuto essere un progetto statico).
Viene tutto eseguito dallo stesso server per evitare problemi di Cross-Origin Resource Sharing che non avremmo fatto in tempo a risolvere prima della consegna.



