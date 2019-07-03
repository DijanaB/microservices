DROP TABLE IF EXISTS kredit CASCADE;
DROP TABLE IF EXISTS klijent CASCADE;
DROP TABLE IF EXISTS racun CASCADE;
DROP TABLE IF EXISTS tip_racuna CASCADE;
DROP SEQUENCE IF EXISTS kredit_seq CASCADE;
DROP SEQUENCE IF EXISTS klijent_seq CASCADE;
DROP SEQUENCE IF EXISTS racun_seq CASCADE;
DROP SEQUENCE IF EXISTS tip_racuna_seq CASCADE;

CREATE TABLE kredit(
	id integer NOT NULL,
    naziv varchar(100) NOT NULL,
    oznaka varchar(20),
	opis varchar(500)
);

CREATE TABLE klijent(
	id integer NOT NULL,
    ime VARCHAR(50) NOT NULL,
    prezime VARCHAR(50) NOT NULL,
    broj_lk integer NOT NULL,
	kredit integer NOT NULL
);

CREATE TABLE racun(
	id integer NOT NULL,
    naziv varchar(100) NOT NULL,
    oznaka varchar(20) ,
    opis varchar(500) ,
    tip_racuna integer NOT NULL,
    klijent integer NOT NULL
);

CREATE TABLE tip_racuna(
	id integer NOT NULL,
    naziv varchar(100) NOT NULL,
    oznaka varchar(20),
    opis varchar(500)
);

ALTER TABLE kredit ADD CONSTRAINT PK_Kredit
	PRIMARY KEY(id);
ALTER TABLE klijent ADD CONSTRAINT PK_Klijent
	PRIMARY KEY(id);
ALTER TABLE racun ADD CONSTRAINT PK_Racun
	PRIMARY KEY(id);
ALTER TABLE tip_racuna ADD CONSTRAINT PK_Tip_Racuna
	PRIMARY KEY(id);

ALTER TABLE klijent ADD CONSTRAINT FK_Klijent_Kredit
	FOREIGN KEY (kredit) REFERENCES kredit (id);
ALTER TABLE racun ADD CONSTRAINT FK_Racun_Tip_Racuna
	FOREIGN KEY (tip_racuna) REFERENCES tip_racuna (id);
ALTER TABLE racun ADD CONSTRAINT FK_Racun_Klijent
	FOREIGN KEY (klijent) REFERENCES klijent (id);

CREATE INDEX IDXFK_Klijent_Kredit
	ON klijent (kredit);
CREATE INDEX IDXFK_Racun_Tip_Racuna
	ON racun (tip_racuna);
CREATE INDEX IDXFK_Racun_Klijent
	ON racun (klijent);

CREATE SEQUENCE kredit_seq
INCREMENT 1;
CREATE SEQUENCE klijent_seq
INCREMENT 1;
CREATE SEQUENCE racun_seq
INCREMENT 1;
CREATE SEQUENCE tip_racuna_seq
INCREMENT 1;