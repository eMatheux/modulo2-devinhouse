CREATE TABLE TIMES (
    sigla VARCHAR(3) PRIMARY KEY,
    nome VARCHAR(50) NOT NULL
);

//Insere todos os times na tabela TIMES criado acima
INSERT INTO TIMES (sigla, nome) VALUES
    ('QAT', 'Qatar'),
    ('ECU', 'Equador'),
    ('SEN', 'Senegal'),
    ('NED', 'Holanda'),
    ('ENG', 'Inglaterra'),
    ('IRN', 'Irã'),
    ('USA', 'Estados Unidos'),
    ('WAL', 'País de Gales'),
    ('ARG', 'Argentina'),
    ('KSA', 'Arábia Saudita'),
    ('MEX', 'México'),
    ('POL', 'Polônia'),
    ('FRA', 'França'),
    ('DEN', 'Dinamarca'),
    ('TUN', 'Tunísia'),
    ('AUS', 'Austrália'),
    ('ESP', 'Espanha'),
    ('GER', 'Alemanha'),
    ('JPN', 'Japão'),
    ('CRC', 'Costa Rica'),
    ('BEL', 'Bélgica'),
    ('CAN', 'Canadá'),
    ('MAR', 'Marrocos'),
    ('CRO', 'Croácia'),
    ('BRA', 'Brasil'),
    ('SRB', 'Sérvia'),
    ('SUI', 'Suíça'),
    ('CMR', 'Camarões'),
    ('POR', 'Portugal'),
    ('GHA', 'Gana'),
    ('URU', 'Uruguai'),
    ('KOR', 'Coréia do Sul');


SELECT * FROM TIMES;
SELECT nome FROM TIMES WHERE sigla = 'KSA';
SELECT sigla FROM TIMES WHERE nome = 'Gana';
SELECT * FROM TIMES WHERE nome LIKE 'E%';
SELECT * FROM TIMES WHERE nome LIKE 'E%' AND sigla LIKE 'U%';
ALTER TABLE TIMES ADD COLUMN grupo VARCHAR(1);
UPDATE TIMES SET grupo = 'A' WHERE sigla IN ('QAT', 'ECU', 'SEN', 'NED');
UPDATE TIMES SET grupo = 'B' WHERE sigla IN ('ENG', 'IRN', 'USA', 'WAL');
UPDATE TIMES SET grupo = 'C' WHERE sigla IN ('ARG', 'KSA', 'MEX', 'POL');
UPDATE TIMES SET grupo = 'D' WHERE sigla IN ('FRA', 'DEN', 'TUN', 'AUS');
UPDATE TIMES SET grupo = 'E' WHERE sigla IN ('ESP', 'GER', 'JPN', 'CRC');
UPDATE TIMES SET grupo = 'F' WHERE sigla IN ('BEL', 'CAN', 'MAR', 'CRO');
UPDATE TIMES SET grupo = 'G' WHERE sigla IN ('BRA', 'SRB', 'SUI', 'CMR');
UPDATE TIMES SET grupo = 'H' WHERE sigla IN ('POR', 'GHA', 'URU', 'KOR');

SELECT nome FROM TIMES WHERE grupo = 'G';
SELECT sigla FROM TIMES WHERE grupo = 'C';
SELECT * FROM TIMES WHERE grupo IN ('E', 'H') ORDER BY grupo;
SELECT * FROM TIMES WHERE grupo IN ('E', 'H') ORDER BY nome;

CREATE TABLE CAMPEOES (
    ano INT PRIMARY KEY,
    sigla_time VARCHAR(3),
    FOREIGN KEY (sigla_time) REFERENCES TIMES(sigla)
);

INSERT INTO CAMPEOES (ano, sigla_time) VALUES
    (1930, 'URU'),
    (1934, 'ITA'),
    (1938, 'ITA'),
    (1950, 'URU'),
    (1954, 'GER'),
    (1958, 'BRA'),
    (1962, 'BRA'),
    (1966, 'ENG'),
    (1970, 'BRA'),
    (1974, 'GER'),
    (1978, 'ARG'),
    (1982, 'ITA'),
    (1986, 'ARG'),
    (1990, 'GER'),
    (1994, 'BRA'),
    (1998, 'FRA'),
    (2002, 'BRA'),
    (2006, 'ITA'),
    (2010, 'ESP'),
    (2014, 'GER'),
    (2018, 'FRA');

SELECT * FROM CAMPEOES;
SELECT * FROM CAMPEOES ORDER BY ano;
SELECT sigla_time FROM CAMPEOES WHERE ano = (SELECT MAX(ano) FROM CAMPEOES);
SELECT sigla_time, COUNT(ano) AS quantidade_titulos FROM CAMPEOES GROUP BY sigla_time ORDER BY quantidade_titulos DESC;
SELECT DISTINCT grupo FROM TIMES ORDER BY grupo;
SELECT grupo, COUNT(*) AS quantidade_times FROM TIMES GROUP BY grupo;

SELECT DISTINCT UPPER(t.nome) AS nome_em_maiusculo
FROM TIMES t
JOIN CAMPEOES c ON t.sigla = c.sigla_time;

SELECT DISTINCT LOWER(t.nome) AS nome_em_minusculo
FROM TIMES t
LEFT JOIN CAMPEOES c ON t.sigla = c.sigla_time
WHERE c.sigla_time IS NULL;
