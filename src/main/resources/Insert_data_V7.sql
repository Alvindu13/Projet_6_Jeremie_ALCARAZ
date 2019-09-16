--------------------------
--utilisateur--
--------------------------

INSERT INTO utilisateur (username, firstname, lastname, password, nbtopo, enabled) VALUES (1, 'Jérémie', 'ALCARAZ', '123456', 0, 1);
INSERT INTO utilisateur (username, firstname, lastname, password, nbtopo, enabled) VALUES (2, 'Jérémie', 'ALCARAZ', '123456', 6, 1);
INSERT INTO utilisateur (username, firstname, lastname, password, nbtopo, enabled) VALUES (3, 'Jérémie', 'ALCARAZ', '123456', 5, 1);
INSERT INTO utilisateur (username, firstname, lastname, password, nbtopo, enabled) VALUES (4, 'Jérémie', 'ALCARAZ', '123456', 0, 1);
INSERT INTO utilisateur (username, firstname, lastname, password, nbtopo, enabled) VALUES (5, 'Richard', 'ALCARAZ', '123456', 6, 1);
INSERT INTO utilisateur (username, firstname, lastname, password, nbtopo, enabled) VALUES (6, 'Mathieu', 'DICHIARA', '123456', 5, 1);
INSERT INTO utilisateur (username, firstname, lastname, password, nbtopo, enabled) VALUES (7, 'Hally', 'RAS', '123456', 0, 1);
INSERT INTO utilisateur (username, firstname, lastname, password, nbtopo, enabled) VALUES (8, 'Lorena', 'STEFFANIA', '123456', 6, 1);
INSERT INTO utilisateur (username, firstname, lastname, password, nbtopo, enabled) VALUES (9, 'Jérémie', 'ALCARAZ', '123456', 5, 1);


--------------------------
--user_role--
--------------------------

INSERT INTO user_role (utilisateur_id, rolename) VALUES (1, 'ADMIN');
INSERT INTO user_role (utilisateur_id, rolename) VALUES (2, 'USER');
INSERT INTO user_role (utilisateur_id, rolename) VALUES (3, 'USER');
INSERT INTO user_role (utilisateur_id, rolename) VALUES (4, 'ADMIN');
INSERT INTO user_role (utilisateur_id, rolename) VALUES (5, 'TP');
INSERT INTO user_role (utilisateur_id, rolename) VALUES (6, 'USER');
INSERT INTO user_role (utilisateur_id, rolename) VALUES (7, 'ADMIN');
INSERT INTO user_role (utilisateur_id, rolename) VALUES (8, 'USER');
INSERT INTO user_role (utilisateur_id, rolename) VALUES (9, 'USER');


--------------------------
--topo--
--------------------------

INSERT INTO topo (utilisateur_id, name, nbsite, nbsector, available) VALUES (1, 'HORIZON', 2, 10, TRUE);
INSERT INTO topo (utilisateur_id, name, nbsite, nbsector, available) VALUES (2, 'AUBE', 2, 5, FALSE);
INSERT INTO topo (utilisateeur_id, name, nbsite, nbsector, available) VALUES (2, 'HOLA', 2, 5, FALSE);


--------------------------
--site--
--------------------------

INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES ('Super Site', 1, 'ALBION', 'Marseille', 5, 14, '4A', '6B' ,900);
INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES ('Pas terrible', 2, 'BOULBANE', 'Nantes', 10, 50, '4B', '7A', 1200);
INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES ('Great', 1, 'EXARDES', 'Paris', 1, 3, '5A', '7B', 5000);
INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES ('Super Site', 1, 'ALBION', 'Marseille', 5, 14, '5A','7B', 900);
INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES ('Super Site', 1, 'SITE2', 'Grenoble', 5, 14, '4A', '5A', 900);
INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES ('Super Site', 2, 'SITE3', 'Lille', 5, 14, '4C', '5B',900);
INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES ('Super Site', 1, 'SITE4', 'Avignon', 5, 14, '4C', '5C', 900);
INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES ('Super Site', 1, 'SITE5', 'Bordeaux', 5, 14, '4D', '7B', 900);
INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES ('Super Site', 1, 'SITES6', 'Limoges', 5, 14, '5A', '5C', 900);
INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES ('Super Site', 1, 'SITE7', 'Bretagne', 5, 14, '5B', '5C', 900);
INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES ('Super Site', 1, 'SITE8', 'Orleans', 5, 14, '6B', '7B', 900);
INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES ('Super Site', 1, 'SITE9', 'Angers', 5, 14, '4B', '7B', 900);
INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES('Super Site',1,'SITE10','Martigues', 5, 14, '4A', '7B',900);
INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES ('Super Site', 1, 'SITE11', 'Marignanes', 5, 14, '4A','7B', 900);
INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES ('Super Site', 1, 'SITE12', 'Brest', 5, 14, '4A','7B', 900);
INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES ('Super Site', 1, 'ALBION', 'Marseille', 5, 14, '5A','5C', 900);
INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES ('Super Site', 1, 'ALBION', 'Marseille', 5, 14, '4A','5C', 900);
INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES ('Super Site', 1, 'ALBION', 'Paris', 5, 14, '4A','5C', 900);
INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES ('Super Site', 1, 'ALBION', 'Marseille', 5, 14, '5A','7B', 900);
INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES ('Super Site', 1, 'ALBION', 'Paris', 5, 14, '5A','7B', 900);
INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES ('Super Site', 1, 'ALBION', 'Marseille', 5, 14, '5A','7B', 900);
INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES ('Super Site', 1, 'ALBION', 'Marseille', 5, 14, '5A','7B', 900);
INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES ('Super Site', 1, 'ALBION', 'Marseille', 5, 14, '4A','5C', 900);
INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES ('Super Site', 1, 'ALBION', 'Marseille', 5, 14, '4A','5C', 900);
INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES ('Super Site', 1, 'ALBION', 'Marseille', 5, 14, '5A','7B', 900);
INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES ('Super Site', 1, 'ALBION', 'Marseille', 5, 14, '4A','5C', 900);
INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES ('Super Site', 1, 'ALBION', 'Marseille', 5, 14, '4A','5C', 900);
INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES ('Super Site', 1, 'ALBION', 'Marseille', 5, 14, '4A','5C', 900);
INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES ('Super Site', 1, 'ALBION', 'Marseille', 5, 14, '4A','5C', 900);
INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES ('Super Site', 1, 'ALBION', 'Marseille', 5, 14, '4A','5C', 900);
INSERT INTO site (comment, topo_id, name, location, nbsector, nbway, cotation_minimum, cotation_maximum, way_size) VALUES ('Super Site', 1, 'ALBION', 'Marseille', 5, 14, '4A','5C', 900);




--------------------------
--commentaire--
--------------------------

INSERT INTO commentaire (site_id, content, utilisateur_username) VALUES (1, 'Wouah ! Super les voies de ces sites!', 'Alvindu13');
INSERT INTO commentaire (site_id, content, utilisateur_username) VALUES (1, 'Wouah ! Super les longueurs', 'Alvindu15');
INSERT INTO commentaire (site_id, content, utilisateur_username) VALUES (2, 'Wouah !', 'Alvindu13');


--------------------------
--image--
--------------------------

INSERT INTO image (nom, content) VALUES ('ALBION', pg_read_binary_file('/Users/jeremie/Documents/Projets/Projet_OP/Projet_6/Projet_en_cours/assets/img/site1.jpg'));
INSERT INTO image (nom, content) VALUES ('ALBION', pg_read_binary_file('/Users/jeremie/Documents/Projets/Projet_OP/Projet_6/Projet_en_cours/assets/img/site2.jpg'));
INSERT INTO image (nom, content) VALUES ('ALTION', pg_read_binary_file('/Users/jeremie/Documents/Projets/Projet_OP/Projet_6/Projet_en_cours/assets/img/site3.jpg'));
INSERT INTO image (nom, content) VALUES ('ALTION', pg_read_binary_file('/Users/jeremie/Documents/Projets/Projet_OP/Projet_6/Projet_en_cours/assets/img/site4.jpg'));

--------------------------
--secteur--
--------------------------

INSERT INTO secteur (site_id, nbway, name) VALUES (1, 12, 'sensation');
INSERT INTO secteur (site_id, nbway, name) VALUES (2, 3, 'jagar');
INSERT INTO secteur (site_id, nbway, name) VALUES (2, 4, 'gakar');
INSERT INTO secteur (site_id, nbway, name) VALUES (3, 12, 'sensation');
INSERT INTO secteur (site_id, nbway, name) VALUES (4, 3, 'jagar');
INSERT INTO secteur (site_id, nbway, name) VALUES (5, 4, 'gakar');
INSERT INTO secteur (site_id, nbway, name) VALUES (6, 12, 'sensation');
INSERT INTO secteur (site_id, nbway, name) VALUES (7, 3, 'jagar');
INSERT INTO secteur (site_id, nbway, name) VALUES (2, 4, 'gakar');
INSERT INTO secteur (site_id, nbway, name) VALUES (2, 12, 'sensation');
INSERT INTO secteur (site_id, nbway, name) VALUES (3, 3, 'jagar');
INSERT INTO secteur (site_id, nbway, name) VALUES (3, 4, 'gakar');
INSERT INTO secteur (site_id, nbway, name) VALUES (2, 12, 'sensation');
INSERT INTO secteur (site_id, nbway, name) VALUES (3, 3, 'jagar');
INSERT INTO secteur (site_id, nbway, name) VALUES (3, 4, 'gakar');
INSERT INTO secteur (site_id, nbway, name) VALUES (2, 12, 'sensation');
INSERT INTO secteur (site_id, nbway, name) VALUES (2, 3, 'jagar');
INSERT INTO secteur (site_id, nbway, name) VALUES (2, 4, 'gakar');
INSERT INTO secteur (site_id, nbway, name) VALUES (2, 12, 'sensation');
INSERT INTO secteur (site_id, nbway, name) VALUES (2, 3, 'jagar');
INSERT INTO secteur (site_id, nbway, name) VALUES (2, 4, 'gakar');

--------------------------
--voie--
--------------------------

INSERT INTO voie (secteur_id, size, name, nbpoints, cotation, nbpart) VALUES (1,1000, 'Voie1', 100, '4B', 4);
INSERT INTO voie (secteur_id, size, name, nbpoints, cotation, nbpart) VALUES (1,1000, 'Voie2', 300, '4C', 4);
INSERT INTO voie (secteur_id, size, name, nbpoints, cotation, nbpart) VALUES (2,1000, 'Voie3', 150, '5C', 4);
INSERT INTO voie (secteur_id, size, name, nbpoints, cotation, nbpart) VALUES (1,1000, 'Voie4', 100, '4B', 4);
INSERT INTO voie (secteur_id, size, name, nbpoints, cotation, nbpart) VALUES (1,1000, 'Voie5', 300, '5D', 4);
INSERT INTO voie (secteur_id, size, name, nbpoints, cotation, nbpart) VALUES (2,1000, 'Voie6', 150, '6C', 4);
INSERT INTO voie (secteur_id, size, name, nbpoints, cotation, nbpart) VALUES (1,1000, 'Voie7', 100, '6D', 4);
INSERT INTO voie (secteur_id, size, name, nbpoints, cotation, nbpart) VALUES (1,1000, 'Voie8', 300, '7B', 4);
INSERT INTO voie (secteur_id, size, name, nbpoints, cotation, nbpart) VALUES (2,1000, 'Voie9', 150, '5A', 4);
INSERT INTO voie (secteur_id, size, name, nbpoints, cotation, nbpart) VALUES (1,1000, 'Voie10', 100, '5D', 4);
INSERT INTO voie (secteur_id, size, name, nbpoints, cotation, nbpart) VALUES (1,1000, 'Voie11', 300, '6A', 4);
INSERT INTO voie (secteur_id, size, name, nbpoints, cotation, nbpart) VALUES (2,1000, 'Voie12', 150, '6C', 4);
INSERT INTO voie (secteur_id, size, name, nbpoints, cotation, nbpart) VALUES (4,1000, 'Voie13', 100, '5B', 4);
INSERT INTO voie (secteur_id, size, name, nbpoints, cotation, nbpart) VALUES (5,1000, 'Voie14', 300, '5B', 4);
INSERT INTO voie (secteur_id, size, name, nbpoints, cotation, nbpart) VALUES (2,1000, 'Voie15', 150, '5B', 4);
INSERT INTO voie (secteur_id, size, name, nbpoints, cotation, nbpart) VALUES (1,1000, 'Voie16', 100, '5C', 4);
INSERT INTO voie (secteur_id, size, name, nbpoints, cotation, nbpart) VALUES (1,1000, 'Voie17', 300, '4A', 4);
INSERT INTO voie (secteur_id, size, name, nbpoints, cotation, nbpart) VALUES (2,1000, 'Voie18', 150, '5A', 4);
INSERT INTO voie (secteur_id, size, name, nbpoints, cotation, nbpart) VALUES (1,1000, 'Voie19', 100, '7A', 4);
INSERT INTO voie (secteur_id, size, name, nbpoints, cotation, nbpart) VALUES (1,1000, 'Voie20', 300, '6B', 4);
INSERT INTO voie (secteur_id, size, name, nbpoints, cotation, nbpart) VALUES (2,1000, 'Voie21', 150, '5C', 4);
INSERT INTO voie (secteur_id, size, name, nbpoints, cotation, nbpart) VALUES (3,1000, 'Voie22', 100, '5C', 4);
INSERT INTO voie (secteur_id, size, name, nbpoints, cotation, nbpart) VALUES (3,1000, 'Voie23', 300, '4A', 4);
INSERT INTO voie (secteur_id, size, name, nbpoints, cotation, nbpart) VALUES (3,1000, 'Voie24', 150, '5A', 4);
INSERT INTO voie (secteur_id, size, name, nbpoints, cotation, nbpart) VALUES (3,1000, 'Voie25', 100, '7A', 4);
INSERT INTO voie (secteur_id, size, name, nbpoints, cotation, nbpart) VALUES (3,1000, 'Voie26', 300, '6B', 4);
INSERT INTO voie (secteur_id, size, name, nbpoints, cotation, nbpart) VALUES (3,1000, 'Voie27', 150, '5C', 4);





