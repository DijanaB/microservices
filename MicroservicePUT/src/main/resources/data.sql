INSERT INTO "kredit"("id", "naziv", "oznaka", "opis")
VALUES(nextval('kredit_seq'), 'Keš kredit', 'KšKr', 'Minimalni period otplate je 12 meseci, maksimalni je 120 meseci. Nominalna kamatna stopa 9%. Efektivna kamatna stopa 10,53%.');
INSERT INTO "kredit"("id", "naziv", "oznaka", "opis")
VALUES(nextval('kredit_seq'), 'Kredit za refinansiranje', 'KrR', 'Period otplate kredita za refinansiranje uz dodatni keš je od 60 do 144 meseca. Nominalna kamatna stopa 8,49%. Efektivna kamatna stopa 9,54%. ');
INSERT INTO "kredit"("id", "naziv", "oznaka", "opis")
VALUES(nextval('kredit_seq'), 'Potrošački kredit', 'PKr', 'Period otplate je od 13 do 84 meseci. Nominalna kamatna stopa 11%. Efektivna kamatna stopa 12,81%.');
INSERT INTO "kredit"("id", "naziv", "oznaka", "opis")
VALUES(nextval('kredit_seq'), 'Stambeni Kredit', 'SKr', 'Period otplate od 36 do 84 meseca. Nominalna kamatna stopa 9,24%. Efektivna kamatna stopa 10,79%.');
INSERT INTO "kredit"("id", "naziv", "oznaka", "opis")
VALUES(nextval('kredit_seq'), 'Auto Kredit', 'AKr', 'Period otplate je do 84 meseca. Nominalna kamatna stopa 5%. Efektivna kamatna stopa 6,47%.');

INSERT INTO "tip_racuna"("id", "naziv", "oznaka")
VALUES(nextval('tip_racuna_seq'), 'Dinarski tekući račun', 'DiTR');
INSERT INTO "tip_racuna"("id", "naziv", "oznaka")
VALUES(nextval('tip_racuna_seq'), 'Premium tekući račun', 'PrTR');
INSERT INTO "tip_racuna"("id", "naziv", "oznaka")
VALUES(nextval('tip_racuna_seq'), 'Devizni tekući račun', 'DeTR');
INSERT INTO "tip_racuna"("id", "naziv", "oznaka")
VALUES(nextval('tip_racuna_seq'), 'Omladinski tekući račun', 'OmTR');
INSERT INTO "tip_racuna"("id", "naziv", "oznaka")
VALUES(nextval('tip_racuna_seq'), 'Penzioni tekući račun', 'PeTR');

INSERT INTO "klijent"("id", "ime", "prezime", "broj_lk", "kredit")
VALUES (nextval('klijent_seq'),'Dijana','Bursać','189635472',1);
INSERT INTO "klijent"("id", "ime", "prezime", "broj_lk", "kredit")
VALUES (nextval('klijent_seq'),'Zorica','Babić','478963250',2);
INSERT INTO "klijent"("id", "ime", "prezime", "broj_lk", "kredit")
VALUES (nextval('klijent_seq'),'Aleksandra','Ostojić','259300614',3);
INSERT INTO "klijent"("id", "ime", "prezime", "broj_lk", "kredit")
VALUES (nextval('klijent_seq'),'Miloš','Milašinović','785321456',4);
INSERT INTO "klijent"("id", "ime", "prezime", "broj_lk", "kredit")
VALUES (nextval('klijent_seq'),'Danilo','Nikolić','873215944',5);


INSERT INTO "racun"("id", "naziv", "oznaka","tip_racuna","klijent")
VALUES (nextval('racun_seq'),'Dinarski','R1',1,1);
INSERT INTO "racun"("id", "naziv", "oznaka","tip_racuna","klijent")
VALUES (nextval('racun_seq'),'Premium','R2',2,1);
INSERT INTO "racun"("id", "naziv", "oznaka","tip_racuna","klijent")
VALUES (nextval('racun_seq'),'Devizni','R3',3,1);

INSERT INTO "racun"("id", "naziv", "oznaka","tip_racuna","klijent")
VALUES (nextval('racun_seq'),'Dinarski','R4',1,2);
INSERT INTO "racun"("id", "naziv", "oznaka","tip_racuna","klijent")
VALUES (nextval('racun_seq'),'Premium','R5',3,2);

INSERT INTO "racun"("id", "naziv", "oznaka","tip_racuna","klijent")
VALUES (nextval('racun_seq'),'Omladinski','R6',4,3);

INSERT INTO "racun"("id", "naziv", "oznaka","tip_racuna","klijent")
VALUES (nextval('racun_seq'),'Penzioni','R7',5,4);
INSERT INTO "racun"("id", "naziv", "oznaka","tip_racuna","klijent")
VALUES (nextval('racun_seq'),'Premium','R8',2,4);












