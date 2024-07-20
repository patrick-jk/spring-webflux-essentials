CREATE SCHEMA IF NOT EXISTS anime;

CREATE TABLE anime.devdojo_user
(
    id          SERIAL PRIMARY KEY,
    name        VARCHAR(255),
    username    VARCHAR(255) UNIQUE NOT NULL,
    password    VARCHAR(255)        NOT NULL,
    authorities TEXT
);

CREATE TABLE anime.anime
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

INSERT INTO anime.devdojo_user (name, username, password, authorities)
VALUES ('DevDojo Academy', 'test-user', 'devdojo', 'ROLE_USER');
INSERT INTO anime.devdojo_user (name, username, password, authorities)
VALUES ('DevDojo Academy', 'admin-user', 'devdojo', 'ROLE_USER,ROLE_ADMIN');