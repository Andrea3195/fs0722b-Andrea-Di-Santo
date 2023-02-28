CREATE TABLE clienti  (
NumeroClienti SERIAL PRIMARY KEY,
Nome VARCHAR NOT NULL,
Cognome VARCHAR NOT NULL,
DataNascita INT8 NOT NULL,
RegioneResidenza VARCHAR NOT NULL
);

CREATE TABLE fatture (
NumeroFattura SERIAL PRIMARY KEY,
Tipologia VARCHAR NOT NULL,
Importo INT4 NOT NULL,
Iva INT4 NOT NULL,
IdCliente INT8 NOT NULL,
DataFattura Date NOT NULL,
NumeroFornitore INT8 NOT NULL,
CONSTRAINT Cliente_FK FOREIGN KEY (IdCliente) REFERENCES clienti(NumeroClienti),
CONSTRAINT Fornitore_FK FOREIGN KEY (NumeroFornitore) REFERENCES fornitori(NumeroFornitore)
);

DROP TABLE clienti;
DROP TABLE fatture;
DROP TABLE prodotti;
DROP TABLE fornitori;

CREATE TABLE prodotti  (
IdProdotto SERIAL PRIMARY KEY,
Descrizione VARCHAR NOT NULL,
InProduzione BOOLEAN NOT NULL DEFAULT 'false',
InCommercio BOOLEAN NOT NULL DEFAULT 'false',
DataAttivazione INT8 NOT NULL,
DataDisattivazione INT8 NOT NULL	
);

CREATE TABLE fornitori ( 
NumeroFornitore SERIAL PRIMARY KEY,
Denominazione VARCHAR NOT NULL,
RegioneResidenza VARCHAR NOT NULL
);

INSERT INTO clienti(Nome, Cognome, DataNascita, RegioneResidenza ) 
		VALUES 	('Mario', 'Rossi', '11/6/1982', 'Lombardia'),
				('Michele', 'Bianchi', '5/3/1991', 'Sicilia'),
				('Giovanni', 'Gialli', '12/11/1997', 'Sardegna'),
				('Giuseppe', 'Marroni', '22/7/20003', 'Puglia');
				
INSERT INTO fatture (NumeroFattura, Tipologia, Importo, Iva, IdCliente, DataFattura, NumeroFornitore) 
		VALUES	(1, 'A', '110.50', '10%', 2, '1/3/2020', 1),
				(2, 'B', '99.99', '15%', 1, '10/4/2021', 2),
				(3, 'A', '215.20', '20%', 3, '20/5/2022', 1),
				(4, 'A', '152.90', '20%', 2, '30/6/2023', 1);

INSERT INTO fornitori(Denominazione, RegioneResidenza ) 
		VALUES 	('CodeC', 'Lazio'),
				('CodeD', 'Piemonte');
				

INSERT INTO prodotti (Descrizione, InProduzione, InCommercio,  DataAttivazione, DataDisattivazione)
		VALUES 	('Prodotto a', true, false, '21/5/2013', '16/4/2024'),
				('Prodotto b', true, true, '6/8/2014', '5/10/2025'),
				('Prodotto c', false, false, '17/11/2016', '18/7/2022');
				

SELECT * FROM clienti;
