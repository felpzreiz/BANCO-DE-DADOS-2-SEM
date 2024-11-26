CREATE TABLE missa
(
    id    SERIAL,
    santo VARCHAR(50),
    valor DECIMAL(5, 2),
    PRIMARY KEY (id)
);

CREATE TABLE matilha
(
    id   SERIAL,
    nome VARCHAR(50),
    PRIMARY KEY (id)
);

CREATE TABLE equipe
(
    id       SERIAL,
    nome     VARCHAR(50),
    cla      VARCHAR(50),
    elemento VARCHAR(50),
    PRIMARY KEY (id)
);

CREATE TABLE torcida
(
    id       SERIAL,
    torcedor VARCHAR(50),
    time     VARCHAR(50),
    PRIMARY KEY (id)
);

CREATE
USER usuario WITH PASSWORD '1234';

GRANT SELECT, INSERT, UPDATE, DELETE ON missa TO usuario;
GRANT SELECT, INSERT, UPDATE, DELETE ON matilha TO usuario;
GRANT SELECT, INSERT, UPDATE, DELETE ON equipe TO usuario;
GRANT SELECT, INSERT, UPDATE, DELETE ON torcida TO usuario;


GRANT SELECT, INSERT, UPDATE ON missa_id_seq TO usuario;
GRANT SELECT, INSERT, UPDATE ON matilha_id_seq TO usuario;
GRANT SELECT, INSERT, UPDATE ON equipe_id_seq TO usuario;
GRANT SELECT, INSERT, UPDATE ON torcida_id_seq TO usuario;

select *
from torcida