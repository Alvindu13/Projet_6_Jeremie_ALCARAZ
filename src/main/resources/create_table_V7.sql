
CREATE SEQUENCE public.image_image_id_seq;

CREATE TABLE public.Image (
                image_id INTEGER NOT NULL DEFAULT nextval('public.image_image_id_seq'),
                nom VARCHAR NOT NULL,
                content BYTEA NOT NULL,
                CONSTRAINT image_pk PRIMARY KEY (image_id)
);


ALTER SEQUENCE public.image_image_id_seq OWNED BY public.Image.image_id;

CREATE TABLE public.Utilisateur (
                utilisateur_id INTEGER NOT NULL,
                firstName VARCHAR NOT NULL,
                userName VARCHAR NOT NULL,
                lastName VARCHAR NOT NULL,
                nbTopo INTEGER,
                password VARCHAR NOT NULL,
                enabled INTEGER NOT NULL,
                CONSTRAINT utilisateur_pk PRIMARY KEY (utilisateur_id)
);


CREATE TABLE public.User_role (
                rolename VARCHAR(100) NOT NULL,
                utilisateur_id INTEGER NOT NULL
);


CREATE SEQUENCE public.topo_id_seq;

CREATE TABLE public.Topo (
                topo_id INTEGER NOT NULL DEFAULT nextval('public.topo_id_seq'),
                name VARCHAR(25) NOT NULL,
                nbSite INTEGER NOT NULL,
                nbSector INTEGER NOT NULL,
                available BOOLEAN NOT NULL,
                utilisateur_id INTEGER NOT NULL,
                CONSTRAINT topo_pk PRIMARY KEY (topo_id)
);


ALTER SEQUENCE public.topo_id_seq OWNED BY public.Topo.topo_id;

CREATE SEQUENCE public.site_name_seq;

CREATE TABLE public.Site (
                site_id INTEGER NOT NULL DEFAULT nextval('public.site_name_seq'),
                comment VARCHAR,
                topo_id INTEGER NOT NULL,
                name VARCHAR NOT NULL,
                location VARCHAR NOT NULL,
                nbSector INTEGER NOT NULL,
                nbWay INTEGER NOT NULL,
                cotation_minimum VARCHAR NOT NULL,
                cotation_maximum VARCHAR NOT NULL,
                way_size DOUBLE PRECISION NOT NULL,
                CONSTRAINT site_pk PRIMARY KEY (site_id)
);


ALTER SEQUENCE public.site_name_seq OWNED BY public.Site.site_id;

CREATE SEQUENCE public.secteur_name_seq;

CREATE TABLE public.Secteur (
                secteur_id INTEGER NOT NULL DEFAULT nextval('public.secteur_name_seq'),
                site_id INTEGER NOT NULL,
                nbWay INTEGER NOT NULL,
                name VARCHAR NOT NULL,
                CONSTRAINT secteur_pk PRIMARY KEY (secteur_id)
);


ALTER SEQUENCE public.secteur_name_seq OWNED BY public.Secteur.secteur_id;

CREATE SEQUENCE public.voie_name_seq;

CREATE TABLE public.Voie (
                voie_id INTEGER NOT NULL DEFAULT nextval('public.voie_name_seq'),
                secteur_id INTEGER NOT NULL,
                size DOUBLE PRECISION NOT NULL,
                name VARCHAR NOT NULL,
                nbPoints INTEGER NOT NULL,
                cotation VARCHAR(2) NOT NULL,
                nbPart INTEGER NOT NULL,
                CONSTRAINT voie_pk PRIMARY KEY (voie_id)
);


ALTER SEQUENCE public.voie_name_seq OWNED BY public.Voie.voie_id;

CREATE SEQUENCE public.longueur_id_seq;

CREATE TABLE public.Longueur (
                longueur_id INTEGER NOT NULL DEFAULT nextval('public.longueur_id_seq'),
                voie_id INTEGER NOT NULL,
                relayName VARCHAR NOT NULL,
                CONSTRAINT longueur_pk PRIMARY KEY (longueur_id)
);


ALTER SEQUENCE public.longueur_id_seq OWNED BY public.Longueur.longueur_id;

CREATE SEQUENCE public.commentaire_id_seq;

CREATE TABLE public.Commentaire (
                commentaire_id INTEGER NOT NULL DEFAULT nextval('public.commentaire_id_seq'),
                content VARCHAR NOT NULL,
                site_id INTEGER NOT NULL,
                utilisateur_id INTEGER NOT NULL,
                userName VARCHAR NOT NULL,
                CONSTRAINT commentaire_pk PRIMARY KEY (commentaire_id)
);


ALTER SEQUENCE public.commentaire_id_seq OWNED BY public.Commentaire.commentaire_id;

ALTER TABLE public.Topo ADD CONSTRAINT utilisateur_topo_fk
FOREIGN KEY (utilisateur_id)
REFERENCES public.Utilisateur (utilisateur_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.User_role ADD CONSTRAINT utilisateur_user_role_fk
FOREIGN KEY (utilisateur_id)
REFERENCES public.Utilisateur (utilisateur_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Commentaire ADD CONSTRAINT utilisateur_commentaire_fk
FOREIGN KEY (utilisateur_id)
REFERENCES public.Utilisateur (utilisateur_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Site ADD CONSTRAINT topo_site_fk
FOREIGN KEY (topo_id)
REFERENCES public.Topo (topo_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Secteur ADD CONSTRAINT site_secteur_fk
FOREIGN KEY (site_id)
REFERENCES public.Site (site_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Commentaire ADD CONSTRAINT site_commentaire_fk
FOREIGN KEY (site_id)
REFERENCES public.Site (site_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Voie ADD CONSTRAINT secteur_voie_fk
FOREIGN KEY (secteur_id)
REFERENCES public.Secteur (secteur_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Longueur ADD CONSTRAINT voie_longueur_fk
FOREIGN KEY (voie_id)
REFERENCES public.Voie (voie_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;