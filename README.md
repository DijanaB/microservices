# microservices
Zadatak 6. Kredit, Klijent, Racun, Tip Racuna.
Spring cloud config - Centralno mesto za konfigurisanje podesavanja za aplikaciju. Koristi HTTP, lako se ugradjuje koriscenjem @EnableConfigServer anotacije.
Netflix eureka - na strani klijenta, dozvoljava servisima da se medjusobno pronadju i komuniciraju bez da se hard-codeuje hostname i port.
@EnableEurekaServer
Zuul - ima nekoliko tipova filtera: pre, routing, post i error. Mi smo koristili pre - on se izvrsava pre rutiranja 
(autentifikacija, logovanje debug informacija, biranje origin servera, security)
Rutira zahteve, daje podrsku developerima za debugging i testiranje.

